package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//this class create table

public class SQL {

    void bd() throws InterruptedException {
        Connection connection = null;
        Statement statement = null;
        Scanner s = new Scanner(System.in);

        int i = s.nextInt();
        switch (i) {
            case 1:
                System.out.println("Enter name table in ` exemple ` ");
                Scanner scanner = new Scanner(System.in);
                String createTableQuery1;
                createTableQuery1 = scanner.next();
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("named column 1 - ` exemple ` ");
                String b;
                b = scanner1.next();
                System.out.println("name column 2 - ` exemple `");
                String c;
                c = scanner1.next();
                String createTableQuery = "CREATE TABLE bd." + createTableQuery1 + "(" +
                       " id int(11)," +
                        b +"   int(11)," +
                        c + "  int(11)," +
                        "  PRIMARY KEY  (`id`)" +
                        ") ENGINE=InnoDB DEFAULT CHARSET=utf8;";
                    try {

                        Class.forName("com.mysql.jdbc.Driver");
                        String url = "jdbc:mysql://localhost:3306/bd";
                        connection = DriverManager.getConnection(url, "root", "123456");
                        statement = connection.createStatement();
                        statement.executeUpdate(createTableQuery);
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
                        System.out.println("Created table" + createTableQuery1);
                    }
                    break;
                }

        }
    }
