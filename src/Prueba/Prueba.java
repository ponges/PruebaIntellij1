package Prueba;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Prueba extends BaseClass{
    /*
    public static void main( String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\niced\\Documents\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://en.wikipedia.org");
    }
     */
    @Test(priority=1, description = "Completar Datos de Contacto y enviar Formulario")
    public void SendContacts()
    {
        ContactPage contactPage = PageFactory.initElements(driver,ContactPage.class );
        contactPage.sendContactInfo("Nicolas Brown","ponges@gmail.com","47765425","Hola Mundo!");
    }



}
