package org.prog.session81HW;

import java.util.Objects;

public class Apple implements IPhone {

    public String color;
    public String model;

    @Override
    public void call(String someone) {
        System.out.println(color + " phone " + model + " call " + someone);
    }

    @Override
    public void unlockScreen() {
        System.out.println(" screen is unlocked ");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Apple) {
            Apple other = (Apple) obj;
            System.out.println("Apple that initiates equals color: " + this.color);
            System.out.println("Apple that initiates equals model : " + this.model);
            return this.color.equals(other.color) &&
                    this.model.equals(other.model);
        }
        return false;
    }
    @Override
    public int hashCode(){
       return Objects.hash(model, color);
    }
}