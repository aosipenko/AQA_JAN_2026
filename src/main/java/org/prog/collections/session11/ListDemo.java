package org.prog.collections.session11;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {


        List<Phone> androids = new ArrayList<>();

        androids.add(new Phone("Samsung", "black"));
        androids.add(new Phone("Samsung", "white"));
        androids.add(new Phone("Samsung", "blue"));
        androids.add(new Phone("Samsung", "green"));
        androids.add(new Phone("Samsung", "pink"));
        androids.add(new Phone("Samsung", "gray"));
        androids.add(new Phone("Samsung", "red"));
        androids.add(new Phone("Samsung", "silver"));
        androids.add(new Phone("Samsung", "purple"));
        androids.add(new Phone("Samsung", "orange"));



        List<Phone> apples = new ArrayList<>();

        apples.add(new Phone("Apple", "black"));
        apples.add(new Phone("Apple", "white"));
        apples.add(new Phone("Apple", "blue"));
        apples.add(new Phone("Apple", "green"));
        apples.add(new Phone("Apple", "gold"));
        apples.add(new Phone("Apple", "gray"));
        apples.add(new Phone("Apple", "red"));
        apples.add(new Phone("Apple", "silver"));
        apples.add(new Phone("Apple", "purple"));
        apples.add(new Phone("Apple", "orange"));



        System.out.println("Pink Android есть: " +
                androids.contains(new Phone("Samsung", "pink")));

        System.out.println("Gold Android есть: " +
                androids.contains(new Phone("Samsung", "gold")));

        System.out.println("Pink Apple есть: " +
                apples.contains(new Phone("Apple", "pink")));

        System.out.println("Gold Apple есть: " +
                apples.contains(new Phone("Apple", "gold")));

    }
}