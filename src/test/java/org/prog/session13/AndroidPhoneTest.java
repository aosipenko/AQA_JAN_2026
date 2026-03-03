package org.prog.session13;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AndroidPhoneTest {
    @Test
    // todo: write test that confirms model number is 3 or above
    public void testModelNumberIsThreeOrAbove() {
        AndroidPhone phone = new AndroidPhone();
        int model = phone.getModelNumber();

        // Проверяем, что число >= 3
        assertTrue(model >= 3, "Model number should be 3 or above, but was: " + model);
    }

}
