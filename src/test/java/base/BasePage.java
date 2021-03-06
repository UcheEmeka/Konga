package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

public class BasePage {

    private WebDriver driver;
    public HomePage homePage;

    //Initialize WebDriver, open the browser  & go to the URL before conducting the test
    @BeforeClass
    public void setup()
    {
        System.setProperty("webdriver.gecko.driver", "E:/test_automation/resources/geckodriver2.exe");
        //Initializing WebDriver
        driver = new FirefoxDriver();

        //Maximize web browser
        driver.manage().window().maximize();
        //Open URL on browser
        driver.get("https://www.konga.com/");
        homePage = new HomePage(driver);
    }

    //Close WebDriver and browser after completing the test
    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}
