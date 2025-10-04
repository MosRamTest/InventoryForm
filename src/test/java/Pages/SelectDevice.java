package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class SelectDevice {

    WebDriver driver;

    @FindBy(id = "tab-btn-web")
    WebElement WebAutomationButton_id;

    @FindBy (id = "deviceType")
    WebElement deviceType_id;

    @FindBy (id = "brand")
    WebElement brand_id;

    @FindBy (id = "storage-256GB")
    WebElement storage_id;

    @FindBy (id = "color")
    WebElement color_id;

    @FindBy (id = "quantity")
    WebElement quantity_id;

    @FindBy (id = "address")
    WebElement address_id;

    @FindBy (id = "inventory-next-btn")
    WebElement nextButton_id;

    public SelectDevice(WebDriver driver) {
        this.driver = driver;
    }
    public void clickWebAutomation() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(WebAutomationButton_id));
        WebAutomationButton_id.click();
    }

    public void selectDeviceType(String deviceType){
        deviceType_id.sendKeys(deviceType);
    }
    public void selectBrand(String brand){
        brand_id.sendKeys(brand);
    }
    public void selectStorage(String storage){
        storage_id.click();
    }
    public void selectColor(String color){
        color_id.sendKeys(color);
    }
    public void selectQuantity(String quantity){
        quantity_id.clear();
        quantity_id.sendKeys(quantity);
    }
    public void enterEmailAddress(String address){
        address_id.sendKeys(address);
    }
    public void clickNextButton(){
        nextButton_id.click();
    }
}
