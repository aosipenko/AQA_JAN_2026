package org.prog.session2;

import java.util.Random;

public class Homework2 {


    public static class Main {
        public static void main(String[] args) {
            Random random = new Random();

            while (true) {
                int i = random.nextInt(1001); // от 0 до 1000
                int j = random.nextInt(1001); // от 0 до 1000

                System.out.println("i = " + i + ", j = " + j);

                if ((i - j) % 7 == 0) {
                    System.out.println("Условие выполнено, цикл остановлен.");
                    break;
                }
            }
        }
    }

}
