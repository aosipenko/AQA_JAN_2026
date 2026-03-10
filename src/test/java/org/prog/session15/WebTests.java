package org.prog.session15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class WebTests {

    private WebDriver driver;

    @BeforeSuite
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterSuite
    public void close() {
        driver.quit();
    }

    @Test
    public void alloTest() {

        driver.get("https://allo.ua/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement search = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("search-form__input"))
        );

        search.sendKeys("iphone");
        search.sendKeys(Keys.ENTER);

        List<WebElement> products = wait.until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".product-card"))
        );

        for (int i = 0; i < 3; i++) {

            WebElement product = products.get(i);

            WebElement title = product.findElement(By.cssSelector(".product-card__title"));
            WebElement price = product.findElement(By.cssSelector(".sum"));

            System.out.println("Product " + (i + 1) + ": " + title.getText());
            System.out.println(price.getText());

            Assert.assertNotNull(price.getText());
        }
    }

    @Test
    public void iFrameTest() {

        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.switchTo().frame("iframeResult");

        driver.switchTo().frame(0);

        WebElement header = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.tagName("h1"))
        );

        Assert.assertNotNull(header);

        driver.switchTo().defaultContent();
    }

    @Test
    public void myWebTest() {

        driver.get("https://www.w3schools.com/cssref/tryit.php?filename=trycss_sel_hover");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.switchTo().frame(0);

        Actions actions = new Actions(driver);

        WebElement link1 = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.linkText("w3schools.com"))
        );

        WebElement link2 = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.linkText("wikipedia.org"))
        );

        actions.moveToElement(link1)
                .pause(Duration.ofSeconds(2))
                .moveToElement(link2)
                .pause(Duration.ofSeconds(2))
                .perform();

        driver.switchTo().defaultContent();
    }
}
