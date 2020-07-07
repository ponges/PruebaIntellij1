package Prueba;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage {

    WebDriver driver;

    public ContactPage(WebDriver ldriver)
    {
        this.driver = ldriver;
    }
    @FindBy(name = "your name")
    WebElement yourname;
    @FindBy(name = "Email")
    WebElement email;
    @FindBy(name= "Phone number")
    WebElement phone;
    @FindBy(xpath = "//*[@id=\"inner_page\"]/div[2]/div/div/div[2]/div/form/fieldset/div[4]/textarea")
    WebElement massage;
    @FindBy(xpath = "//*[@id=\"inner_page\"]/div[2]/div/div/div[2]/div/form/fieldset/div[5]/div/button")
    WebElement loginButton;


    public void sendContactInfo(String yourNameApp, String emailApp, String phoneApp, String massageApp ){


        yourname.sendKeys(yourNameApp);
        email.sendKeys(emailApp);
        phone.sendKeys(phoneApp);
        massage.sendKeys(massageApp);
        loginButton.click();
    }
}
