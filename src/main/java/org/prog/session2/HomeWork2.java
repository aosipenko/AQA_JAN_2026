package org.prog.session2;

import java.util.Random;

public class HomeWork2 {
    public static void main(String[] args) {
        Random random = new Random();
        int i;
        int j;
        do {
            i = random.nextInt(1000);
            j = random.nextInt(1000);
            System.out.println("i = " + i);
            System.out.println("j = " + j);
        }
        while ((i - j) % 7 != 0);
        {
            System.out.println("End");
        }

        while (true) {
            int a = random.nextInt(1000);
            int b = random.nextInt(1000);
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            if ((a - b) % 7 == 0) {

                System.out.println("End");
                break;
            }
        }
    }
}

//TODO: write cycle where:
// - On each cycle generate random i and random j up to 1000
// - If (i - j) % 7 -> stop the cycle (use break)+