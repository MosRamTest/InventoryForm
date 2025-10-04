package Tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class MosTest extends Base {

    @Test
    public void verifyHomePageIsDisplayedTests() {

        homePage.verifyHomePageIsDisplayed();
        // Wait for all elements to load before taking screenshot
        new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(webDriver -> ((JavascriptExecutor) webDriver)
                        .executeScript("return document.readyState").equals("complete"));
        takesScreenshots.takesSnapShot(driver, "Home Page");

    }

    @Test(priority = 1)
    public void clickLearningMaterialTest() {

        homePage.clickLearningMaterial();
        takesScreenshots.takesSnapShot(driver, "Learning Material Page");
    }

    /*     @Test(priority = 2)
        public void SignUpTest() {
            signUp.clickSignUpToggle();
        }

        @Test(priority = 3)
        public void enterPasswordTest() {
            signUp.enterPassword( "King1234");
        }
    @Test (priority = 4)
        public void enterConfirmPasswordTest() {
            signUp.enterConfirmPassword( "King1234");
        }
        @Test (priority = 5)
        public void clickSingUpSubmitTest() {
            signUp.clickSignUpSubmit();
        }*/
    @Test(priority = 2)
    public void EnterLoginDetailsTest() {
        login.EnterLoginDetails("  king@gmail.com ", " King1234 ");
        takesScreenshots.takesSnapShot(driver, "Login Page");

    }

    @Test(priority = 3)
    public void clickLoginSubmitTest() {

        login.clickLoginSubmit();
        takesScreenshots.takesSnapShot(driver, "Successful Login Page");

    }

    @Test(priority = 4)
    public void clickWebAutomationTest() {
        selectDevice.clickWebAutomation();
        takesScreenshots.takesSnapShot(driver, "Web Automation Page");

    }

    @Test(priority = 5)
    public void scrollUp() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,500)");

    }

    @Test(priority = 6)
    public void selectDeviceTypeTest() {
        selectDevice.selectDeviceType("phone");
        takesScreenshots.takesSnapShot(driver, "Select Device Page");

    }

    @Test(priority = 7)
    public void selectBrandTest() {

        selectDevice.selectBrand("apple");
        takesScreenshots.takesSnapShot(driver, "Select Brand");

    }

    @Test(priority = 8)
    public void selectStorageTest() {
        selectDevice.selectStorage("256GB");
        takesScreenshots.takesSnapShot(driver, "Select Storage");

    }

    @Test(priority = 9)
    public void selectColorTest() {
        selectDevice.selectColor("gold");
    }

    @Test(priority = 10)
    public void selectQuantityTest() {
        selectDevice.selectQuantity("2");
    }

    @Test(priority = 11)
    public void emailAddressTest() {
        selectDevice.enterEmailAddress("king@gmail.com");
    }

    @Test(priority = 12)
    public void clickNextButtonTest() {
        selectDevice.clickNextButton();
    }

    @Test(priority = 13)
    public void scrollDown() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,500)");

    }

    @Test(priority = 14)
    public void clickAddToCartTest() {
        addToCart_purchase.clickAddToCart();
    }

    @Test(priority = 15)
    public void clickReviewCartTest() {
        addToCart_purchase.clickReviewCart();
    }

    @Test(priority = 16)
    public void clickConfirmCartTest() {

        addToCart_purchase.clickConfirmCart();
        takesScreenshots.takesSnapShot(driver, "Order Confirmation Page");

    }

    @Test(priority = 17)
    public void clickInvoiceButtonTest() {
        invoiceTest.clickInvoiceButton();
    }

    @Test(priority = 18)
    public void viewInvoiceSummaryTest() {

        invoiceTest.viewInvoiceSummary();
        new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(webDriver -> ((JavascriptExecutor) webDriver)
                        .executeScript("return document.readyState").equals("complete"));
        takesScreenshots.takesSnapShot(driver, "Invoice Summary Page");

    }

    @Test(priority = 19)
    public void saveInvoiceAsPDFTest() {
        invoiceTest.saveInvoiceAsPDF();
    }

    @Test(priority = 20)
    public void closeInvoiceSummaryTest() {
        invoiceTest.closeInvoiceSummary();
    }

    @Test(priority = 21)
    public void scrollUp2() throws InterruptedException {
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,-500)");

    }

    @Test(priority = 22)
    public void clickLogoutButtonTest() {

        logout.clickLogoutButton();
        takesScreenshots.takesSnapShot(driver, "Logout Page");
    }

    @AfterTest
    public void tearDown(){driver.quit();}
}
