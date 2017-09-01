package com.company;

import java.sql.*;
import java.util.Scanner;

public class Main {

  static  String url = "jdbc:mysql://localhost:3306/bd";
   static  String user = "root";
    private static String password = "123456";

    static Connection con;
    static Statement stmt;
    static ResultSet rs;
    void bd5(){
        Scanner s = new Scanner(System.in);

        int i = s.nextInt();
        switch(i){
            case 6:

                System.out.println("Enter name table in ` exemple ` ");
                Scanner scanner = new Scanner(System.in);
                String view;
                view = scanner.next();
            String query = "select * from" + view;


            try {
                con = DriverManager.getConnection(url, user, password);
                stmt = con.createStatement();
                rs = stmt.executeQuery(query);

                while (rs.next()) {
                    int count1 = rs.getInt(1);
                    int count2 = rs.getInt(2);
                    int count3 = rs.getInt(3);
                    System.out.println("------|id: " + count1+"|------");
                    System.out.println("--------------------");
                    System.out.println("column 1: " + count2);
                    System.out.println("column 2: " + count3);
                    System.out.println("--------------------");
                }

            } catch (SQLException sqlEx) {
                sqlEx.printStackTrace();
            } finally {

                try { con.close(); } catch(SQLException se) {}
                try { stmt.close(); } catch(SQLException se) {}
                try { rs.close(); } catch(SQLException se) {}
            }
                System.out.println("Show all from table " + view);
            break;
        }
    }

    public static void main(String[] args) throws InterruptedException, SQLException {
        AddTable s = new AddTable();
        AddedPtoduct s2 = new AddedPtoduct();
        AddTable2 s3 = new AddTable2();
        Main s5 = new Main();
        Print print = new Print();
        bids b = new bids();
        CloseAucion close = new CloseAucion();
        //methods print
        print.menu();
        System.out.print("| ");
        print.seller();
        System.out.println("              |");
        System.out.print("| ");
        print.product();
        System.out.println("       |");
        System.out.print("| ");
        print.buyer();
        System.out.println("              |");
        System.out.print("| ");
        print.bids();
        System.out.println("                  |");
        System.out.print("| ");
        print.see();
        System.out.println("                 |");
        System.out.print("| ");
        print.close();
        System.out.println("             |");

        print.menu2();
        //

        s.bd();
        s2.bd2();
        s3.bd3();
        b.bids();
        s5.bd5();
        close.close();
    }
}


