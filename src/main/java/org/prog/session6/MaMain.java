package org.prog.session6;

public class MaMain {
    public static void main (String[] args ) {
        Apple apple = new Apple();
        apple.model="14Pro";
        apple.color="blue";


        Android android = new Android();
        android.model="Galaxy s23";
        android.color="Red";


        apple.plugIn(apple);

        android.plugIn(android);












        apple.plugIn(() -> System.out.println("Зарядка от повербанка через кабель"));


        android.unlockScreen();
        android.call("sonya");

        apple.unlockScreen();
        apple.call("sonya");










    }
}