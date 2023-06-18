package JoseTask.day02_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWP2_ZeroBank_Header_Verification {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://zero.webappsecurity.com/login.html");

        WebElement headerText = driver.findElement(By.tagName("h3"));

        String expectedHeader = "Log in to ZeroBank";
        String actualHeader = headerText.getText();

        Thread.sleep(2000);

        if (actualHeader.equals(expectedHeader)){
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

        driver.quit();

    }
}
/*
HWP #2: Zero Bank header verification
1. Open Chrome browser
2. Go to http://zero.webappsecurity.com/login.html
3. Verify header text
Expected: “Log in to ZeroBank”
 */