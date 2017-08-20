package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SQL4 {
    void bd4() {
        Connection connection = null;
        Statement statement = null;
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        switch (i) {
            case 4:
                System.out.println("enter name table in - ` exemple `");
                Scanner scannerString = new Scanner(System.in);
                String dropTableQuery1;
                dropTableQuery1 = scannerString.next();
                String dropTableQuery = "DROP TABLE bd." + dropTableQuery1 + "; ";
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    String url = "jdbc:mysql://localhost:3306/bd";
                    connection = DriverManager.getConnection(url, "root", "123456");
                    statement = connection.createStatement();
                    statement.executeUpdate(dropTableQuery);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {

                    if (statement != null) {
                        try {
                            statement.close();
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                    if (connection != null) {
                        try {
                            connection.close();
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }

                    }
                    System.out.println("Drop products in table" + dropTableQuery1);
                }
                break;
        }
    }
}
