package org.prog.session13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import java.util.List;

public class AlloTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        try {
            // 1. Load allo.ua
            driver.get("https://allo.ua");

            // 2. Search for iphone
            WebElement searchInput = driver.findElement(By.id("search-form__input"));
            searchInput.sendKeys("iphone");
            driver.findElement(By.className("search-form__submit-button")).click();

            // 3. Find prices for first 3 items
            // Используем селектор для актуальной цены
            List<WebElement> priceElements = driver.findElements(By.className("v-pb__cur"));

            for (int i = 0; i < 3; i++) {
                String priceText = priceElements.get(i).getText();
                System.out.println("Item " + (i + 1) + " price: " + priceText);

                // 4. Assert price not null (and not empty)
                Assert.assertNotNull(priceText, "Price for item " + i + " is null");
                Assert.assertFalse(priceText.isEmpty(), "Price for item " + i + " is empty");
            }
        } finally {
            driver.quit();
        }
    }
}
