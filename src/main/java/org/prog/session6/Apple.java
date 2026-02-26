package org.prog.session6;
import java.util.Objects;

public class Apple extends Phone {


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