package org.prog.collections.session11;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {

        List<String> androids = new ArrayList<>();

        androids.add("black");
        androids.add("white");
        androids.add("blue");
        androids.add("green");
        androids.add("pink");
        androids.add("gray");
        androids.add("red");
        androids.add("silver");
        androids.add("purple");
        androids.add("orange");

        List<String> apples = new ArrayList<>();

        apples.add("black");
        apples.add("white");
        apples.add("blue");
        apples.add("green");
        apples.add("gold");
        apples.add("gray");
        apples.add("red");
        apples.add("silver");
        apples.add("purple");
        apples.add("orange");


        System.out.println("Pink Android есть? " + androids.contains("pink"));

        System.out.println("Gold Android есть? " + androids.contains("gold"));

        System.out.println("Pink Apple есть? " + apples.contains("pink"));
        System.out.println("Gold Apple есть? " + apples.contains("gold"));
    }
}