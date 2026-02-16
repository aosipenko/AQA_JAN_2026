package org.prog.session2;

import java.util.Random;

public class ArrayDemo {

    public static void main(String[] args) {
        int[] ints = new int[50];
        Random random = new Random();
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(100);
        }


        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}
