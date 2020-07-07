package Prueba;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class BrowserFactory {

    public static WebDriver startApplication(WebDriver driver, String browserName, String appURL)
    {
        if (browserName.equals("Chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if (browserName.equals("FireFox"))
        {
            System.setProperty("webdriver.chrome.driver", "Drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        }
        else if (browserName.equals("IE"))
        {
            System.setProperty("webdriver.ie.driver", "Drivers/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }
        else
        {
            System.out.println("Browser is not supported");
        }
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(appURL);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        return driver;
    }
    public static void quitBrowser(WebDriver driver)
    {
        driver.quit();
    }
}
