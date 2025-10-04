/*package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

import java.util.ArrayList;
import java.util.List;

public class TabSwitcher {

    WebDriver driver = new ChromeDriver();
    List<String> tabs;

    public void switchToPreviousTab() {
        driver.get("https://www.ndosiautomation.co.za/#practice");
        ((JavascriptExecutor) driver).executeScript("window.open('blob:https://www.ndosiautomation.co.za/cba19060-8238-4d50-9946-2250b806b8eb','_blank');");

        tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1)); // Move to 2nd tab
        driver.switchTo().window(tabs.get(0)); // Switch back to 1st tab
    }

    public void quit() {
        driver.quit();
    }


} */