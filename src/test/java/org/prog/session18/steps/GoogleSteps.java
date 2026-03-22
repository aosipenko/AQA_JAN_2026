package org.prog.session18.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.prog.session18.CucumberRunner;

import java.time.Duration;
import java.util.List;

public class GoogleSteps {


    @Given("I open allo")
    public void i_open_allo() {
        CucumberRunner.driver.get("https://allo.ua/");
    }


    @Given("I search iphone")
    public void i_search_iphone() {

        WebDriverWait wait = new WebDriverWait(CucumberRunner.driver, Duration.ofSeconds(10));

        WebElement search = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("search-form__input"))
        );

        search.sendKeys("iphone");
        search.sendKeys(Keys.ENTER);
    }


    @Then("I check first 3 phones")
    public void checkPhones() {

        WebDriverWait wait = new WebDriverWait(CucumberRunner.driver, Duration.ofSeconds(15));


        List<WebElement> products = wait.until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(
                        By.cssSelector("div.product-card")
                )
        );

        for (int i = 0; i < 3; i++) {

            WebElement price = products.get(i).findElement(
                    By.cssSelector("span.sum")
            );

            System.out.println("Price: " + price.getText());
        }
    }
}