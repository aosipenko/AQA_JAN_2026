package org.prog.session6;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Создаем массив грузовиков (используем твой класс Car)
        Car[] trucks = new Car[3];

        // Заполняем данными
        trucks[0] = new Car("Иван Иванов", "Volvo FH16", "AA1234BB");
        trucks[1] = new Car("Петр Петров", "Scania R500", "BC7777CB");
        trucks[2] = new Car("Андрей Сидоров", "MAN TGX", "AI5505EX");

        // Выводим информацию, используя метод getFullDetails и сохраняя в String
        for (Car truck : trucks) {
            String details = truck.getFullDetails();
            System.out.println(details);
        }

        // Пример вызова твоего метода goTo
        trucks[0].goTo("Base");
    }
}