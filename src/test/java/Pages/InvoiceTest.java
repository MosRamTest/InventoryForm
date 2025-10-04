package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class InvoiceTest {

    WebDriver driver;

    @FindBy(id = "view-history-btn")
    WebElement viewInvoiceButton_id;

    @FindBy(xpath = "(//button[normalize-space(text())='\uD83D\uDC41\uFE0F View'])[1]\n")
    WebElement invoice_id;

    @FindBy(xpath = "(//button[contains(text(), 'Save as PDF')])[1]\n")
    WebElement savePDF_id;

    @FindBy (id = "close-invoice-history-btn")
    WebElement closeInvoice_id;

    public InvoiceTest(WebDriver driver) {
        this.driver = driver;
    }

    public void clickInvoiceButton() {
        // Switch to default tab (first window handle)

        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(viewInvoiceButton_id));
        viewInvoiceButton_id.click();
    }

    public void viewInvoiceSummary() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(invoice_id));
        invoice_id.click();
        //driver.back();
    }
    public void saveInvoiceAsPDF() {
        String defaultTab = driver.getWindowHandles().iterator().next();
        driver.switchTo().window(defaultTab);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(savePDF_id));
        savePDF_id.click();
    }
    public void closeInvoiceSummary() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(closeInvoice_id));
        closeInvoice_id.click();
    }

}
