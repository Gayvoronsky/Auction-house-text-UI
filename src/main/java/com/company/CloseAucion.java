package com.company;

import java.util.Scanner;

//this class close auction

public class CloseAucion {
void close() throws InterruptedException {
    Scanner s = new Scanner(System.in);
    int i = s.nextInt();
    switch(i) {
        case 7:
            for (int j = 0; j < 5; j++) {
                System.out.println("Close...");
                Thread.sleep(1000);
            }
            System.out.println("----------------------------");
            System.out.println("--------Closed auction------");
            System.out.println("----------------------------");
    }

    }
}

