package org.prog.session10;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Карта: Владелец -> Список его уникальных телефонов
        Map<String, List<Phone>> registry = new HashMap<>();

        // Добавляем владельца и его девайсы
        registry.put("Alice", new ArrayList<>(Arrays.asList(
                new Phone("iPhone 15", "SN123"),
                new Phone("Pixel 8", "SN456")
        )));

        registry.put("Bob", new ArrayList<>(Arrays.asList(
                new Phone("Samsung S24", "SN789")
        )));

        // Вывод данных
        registry.forEach((owner, phones) -> {
            System.out.println(owner + " владеет: " + phones);
        });
    }
}


