package org.prog.session8;

import java.util.Objects;

public class Android implements IPhone {

    private String model;
    private String color;

    public Android(String model, String color) {
        this.model = model;
        this.color = color;
    }

    @Override
    public void call(String someone) {
        System.out.println("Android звонит " + someone);
    }

    @Override
    public void unlockScreen() {
        System.out.println("Android разблокирован");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Android)) return false;
        Android android = (Android) o;
        return Objects.equals(model, android.model) &&
                Objects.equals(color, android.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, color);
    }
}
