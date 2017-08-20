package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//this class create 2 table with params

public class SQL3 {
    void bd3() throws InterruptedException {
        Connection connection = null;
        Statement statement = null;
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        switch (i) {
            case 3:
                System.out.println("enter name for table in - `  `");
                Scanner scanner = new Scanner(System.in);
                String a;
                a = scanner.next();
                System.out.println("enter name for column 1 in");
                String b;
                b = scanner.next();
                System.out.println("enter name for column 2 in");
                String c;
                c = scanner.next();
                System.out.println("enter name for column 3 in - `  `");
                String d;
                d = scanner.next();
                String createTableQuery = "CREATE TABLE bd." + a +"(" +
                        b + "   int(11)," +
                        c + "   int(11)," +
                        d +"   varchar(45) DEFAULT NULL," +
                        "  PRIMARY KEY  (`id`)" +
                        ") ENGINE=InnoDB DEFAULT CHARSET=utf8;";

                System.out.println("enter name for table 2 in - `  `");
                Scanner scanner1 = new Scanner(System.in);
                String a1;
                a1 = scanner1.next();
                System.out.println("enter id for column 1");
                String b1;
                b1 = scanner1.next();
                System.out.println("enter number for column 2");
                String c1;
                c1 = scanner1.next();
                System.out.println("enter name for column 3 in - `  `");
                String d1;
                d1 = scanner1.next();
                String createTableQuery2 = "CREATE TABLE " + a1 + "(" +
                        b1 + "   int(11)," +
                        c1 + "   int(11)," +
                        d1 +"   varchar(45) DEFAULT NULL," +
                        "  PRIMARY KEY  (`id`)" +
                        ") ENGINE=InnoDB DEFAULT CHARSET=utf8;";
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    String url = "jdbc:mysql://localhost:3306/bd";
                    connection = DriverManager.getConnection(url, "root", "123456");
                    statement = connection.createStatement();
                    statement.executeUpdate(createTableQuery);
                    statement.executeUpdate(createTableQuery2);
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

                }
                System.out.println("Created tables " + a + " and " + a1);
                break;

        }
    }
}