package org.prog.session13.JUnitHW;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JUnitTest {

    @Test
    public void testApple(){
        Apple apple = new Apple();
        Assertions.assertTrue(apple.modelNumber >= 3);

    }
}
