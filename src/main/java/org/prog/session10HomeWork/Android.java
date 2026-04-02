package org.prog.session10HomeWork;

import java.util.Objects;

public class Android {

    public String color;
    public String model;

    public Android(String model, String color) {
        this.model = model;
        this.color = color;

    }


    @Override
    public boolean equals(Object obj) {

        if (color == null || model == null) {

            throw new MyPhoneException(" model/color is null ");
        }

        if (obj instanceof Android other) {
            if (other.color == null || other.model == null) {

                throw new MyPhoneException(" model/color is null ");
            }

            return this.color.equals(other.color) &&
                    this.model.equals(other.model);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (this.model + this.color).hashCode();
    }
}
