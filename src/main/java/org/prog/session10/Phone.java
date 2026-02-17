package org.prog.session10;

import java.util.Objects;

public abstract class Phone {

    protected String model;
    protected String color;

    public Phone(String model, String color) {
        if (model == null || color == null) {
            throw new MyPhoneException("Model or color is null");
        }
        this.model = model;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Phone)) return false;
        Phone phone = (Phone) o;
        return Objects.equals(model, phone.model) &&
                Objects.equals(color, phone.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, color);
    }
}

