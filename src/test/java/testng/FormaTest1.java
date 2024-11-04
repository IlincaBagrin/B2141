package testng;

import demoga.FormaPage1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FormaTest1 {
    public static WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\webdriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();


    }

    @Test
    public void FormaTest(){
        driver.get("https://demoqa.com/automation-practice-form");
        FormaPage1 formaPage = new FormaPage1(driver);
        formaPage.setFirstName("Anatolie");
        formaPage.setLastName("Anatolie");


    }

    @AfterClass
    public void close() {
        driver.quit();
    }
}
