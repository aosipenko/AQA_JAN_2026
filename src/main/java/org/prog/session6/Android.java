package org.prog.session6;


import java.util.Objects;


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