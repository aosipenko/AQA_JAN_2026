package org.prog.session3;

import java.util.Arrays;

public class HW2 {
    public static void main(String[] args) {

        int i = 0;
        int[] array = new int[]{
                7, // i = 0
                14,// i = 1
                3, // i = 2
                19,// i = 3
                11,// i = 4
                2, // i = 5
                1, // i = 6
                9  // i = 7
        };
        boolean condition = true;
        while (condition) {
            condition = false;
            for (i = 0; i < array.length - 1; i++) {

                if (array[i] > array[i + 1]) {
                    int current = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = current;
                    condition = true;

                }
            }
        }
        System.out.println(Arrays.toString(array));

    }
}
