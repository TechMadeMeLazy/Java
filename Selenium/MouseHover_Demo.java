package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

/**
 * Programs to perform Mouse hover operation on element.
 */
public class MouseHover_Demo{    
    public static void main(String[] args) throws InterruptedException {
        /* Create driver object */
        System.setProperty("webdriver.chrome.driver", "C:\\Tech_Made_Me_Lazy\\Lib\\Browser_Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        /* Add 10 seconds implicit wait */
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        /* Maximize the browser window */
        driver.manage().window().maximize();

        /* Navigate to URL */
        driver.get("http://demowebshop.tricentis.com/");

        /* Create actions object for performing Mouse and Keyword related activities */
        Actions actions = new Actions(driver);

        /* Computers menu button */
        WebElement computers_menu = driver.findElement(By.partialLinkText("COMPUTERS"));

        /* Perform mouse over operation on 'Computers' menu button */
        actions.moveToElement(computers_menu)
                .perform();

        /* Sleep for 5 Seconds */
        Thread.sleep(5000);

        /* Electronics menu button */
        WebElement electronics_menu = driver.findElement(By.partialLinkText("ELECTRONICS"));

        /* Perform mouse over operation on 'Electronics' menu button */
        actions.moveToElement(electronics_menu)
                .perform();

        /* Sleep for 5 Seconds */
        Thread.sleep(5000);

        /* Quit the browser window */
        driver.quit();
    }
}