package org.prog.session13;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlloSearchTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Укажите путь к вашему драйверу, если он не в PATH
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void searchForIphone() {
        // 1. Переход на сайт allo.ua
        driver.get("https://allo.ua");

        // 2. Поиск инпута (используем ID или CSS селектор)
        // Локатор для строки поиска на Allo: id="search-form__input"
        WebElement searchInput = driver.findElement(By.id("search-form__input"));

        // 3. Поиск iPhone 17 Pro Max
        searchInput.sendKeys("iphone 17 pro max");
        searchInput.sendKeys(Keys.ENTER);

        // Здесь можно добавить проверку (Assertion) результатов
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

