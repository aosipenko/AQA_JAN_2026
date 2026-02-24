package org.prog.session10;

class Phone {
    String model;
    String serialNumber;

    Phone(String model, String serialNumber) {
        this.model = model;
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return model + " (SN: " + serialNumber + ")";
    }
}

