package org.prog.session3;

import java.util.Arrays;
import java.util.Random;

public class Homework3 {
    public static class BubbleSort {
        public static void main(String[] args) {
            int[] myArrayToSort = new int[10];
            Random random = new Random();

            for (int i = 0; i < myArrayToSort.length; i++) {
                myArrayToSort[i] = random.nextInt(100);
            }
            System.out.println("До сортировки:");
            System.out.println(Arrays.toString(myArrayToSort));
            boolean condition = true;

            while (condition) {
                condition = false;

                for (int i = 0; i < myArrayToSort.length - 1; i++) {

                    if (myArrayToSort[i] > myArrayToSort[i + 1]) {

                        int temp = myArrayToSort[i];
                        myArrayToSort[i] = myArrayToSort[i + 1];
                        myArrayToSort[i + 1] = temp;

                        condition = true;
                    }
                }
            }

            System.out.println("После сортировки:");
            System.out.println(Arrays.toString(myArrayToSort));
        }
    }

}
