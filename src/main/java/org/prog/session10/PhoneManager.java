package org.prog.session10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;




public class PhoneManager {

    record Phone(String brand, String model, String color) {

        public static void main(String[] args) {
            // Список Android (10 шт)
            List<Phone> androids = new ArrayList<>();
            androids.add(new Phone("Google", "Pixel 9", "Pink")); // Розовый Android
            androids.add(new Phone("Samsung", "S24 Ultra", "Titanium Black"));
            androids.add(new Phone("Motorola", "Edge 50 Pro", "Black"));
            androids.add(new Phone("OnePlus", "12R", "Blue"));
            androids.add(new Phone("Xiaomi", "14", "Green"));
            androids.add(new Phone("Nothing", "Phone (2)", "Grey"));
            androids.add(new Phone("Sony", "Xperia 1 V", "Khaki"));
            androids.add(new Phone("Oppo", "Reno12", "Silver"));
            androids.add(new Phone("Google", "Pixel 8a", "Aloe"));
            androids.add(new Phone("Samsung", "A55", "Navy"));

            // Список Apple (10 шт)
            List<Phone> apples = new ArrayList<>();
            apples.add(new Phone("Apple", "iPhone 16 Pro", "Gold")); // Золотой Apple
            apples.add(new Phone("Apple", "iPhone 15", "Blue"));
            apples.add(new Phone("Apple", "iPhone 14", "Yellow"));
            apples.add(new Phone("Apple", "iPhone 13", "Midnight"));
            apples.add(new Phone("Apple", "iPhone 12", "Purple"));
            apples.add(new Phone("Apple", "iPhone 11", "Green"));
            apples.add(new Phone("Apple", "iPhone SE", "Red"));
            apples.add(new Phone("Apple", "iPhone XR", "White"));
            apples.add(new Phone("Apple", "iPhone 15 Pro", "Natural Titanium"));
            apples.add(new Phone("Apple", "iPhone 14 Plus", "Starlight"));

            // 1. Confirm pink android is in the list
            boolean hasPinkAndroid = androids.stream().anyMatch(p -> p.color().equalsIgnoreCase("Pink"));
            System.out.println("1. Pink Android exists: " + hasPinkAndroid);


            boolean noGoldAndroid = androids.stream().noneMatch(p -> p.color().equalsIgnoreCase("Gold"));
            System.out.println("2. Gold Android NOT in list: " + noGoldAndroid);


            boolean hasGoldApple = apples.stream().anyMatch(p -> p.color().equalsIgnoreCase("Gold"));
            boolean noPinkApple = apples.stream().noneMatch(p -> p.color().equalsIgnoreCase("Pink"));
            System.out.println("3a. Gold Apple exists: " + hasGoldApple);
            System.out.println("3b. Pink Apple NOT in list: " + noPinkApple);
        }


    }



}
