package org.prog.session10HomeWork;

public class Main {
    public static void main(String[] args) {

        Apple apple1 = new Apple(" IPhone 13 ", " Black ");
        Apple apple2 = new Apple(" IPhone 13 ", " Black ");
        Android android1 = new Android(" Samsung E13 ", " Pink");
        Android android2 = new Android(" Motorola ", null);

        try {
         boolean b1 = apple1.equals(apple2);
         String result = b1 ? " yes " : " no ";
            System.out.println(result);
        } catch (MyPhoneException e) {

            System.out.println(" Oops! ");

        }
        try {
           boolean b2 =  android1.equals(android2);
           String result = b2 ? "yes" : "no";
            System.out.println(result);
        } catch (MyPhoneException e) {
            System.out.println(" Oops! ");
        }
        System.out.println(apple1.hashCode());
        System.out.println(apple2.hashCode());
        System.out.println(android1.hashCode());
        System.out.println(android2.hashCode());
    }
}
