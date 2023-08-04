import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Form_clean_bak {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Software\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://formy-project.herokuapp.com/form");

        submitForm(driver);

        waitForAlertBanner(driver);

     //   getAlertBannerText(driver);

        assertEquals("The form was successfully submitted!", getAlertBannerText(driver));
        driver.quit();
    }

    public static void submitForm(WebDriver driver) {
        driver.findElement(By.id("first-name")).sendKeys("Suresh Kumar");
        driver.findElement(By.id("last-name")).sendKeys("Kalyanarajan");
        driver.findElement(By.id("job-title")).sendKeys("Trainer");
        driver.findElement(By.id("radio-button-2")).click();
        driver.findElement(By.id("checkbox-2")).click();
        driver.findElement(By.cssSelector("option[value='4']")).click();
        driver.findElement(By.id("datepicker")).sendKeys("08/02/2023");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
    }

    public static void waitForAlertBanner(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert")));
    }

    public static String getAlertBannerText(WebDriver driver) {
        return driver.findElement(By.className("alert")).getText();
    }

}
