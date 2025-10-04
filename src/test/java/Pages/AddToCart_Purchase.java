package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class AddToCart_Purchase {

    WebDriver driver;

    @FindBy (id = "add-to-cart-btn")
    WebElement addToCartButton_id;

    @FindBy(id = "review-cart-btn")
    WebElement reviewCartButton_id;

    @FindBy (id = "confirm-cart-btn")
    WebElement confirmCartButton_id;


    public AddToCart_Purchase(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAddToCart(){
        addToCartButton_id.click();
    }
    public void clickReviewCart(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(reviewCartButton_id));
        reviewCartButton_id.click();
    }
    public void clickConfirmCart(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(confirmCartButton_id));
        confirmCartButton_id.click();
    }
}
