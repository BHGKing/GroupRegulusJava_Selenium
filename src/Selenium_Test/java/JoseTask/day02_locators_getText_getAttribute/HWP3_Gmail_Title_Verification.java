package JoseTask.day02_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWP3_Gmail_Title_Verification {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");

        WebElement gmailButton = driver.findElement(By.linkText("Gmail"));

        gmailButton.click();

        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();

        Thread.sleep(2000);

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Gmail Title Passed");
        } else {
            System.out.println("Gmail Title Failed");
        }

        Thread.sleep(2000);

        driver.navigate().back();

        expectedTitle = "Google";
        actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Google Title Passed!");
        } else {
            System.out.println("Google Title Failed!");
        }

        Thread.sleep(2000);

        driver.quit();

    }
}
/*
TC #3: Back and forth navigation
1- Open a Chrome browser
2- Go to: https://google.com
3- Click to Gmail from top right.
4- Verify title contains:
Expected: Gmail
5- Go back to Google by using the .back();
6- Verify title equals:
Expected: Google
 */
