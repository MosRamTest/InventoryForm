package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class Logout {

    WebDriver driver;

    @FindBy(id = "logout-button")
    WebElement logoutButton_id;


    public Logout(WebDriver driver) {
        this.driver = driver;
    }

    //
    public void clickLogoutButton() {
      //  new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(logoutButton_id));
        logoutButton_id.click();
    }
}

