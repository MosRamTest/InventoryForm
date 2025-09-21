package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    WebDriver driver;
    @FindBy(id = "overview-hero")
     WebElement homePageTitle_id;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyHomePageIsDisplayed(WebElement homePageTitle_id) {
        this.homePageTitle_id = homePageTitle_id;
    }
}
