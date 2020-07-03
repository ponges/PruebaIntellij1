package Prueba;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Prueba {

    public static void main( String[] args){

        System.setProperty("webdriver.gecko.driver","C:\\Users\\niced\\Documents\\Drivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://en.wikipedia.org");

    }

}
