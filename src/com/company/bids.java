package com.company;

import java.util.Scanner;

//this class allows enter bids for table.

public class bids {
    void bids(){
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        switch(i){
            case 4:
                System.out.println("---Enter bids---");
                Scanner b = new Scanner(System.in);
                int o = b.nextInt();
                switch(o){
                    default:
                        System.out.println("Ok,no problem.We will consider your offer");
                        break;
                }
                break;
        }
    }


}
