package org.prog.session3;
import java.util.Arrays;
import java.util.Random;

public class Home2 {
    public static void main(String[] args) {
        int size = 10;
        int[] arr = new int[size];
        Random random = new Random();

        // 1. Заполняем массив случайными числами от 0 до 99
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(100);
        }

        System.out.println("До сортировки: " + Arrays.toString(arr));

        // 2. Пузырьковая сортировка
        bubbleSort(arr);

        System.out.println("После сортировки: " + Arrays.toString(arr));
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            // Флаг для оптимизации (если за проход не было обменов, массив отсортирован)
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Меняем элементы местами
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}