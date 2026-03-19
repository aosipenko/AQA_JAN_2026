package org.prog.session13;

public class PhoneRecord {
    private String model;
    private int price;

    public PhoneRecord(String model, int price) {
        this.model = model;
        this.price = price;
    }
    public int getPrice() { return price; }
    public String getModel() { return model; }
}
