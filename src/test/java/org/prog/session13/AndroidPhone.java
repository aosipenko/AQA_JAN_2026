package org.prog.session13;

import java.util.Random;

public class AndroidPhone {
    private int modelNumber;

    public AndroidPhone() {
        // todo: assign model as random 1-5
        Random random = new Random();
        this.modelNumber = random.nextInt(5) + 1; // [0-4] + 1 = [1-5]
    }

    public int getModelNumber() {
        return modelNumber;
    }

}
