import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Form {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Software\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");
        driver.findElement(By.id("first-name")).sendKeys("Suresh Kumar");
        driver.findElement(By.id("last-name")).sendKeys("Kalyanarajan");
        driver.findElement(By.id("job-title")).sendKeys("Trainer");
        driver.findElement(By.id("radio-button-2")).click();
        driver.findElement(By.id("checkbox-2")).click();
        driver.findElement(By.cssSelector("option[value='4']")).click();
        driver.findElement(By.id("datepicker")).sendKeys("08/02/2023");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement alert = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert")));
        String alertText = alert.getText();

        assertEquals("The form was successfully submitted!", alertText);
        driver.quit();
    }

}
