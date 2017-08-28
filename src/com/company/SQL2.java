package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//this class create product for table

public class SQL2  {
    void bd2() {
        Connection connection = null;
        Statement statement = null;
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        switch (i) {
            case 2:
                System.out.println("enter name table in - ` exemple `");
                Scanner scannerString = new Scanner(System.in);
                String createTableQuery1;
                createTableQuery1 = scannerString.next();
                System.out.println("enter id");
                Scanner scanner = new Scanner(System.in);
                int a;
                a = scanner.nextInt();
                System.out.println("enter column 1");
                String b;
                b = scanner.next();
                System.out.println("enter column 2");
                String c;
                c = scanner.next();
                String createColumnQuery = "INSERT INTO bd." + createTableQuery1 + " (id, number, name)" +
                    "VALUES (" + a + "," + b+"," + c + ")";
                try {
                    String url = "jdbc:mysql://localhost:3306/bd";
                    connection = DriverManager.getConnection(url, "root", "123456");
                    statement = connection.createStatement();
                    statement.executeUpdate(createColumnQuery);
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
                    System.out.println("Added products in table" + createTableQuery1);
                }
                break;
        }
    }
}