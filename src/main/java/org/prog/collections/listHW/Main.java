package org.prog.collections.listHW;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Apple> apples = new ArrayList<>();
        List<Android> androids = new ArrayList<>();

        apples.add(new Apple("Red"));
        apples.add(new Apple("Blue"));
        apples.add(new Apple("Gold"));
        apples.add(new Apple("Purple"));
        apples.add(new Apple("Green"));
        apples.add(new Apple("Orange"));
        apples.add(new Apple("Yellow"));
        apples.add(new Apple("Silver"));
        apples.add(new Apple("Black"));
        apples.add(new Apple("Navy"));

        androids.add(new Android("Pink"));
        androids.add(new Android("Mint"));
        androids.add(new Android("Coral"));
        androids.add(new Android("White"));
        androids.add(new Android("Red"));
        androids.add(new Android("Brown"));
        androids.add(new Android("Gray"));
        androids.add(new Android("Turquoise"));
        androids.add(new Android("Beige"));
        androids.add(new Android("Maroon"));


        for (Apple apple : apples) {
            if (apple.color.equals("Gold")) {
                System.out.println(" Gold Apple found ");
            }
        }
        boolean pinkFound = false;
        for (Apple apple : apples) {
            if (apple.color.equals("Pink")) {
                pinkFound = true;
            }
        }
        if (!pinkFound) {
            System.out.println(" Pink Apple not found ");
        }
        for (Android android : androids) {
            if (android.color.equals("Pink")) {
                System.out.println(" Pink Android found ");
            }
        }
        boolean goldFound = false;
        for (Android android : androids) {
            if (android.color.equals("Gold")) {
                goldFound = true;
            }
        }
        if (!goldFound) {
            System.out.println(" Gold Android not found ");
        }
    }
}
