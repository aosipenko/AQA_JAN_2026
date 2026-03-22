package org.prog.session18;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.Duration;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "org.prog.session18.steps"
)
public class CucumberRunner extends AbstractTestNGCucumberTests {

    private static Connection connection;
    public static WebDriver driver;

    @BeforeSuite
    public void beforeSuite() throws SQLException {


        String url = "jdbc:mysql://localhost:3306/test_db";
        String user = "root";
        String password = "root";

        connection = DriverManager.getConnection(url, user, password);
        System.out.println("DB connected");


        driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @AfterSuite
    public void afterSuite() throws SQLException {


        if (driver != null) {
            driver.quit();
        }


        if (connection != null) {
            connection.close();
            System.out.println("DB closed");
        }
    }

    public static Connection getConnection() {
        return connection;
    }
}