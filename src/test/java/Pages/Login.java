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

    public Login(WebDriver driver) {
        this.driver = driver;
    }

    public  void clickLogin(){
        //LoginHeader_id.isDisplayed();
        LoginEmail_id.sendKeys("mos@gmail.com");
       /* LoginPassword_id.sendKeys("");
        LoginSubmit_id.click();*/
    }
}
