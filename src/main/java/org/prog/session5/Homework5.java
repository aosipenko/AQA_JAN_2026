package org.prog.session5;

public class Homework5 {

    public static void main(String[] args) {
        Homework5 car = new Homework5("black", 100, "AA1234BB", "Sebastian");
        car.goTo("Kyiv", 60);
    }

    public String color;
    public int mileage;
    public String plateNumber;
    public String owner;

    public Homework5(String color, int mileage, String plateNumber, String owner) {
        this.color = color;
        this.mileage = mileage;
        this.plateNumber = plateNumber;
        this.owner = owner;
    }

    public void goTo(String destination, int speed) {
        System.out.println("Before trip miles: " + mileage);

        if ("black".equals(color)) {
            System.out.println("Black cars are cool");
        }

        mileage += speed * 10;

        System.out.println(
                "Car owned by " + owner +
                        " is going to " + destination +
                        " with speed " + speed
        );
    }
}