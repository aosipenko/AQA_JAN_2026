package org.prog.session2;
import java.util.Random;

public class Home {
    public static void main(String[] args) {
        Random random = new Random();

        while (true) {
            int i = random.nextInt(1001); // от 0 до 1000
            int j = random.nextInt(1001);

            System.out.println("i: " + i + ", j: " + j + " (diff: " + (i - j) + ")");

            // Цикл остановится, если разница НЕ кратна 7
            if ((i - j) % 7 != 0) {
                break;
            }
        }
    }

}
