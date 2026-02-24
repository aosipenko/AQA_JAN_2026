package org.prog.session8;

public class MaMain {
    public static void main (String[] args ) {
        Apple apple = new Apple();
        apple.model="14Pro";
        apple.color="blue";



        Android android = new Android();
        android.model="Galaxy s23";
        android.color="Red";

        android.unlockScreen();
        android.call("sonya");

        apple.unlockScreen();
        apple.call("sonya");










    }
}
