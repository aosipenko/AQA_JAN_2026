package org.prog.session9;

import java.util.Objects;
interface Chargeable {
    void charge();
}




abstract class Phone implements Chargeable {
    public String model;
    public String color;

    public void plugIn(Chargeable charger) {
        System.out.print(model + " connected: ");
        charger.charge();
    }

    public void unlockScreen() {
        System.out.println("Unlock FaceID on" + color + " Phone");}

    public abstract void charge();
}

class Apple extends Phone {

    @Override
    public void charge() {
        System.out.println("Зарядка через Lightning или MagSafe");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apple apple = (Apple) o;
        return Objects.equals(model, apple.model) && Objects.equals(color, apple.color);
    }
    @Override
    public int hashCode() {
        return Objects.hash(model, color);
    }

    public void call(String someone) {
        System.out.println("Phone " + model + " call " + someone);
    }


}
class Android extends Phone {
    @Override
    public void charge() {
        System.out.println("Зарядка через USB-C");
    }



    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Android android = (Android) o;
        return Objects.equals(model, android.model) && Objects.equals(color, android.color);
    }
    public int hashCode() {
        return Objects.hash(model, color);
    }



    public void call(String someone) {
        System.out.println("Phone " + model + " call " + someone);
    }




}