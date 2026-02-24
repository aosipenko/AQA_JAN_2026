package org.prog.session6;

public class Car {
    String ownerName;
    String model;
    String plateNumber;
    public Car(String ownerName, String model, String plateNumber) {
        this.ownerName = ownerName;
        this.model = model;
        this.plateNumber = plateNumber;
    }
    public String getFullDetails() {
        return "Владелец: " + ownerName + ", Модель: " + model + ", Номер: " + plateNumber;
    }
    public CarModel carModel;
    public CarOwner carOwner;
    public CarTechSummary techSummary;
    public CarDimensions dimensions;
    public String milege;

    public void goTo(String destination) {
        System.out.println("Going to " + destination);
    }

    public void smth() {
        goTo("Home");
    }

}
