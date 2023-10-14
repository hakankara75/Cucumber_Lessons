package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class day07ParalelTest_Page {

    public day07ParalelTest_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(css = "input[placeholder='Marka, ürün veya hizmet ara...")
    public WebElement searchBox;
    @FindBy(id = "Username")
    public WebElement email;
    @FindBy(id = "Password")
    public WebElement sifre;
    @FindBy(id = "submit-button")
    public WebElement devamButonu;
    @FindBy(css = "button[class='btn btn-xs btn-primary !h-auto leading-snug py-1")
    public WebElement cerez;
    @FindBy(xpath = "(//span[@name='heart'])[1]")
    public WebElement favori;
    @FindBy(xpath = "(//button[@class='dn-slide-accept-btn'])[1]")
    public WebElement evet;
    @FindBy(xpath = "(//button[@type='button'])[5]")
    public WebElement sepeteEkle;
}
