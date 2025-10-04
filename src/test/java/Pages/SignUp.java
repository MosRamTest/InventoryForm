package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class SignUp {


    WebDriver driver;

    @FindBy(id = "signup-toggle")
    WebElement signUpToggle_id;

    @FindBy(id = "register-firstName")
    WebElement signUpName_id;

    @FindBy(id = "register-lastName")
    WebElement signUpLastName_id;

    @FindBy(id = "register-email")
    WebElement signUpEmail_id;

    @FindBy (id = "register-password")
    WebElement signUpPassword_id;

    @FindBy (id = "register-confirmPassword")
    WebElement signUpConfirmPassword_id;

    @FindBy (id = "register-submit")
    WebElement signUpSubmit_id;

    public SignUp(WebDriver driver) {
        this.driver = driver;
    }
    public void clickSignUpToggle() {
      //  new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(signUpToggle_id));
        signUpToggle_id.click();
        signUpName_id.sendKeys("King");
        signUpLastName_id.sendKeys("Solomon");
        signUpEmail_id.sendKeys("king@gmail.com");

    }
    public void enterPassword(String password){
        signUpPassword_id.sendKeys(password);
    }
    public void enterConfirmPassword(String confirmPassword){
        signUpConfirmPassword_id.sendKeys(confirmPassword);
    }
    public void clickSignUpSubmit(){
        signUpSubmit_id.click();
    }




}
