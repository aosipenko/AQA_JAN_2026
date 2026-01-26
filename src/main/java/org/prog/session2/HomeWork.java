package org.prog.session2;

import java.util.Random;

public class HomeWork {

    public static void main(String[] args) {

        int i;
        int j;
        Random random = new Random();

        while (true) {
            i = random.nextInt(1000);
            j = random.nextInt(1000);

            System.out.println("i = " + i);
            System.out.println("j = " + j);

            if ((i - j) % 7 == 0) {
                System.out.println("Break=)");
                break;
            }
        }
    }
}


