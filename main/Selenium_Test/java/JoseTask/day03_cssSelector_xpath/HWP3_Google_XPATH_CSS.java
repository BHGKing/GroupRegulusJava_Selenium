package JoseTask.day03_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HWP3_Google_XPATH_CSS {
    public static void main(String[] args) {

    //TC #3: Back and forth navigation
    //1- Open a Chrome browser
    WebDriver driver = WebDriverFactory.getDriver("chrome");
    driver.manage().window().maximize();

    //2- Go to: https://google.com
    driver.get("https://google.com");

    //3- Click to Gmail from top right.
    //Locating the Gmail link using "xpath" locator
        //tagName[@attribute='value']
    //WebElement gmailLink = driver.findElement(By.xpath("//a[@href='https://mail.google.com/mail/&ogbl']"));

    //Using the text of the web element with XPATH locator
    //tagName[text()='textValue'] --> //tagName[.='textValue']
    //WebElement gmailLink = driver.findElement(By.xpath("//a[text()='Gmail']"));
    //WebElement gmailLink = driver.findElement(By.xpath("//a[.='Gmail']"));

    //Locating the Gmail link using "cssSelector" locator
    // --> tagName[attribute='value']
    WebElement gmailLink = driver.findElement(By.cssSelector("a[href='https://mail.google.com/mail/&ogbl']"));



    //Click to the gmail link
    gmailLink.click();

    //4- Verify title contains:
    //Expected: Gmail
    String expectedGmailTitle = "Gmail";
    String actualGmailTitle = driver.getTitle();

    //System.out.println("actualGmailTitle = " + actualGmailTitle);

    if (actualGmailTitle.contains(expectedGmailTitle)){
        System.out.println("Gmail title verification PASSED!");
    }else {
        System.out.println("Gmail title verification FAILED!!!");
    }

    //5- Go back to Google by using the .back();
    driver.navigate().back();

    //6- Verify title equals:
    //Expected: Google
    String expectedTitle = "Google";
    String actualTitle = driver.getTitle();

    if (actualTitle.equals(expectedTitle)){
        System.out.println("Google title verification PASSED!");
    }else{
        System.out.println("Google title verification FAILED!!!");
    }

    driver.close();
}
}
