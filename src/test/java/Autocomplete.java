import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class Autocomplete {
    public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver", "C:\\Software\\Selenium\\chromedriver_win32\\chromedriver.exe");
    //   ChromeDriverService service = new ChromeDriverService.Builder()
     //           .withBuildCheckDisabled(true)
       //         .build();

       WebDriver driver = new ChromeDriver();
       driver.get("https://formy-project.herokuapp.com/autocomplete");
       WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.click();
       autocomplete.sendKeys("AP1277, 77th Street, 12th Sector");
       // implicit wait statement
      //  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
     //  WebElement autocompleteResult = driver.findElement(By.xpath("//*[@id=\"autocomplete\"]//div[2]"));
      // autocompleteResult.click();

        // Explicit wait statement
      //  WebDriverWait wait = new WebDriverWait(driver,10);
      //  WebElement autocompleteResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\\\"autocomplete\\\"]//div[2]")));
       // autocompleteResult.click();

        driver.quit();
    }
}
