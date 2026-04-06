package org.prog.session13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class JUnitTests {

    private Random random = new Random();

    @Test
    public void testModelNumber() {

        Apple phone = new Apple("black", 111);

        int model = random.nextInt(5) + 1;

        phone.setModelNumber(model);

        Assertions.assertTrue(phone.getModelNumber() >= 3);

        System.out.println("Model number = " + phone.getModelNumber());
    }
}