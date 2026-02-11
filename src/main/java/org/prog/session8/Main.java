package org.prog.session8;

public class Main {

    public static void main(String[] args) {

        IPhone android = new Android("Samsung Galaxy S25", "Black");
        IPhone apple = new Apple("iPhone 16 Pro", "Silver");

        android.call("Виктор");
        android.unlockScreen();

        System.out.println("----------------");

        apple.call("Алексей");
        apple.unlockScreen();

        IPhone anotherApple = new Apple("iPhone 16 Pro", "Silver");

        System.out.println("apple equals anotherApple: "
                + apple.equals(anotherApple));
    }
}
