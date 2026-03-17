package org.prog.session16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;

public class PageObjectTests {

    private WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }

    @Test
    public void alloTest() {

        AlloPage alloPage = new AlloPage(driver);

        alloPage.openSite();
        alloPage.searchProduct("iphone");

        List<WebElement> products = alloPage.getProducts();

        for (int i = 0; i < 3; i++) {

            WebElement product = products.get(i);

            String title = alloPage.getTitle(product);
            String price = alloPage.getPrice(product);

            System.out.println(title);
            System.out.println(price);

            Assert.assertNotNull(price);
        }
    }
}