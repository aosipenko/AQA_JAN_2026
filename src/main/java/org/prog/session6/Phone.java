package org.prog.session6;

import java.util.Objects;





abstract class Phone implements Chargeable {
    public String model;
    public String color;

    public void plugIn(Chargeable charger) {
        System.out.print(model + " connected: ");
        charger.charge();
    }



    public void unlockScreen() {
        System.out.println("Unlock FaceID on" + color + " Phone");}

    public abstract void charge();
}


