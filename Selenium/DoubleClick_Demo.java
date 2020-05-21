package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

/**
 * Programs to perform Double Click on Web page.
 */
public class DoubleClick_Demo {
    public static void main(String[] args) throws InterruptedException {

        final String chromedriverPath = "C:\\Tech_Made_Me_Lazy\\Lib\\Browser_Drivers\\chromedriver.exe",
                URL = "http://testautomationpractice.blogspot.com/";

        /* Create driver object */
        System.setProperty("webdriver.chrome.driver", chromedriverPath);
        WebDriver driver = new ChromeDriver();

        /* Add 10 seconds implicit wait */
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        /* Maximize the browser window */
        driver.manage().window().maximize();

        /* Navigate to URL */
        driver.get(URL);
        
        /* Field 1 text box */
        WebElement field_1_text = driver.findElement(By.id("field1"));
        /* Copy Text button */
        WebElement copyText_button = driver.findElement(By.xpath("//button[contains(text(),'Copy Text')]"));

        /* Clear Field 1 */
        field_1_text.clear();

        /* Enter text in Field 1 */
        field_1_text.sendKeys("Hello Tech Made Me Lazy");

        /* Create actions object for performing Mouse and Keyword related activities */
        Actions actions = new Actions(driver);

        /* Move to Copy Text button */
        actions.moveToElement(copyText_button).perform();

        /* Perform double click operation on Copy Text button */
        actions.doubleClick(copyText_button).perform();

        /* Sleep for 5 Seconds */
        Thread.sleep(5000);

        /* Quit the browser window */
        driver.quit();
    }
}