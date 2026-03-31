package org.prog.collections.session11;

public class Phone {

    String brand;
    String color;

    public Phone(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        Phone phone = (Phone) o;
        return brand.equals(phone.brand) &&
                color.equals(phone.color);
    }
}