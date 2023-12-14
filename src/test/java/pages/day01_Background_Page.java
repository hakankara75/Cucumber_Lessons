package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class day01_Background_Page {

    public day01_Background_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(css = "i[class='etsfonticon login-user']")
    public WebElement dropDown;
    @FindBy(css = "button[data-target='#modalSignIn']")
    public WebElement giris;
    @FindBy(css = "button[data-target='#modalSignUp']")
    public WebElement uyeOl;
    @FindBy(css = "efilli-layout-etstur[class='efilli-layout-etstur")
    public WebElement shadowRoot;
    @FindBy(xpath = "//div[text()='Kabul Et']")
    public WebElement kabulEt;
    @FindBy(id = "tb-contactEmailSignIn")
    public WebElement email;
    @FindBy(id = "showPass_2")
    public WebElement password;
    @FindBy(id = "btn-signin")
    public WebElement girisYap;
    @FindBy(id = "tb-signUp-firstName")
    public WebElement ad;
    @FindBy(id = "tb-signUp-lastName")
    public WebElement soyad;
    @FindBy(id = "tb-contactEmailSignUp")
    public WebElement uyelikEmail;
    @FindBy(id = "contactFormPhoneNumber")
    public WebElement uyelikPhone;
    @FindBy(id = "showPass_0")
    public WebElement uyelikPassword;
    @FindBy(id = "showPass_1")
    public WebElement uyelikPasswordTekrar;
    @FindBy(xpath = "//a[@class='agreement-usage']/preceding-sibling::span[@class='span-for-checkbox']")
    public WebElement kullanimSartlari;
    @FindBy(xpath = "//label[@for='cb-dealCampaign']/span[@class='span-for-checkbox']")
    public WebElement firsatlar;
    @FindBy(id = "btn-signup")
    public WebElement uyeOlButton;

}
