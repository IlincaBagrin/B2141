package testng;

import demoga.FormaPage1;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.SeleniumDriver;

public class FormaTest1 {
    public static WebDriver driver;

    public static Logger logger = Logger.getLogger(FormaTest1.class);

    @BeforeClass
    public void beforeClass() {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\webdriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//        driver = new ChromeDriver(options);
//        driver.manage().window().maximize();

        driver = SeleniumDriver.getRemoteDriver();


    }

    @Test
    public void FormaTest() throws InterruptedException {
        logger.info("Start Test");
        driver.get("https://demoqa.com/automation-practice-form");
        FormaPage1 formaPage = new FormaPage1(driver);
        formaPage.setFirstName("Anatolie");
        Thread.sleep(2000);
        formaPage.setLastName("Anatolie");
        Thread.sleep(2000);


    }

    @AfterClass
    public void close() {
        driver.quit();
    }
}
