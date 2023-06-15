package JoseTask.day03_cssSelector_xpath;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

public class HWP1_Etsy_Xpath_CSS {

    public static void main(String[] args) {

        //HWP #1: Etsy Title Verification
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to https://www.etsy.com
        driver.get("https://www.etsy.com");

        //3. Search for “wooden spoon”

        //XPATH LOCATOR EXAMPLES
        //tag[@attribute='value']
        //WebElement searchBox = driver.findElement(By.xpath("//input[@type='text']"));
        //WebElement searchBox = driver.findElement(By.xpath("//input[@data-id='search-query']"));
        //WebElement searchBox = driver.findElement(By.xpath("//input[@id='global-enhancements-search-query']"));
        //WebElement searchBox = driver.findElement(By.xpath("//input[@name='search_query']"));
        //WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Search for anything']"));

        //input[@type='text']
        //*[@type='text']

        //cssSelector locator
        //syntax #1 : tagName[attribute='value']
        //syntax #2 : for id: --> tag#idValue, for class: tag.classValue
        //WebElement searchBox = driver.findElement(By.cssSelector("input[id='global-enhancements-search-query']"));
        WebElement searchBox = driver.findElement(By.cssSelector("input#global-enhancements-search-query"));


        searchBox.sendKeys("wooden spoon" + Keys.ENTER);

        //4. Verify title:
        //Expected: “Wooden spoon - Etsy”
        String expectedTitle = "Wooden spoon - Etsy";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification passed!");
        }else{
            System.out.println("Title verification FAILED!!!");
        }

        driver.quit();

    }
}
