package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {

    WebDriver driver;

    @FindBy(id = "login-heading")
    WebElement LoginHeader_id;

    @FindBy(id = "login-email")
    WebElement LoginEmail_id;

    @FindBy(id = "login-password")
    WebElement LoginPassword_id;

    @FindBy(id = "login-submit")
    WebElement LoginSubmit_id;

    @FindBy (id = "login-submit")
    WebElement LoginButton_id;

    public Login(WebDriver driver) {
        this.driver = driver;
    }

    public  void EnterLoginDetails( String email, String password){
        LoginEmail_id.sendKeys(email);
        LoginPassword_id.sendKeys(password);

    }
    public void clickLoginSubmit(){
        LoginSubmit_id.click();
    }
}
