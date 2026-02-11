package org.prog.session8;

import java.util.Objects;

public class Apple implements IPhone {

    private String model;
    private String color;

    public Apple(String model, String color) {
        this.model = model;
        this.color = color;
    }

    @Override
    public void call(String someone) {
        System.out.println("iPhone звонит " + someone);
    }

    @Override
    public void unlockScreen() {
        System.out.println("iPhone разблокирован Face ID");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Apple apple)) return false;
        return Objects.equals(model, apple.model) &&
                Objects.equals(color, apple.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, color);
    }
}

