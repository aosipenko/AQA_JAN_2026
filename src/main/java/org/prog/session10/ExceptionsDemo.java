package org.prog.session10;

public class ExceptionsDemo {

    public static void main(String[] args) {

        try {
            Phone phone1 = new Apple("iPhone 15", "Black");
            Phone phone2 = new Android(null, "White"); // тут будет ошибка

            System.out.println(phone1.equals(phone2));

        } catch (MyPhoneException e) {
            System.out.println("oops!");
        }

        System.out.println("Program finished");
    }
}
