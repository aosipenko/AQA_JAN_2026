package org.prog.session6;

public class Truck {

    public String model;
    public String name;        // владелец
    public String plateNumber; // номер машины

    public void setTruckInfo(String m, String n, String p) {
        model = m;
        name = n;
        plateNumber = p;
    }


    public String getTruckInfo() {
        return "Owner: " + name + ", Model: " + model + ", Plate: " + plateNumber;
    }

    public void delivery(String from, String to) {
        System.out.println("Delivering from " + from + " to " + to + " by " + name);
    }

    public static void main(String[] args) {
        Truck[] trucks = new Truck[2];

        trucks[0] = new Truck();
        trucks[0].setTruckInfo("Volvo", "Ivan", "AB1234CD");

        trucks[1] = new Truck();
        trucks[1].setTruckInfo("MAN", "Petro", "XY5678ZT");

        for (Truck t : trucks) {
            System.out.println(t.getTruckInfo());
            t.delivery("Kyiv", "Lviv");
        }
    }
}