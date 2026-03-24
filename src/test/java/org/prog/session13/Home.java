package org.prog.session13;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class Home {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            // 1. Поиск iPhone
            driver.get("https://allo.ua");
            WebElement searchInput = driver.findElement(By.id("search-form__input"));
            searchInput.sendKeys("iphone", Keys.ENTER);

            // 2. Ждем появления карточек товаров
            // Селектор .product-card__content более стабилен для получения данных
            List<WebElement> products = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
                    By.cssSelector(".product-card")));

            for (int i = 0; i < 3; i++) {
                WebElement item = products.get(i);

                // Извлекаем название и цену (используем актуальные классы Allo)
                String modelName = item.findElement(By.cssSelector(".product-card__title")).getText();
                String priceText = item.findElement(By.cssSelector(".v-pb__cur")).getText()
                        .replaceAll("[^0-9]", "");

                int currentPrice = Integer.parseInt(priceText);

                // 3. Логика работы с БД (DatabaseUtils должен быть реализован отдельно)
                PhoneRecord dbRecord = DatabaseUtils.getPhoneByModel(modelName);

                if (dbRecord != null) {
                    if (currentPrice != dbRecord.getPrice()) {
                        throw new AssertionError("Ошибка цены для " + modelName +
                                ": в БД " + dbRecord.getPrice() + ", на сайте " + currentPrice);
                    }
                    System.out.println("Цена совпадает для: " + modelName);
                } else {
                    // 4. Записываем в БД, если модели нет
                    DatabaseUtils.savePhone(modelName, currentPrice);
                    System.out.println("Добавлена новая модель: " + modelName + " (" + currentPrice + ")");
                }
            }
        } finally {
            driver.quit();
        }
    }
}