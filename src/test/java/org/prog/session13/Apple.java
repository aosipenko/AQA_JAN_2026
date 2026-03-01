package org.prog.session13;

public class Apple {

    private String color;
    private int number;
    private int modelNumber;

    public Apple(String color, int number) {
        this.color = color;
        this.number = number;
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }
}