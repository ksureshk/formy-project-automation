import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
// import org.openqa.selenium.chrome.ChromeDriverService;

public class ScrollToElement {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Software\\Selenium\\chromedriver_win32\\chromedriver.exe");
//       ChromeDriverService service = new ChromeDriverService.Builder()
//                .withBuildCheckDisabled(true)
//                .build();

        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/scroll");
        WebElement name = driver.findElement(By.id("name"));
        Actions action = new Actions(driver);
        action.moveToElement(name);
        name.sendKeys("Suresh Kumar");

        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("07/31/2023");
        Thread.sleep(1000);

        driver.quit();
    }
}
