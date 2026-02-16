package org.prog.session81HW;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Android android = new Android();
        Apple apple1 = new Apple();
        Android android1 = new Android();

        android.color = " red ";
        android.model = " Samsung Galaxy S23 ";
        apple.color = " blue ";
        apple.model = " iPhone 17Pro ";

        android1.color = "blue";
        android1.model = " Samsung Galaxy S23 ";
        apple1.color = " blue ";
        apple1.model = " iPhone 17Pro ";

        unlockandCall(android);
        unlockandCall(apple);
        android.equals(android1);
        apple.equals(apple1);

        System.out.println("===========================");
        System.out.println(android.equals(android1));
        System.out.println("===========================");
        System.out.println(apple.equals(apple1));

        System.out.println(apple.hashCode());
        System.out.println(apple1.hashCode());
        System.out.println("===========================");
        System.out.println(android.hashCode());
        System.out.println(android1.hashCode());
    }

    public static void unlockandCall(IPhone phone) {
        phone.unlockScreen();
        phone.call("Lisa");
    }


}


