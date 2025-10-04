package Tests;

import Pages.*;

import Utils.BrowserFactory;
import Utils.TakesScreenshots;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();
    final WebDriver driver = browserFactory.startBrowser("chrome", "https://www.ndosiautomation.co.za/");
    HomePage homePage= PageFactory.initElements(driver,HomePage.class);
    SignUp signUp = PageFactory.initElements(driver,SignUp.class);
    Login login = PageFactory.initElements(driver,Login.class);
    SelectDevice selectDevice = PageFactory.initElements(driver,SelectDevice.class);
    AddToCart_Purchase addToCart_purchase = PageFactory.initElements(driver,AddToCart_Purchase.class);
    InvoiceTest invoiceTest = PageFactory.initElements(driver,InvoiceTest.class);
    //TabSwitcher tabSwitcher = PageFactory.initElements(driver,TabSwitcher.class);
    Logout logout = PageFactory.initElements(driver,Logout.class);
    TakesScreenshots takesScreenshots = new TakesScreenshots();




}
