import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Software\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropdownMenu = driver.findElement(By.id("dropdownMenuButton"));
        dropdownMenu.click();
        Thread.sleep(1000);
        WebElement autoComplete = driver.findElement(By.id("autocomplete"));
        autoComplete.click();
        Thread.sleep(3000);
        driver.quit();

    }
}
