package Prueba;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClass {

    public WebDriver driver;

    @BeforeClass
    public void openDriver()
    {
        driver = BrowserFactory.startApplication(driver, "Chrome","http://localhost:9080/contact.html");
    }
    @AfterClass
    public void closeDriver()
    {
        BrowserFactory.quitBrowser(driver);
    }
}
