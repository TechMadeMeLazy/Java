package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

/**
 * Programs to perform Context Click / Right mouse button click.
 */
public class ContextClick_Demo {
    public static void main(String[] args) throws InterruptedException {
        /* Create driver object */
        System.setProperty("webdriver.chrome.driver", "C:\\Tech_Made_Me_Lazy\\Lib\\Browser_Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

		/* Add 10 seconds implicit wait */
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        /* Maximize the browser window */
        driver.manage().window().maximize();
		
        /* Navigate to URL */
        driver.get("http://demo.guru99.com/test/simple_context_menu.html");       

        /* Create actions object for performing Mouse and Keyword related activities */
        Actions actions = new Actions(driver);

        /* 1. Mouse to Element
           2. Context Click or Right Mouse Button Click
           3. Press Keyboard Down Arrow button
         */
        actions.moveToElement(driver.findElement(By.xpath("//span[text()='right click me']")))
                .contextClick(driver.findElement(By.xpath("//span[text()='right click me']")))
                .sendKeys(Keys.ARROW_DOWN)
                .build()
                .perform();

        /* 1. Mouse to Element
           2. Context Click or Right Mouse Button Click
           3. Press Keyboard Down Arrow button
           4. Press Keyboard Enter key button
         */
        /*actions.moveToElement(driver.findElement(By.xpath("//span[text()='right click me']")))
                .contextClick(driver.findElement(By.xpath("//span[text()='right click me']")))
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ENTER)
                .build()
                .perform();*/

        /* Sleep for 5 Seconds */
        Thread.sleep(5000);

        /* Quit the browser window */
        driver.quit();
    }
}