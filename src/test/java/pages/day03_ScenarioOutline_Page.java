package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class day03_ScenarioOutline_Page {

    public day03_ScenarioOutline_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//a[@class='header-top_cardIcon__CBiyn'])[1]")
    public WebElement loginIkon;
    @FindBy(css = "a[class='user-cart-active_link__Y0FkN")
    public WebElement uyeOl;
    @FindBy(css = "div[class=\"login-desktop_leftHeaderRegisterTitle__ABHjJ\"")
    public WebElement uyelikSayfasi;
    @FindBy(css = "input[placeholder='Adın Soyadın")
    public WebElement adSoyad;
    @FindBy(css = "input[placeholder='E-posta adresin")
    public WebElement eposta;
    @FindBy(css = "input[placeholder='Şifren")
    public WebElement password;
    @FindBy(css = "input[placeholder='Cep Telefonun")
    public WebElement cepTelefonu;
    @FindBy(xpath = "(//div[@class='checkbox_box__1NS2V'])[1]")
    public WebElement uyelikSozlesmesi;
    @FindBy(xpath = "(//span[@class='register-form_underlineText__7T9y6']/preceding-sibling::div/label[@class='checkbox_root__86e8X register-form_cBox__fwqZv'])[2]")
    public WebElement rizaMetni;
    @FindBy(css = "button[class='login-button_box__dnyuU register-form_registerSubmitButton__Aztsg']")
    public WebElement uyelikButton;
}
