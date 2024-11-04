package demoga;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormaPage1 {public static WebDriver driver;

    @FindBy(id = "firstName")
    private WebElement firstNameEl;

    @FindBy(id = "lastName")
    private WebElement lastNameEl;

    @FindBy(id = "userEmail")
    private WebElement userEmailEl;

    @FindBy(id = "gender-radio-1")
    private WebElement genderMaleEl;

    @FindBy(id = "id-state")
    private WebElement idstateEl;


    public FormaPage1(WebDriver driver) {
        FormaPage1.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setFirstName(String firstNameParam) {
        firstNameEl.sendKeys(firstNameParam);
    }

    public void setLastName(String lastNameParam) {
        lastNameEl.sendKeys(lastNameParam);
    }

    public void setEmail(String firstNameParam) {
        userEmailEl.sendKeys(firstNameParam);
    }
    public void setgenderMale(String firstNameParam) {
        genderMaleEl.sendKeys(firstNameParam);
    }
}
