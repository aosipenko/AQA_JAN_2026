package org.prog.session16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AlloPage {

    private WebDriver driver;

    public AlloPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openSite() {
        driver.get("https://allo.ua/");
    }

    public void searchProduct(String text) {
        WebElement search = driver.findElement(By.id("search-form__input"));
        search.sendKeys(text);
        search.submit();
    }

    public List<WebElement> getProducts() {
        return driver.findElements(By.cssSelector(".product-card"));
    }

    public String getTitle(WebElement product) {
        return product.findElement(By.cssSelector(".product-card__title")).getText();
    }

    public String getPrice(WebElement product) {
        return product.findElement(By.cssSelector(".product-card__price")).getText();
    }

}