package org.prog.session8;

import java.util.Objects;



class Phone {
    public String model;
    public String color;

    public void unlockScreen() {
        System.out.println("Unlock FaceID on" + color + " Phone");}

}

class Apple extends Phone {

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apple apple = (Apple) o;
        return Objects.equals(model, apple.model) && Objects.equals(color, apple.color);
    }
    public int hashCode() {
        return Objects.hash(model, color);
    }

    public void call(String someone) {
        System.out.println("Phone " + model + " call " + someone);
    }


}
class Android extends Phone {
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