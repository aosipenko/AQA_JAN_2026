package org.prog.session13.JUnitHW;

import java.util.Random;

public class Apple {
    public int modelNumber;
    public Apple(){
        Random random = new Random();
        this.modelNumber = random.nextInt(5) + 1;

    }
}
