package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class day04_DataTable_Page {
    public day04_DataTable_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//label[text()='Doğum Günü ']")
    public WebElement dogumGunu;
    @FindBy(css = "img.home-page-switch__extraImg")
    public WebElement hediye;
    @FindBy(xpath = "(//button[@class='ab-message-button'])[1]")
    public WebElement uyari;
    @FindBy(xpath = "(//a[@class='dropdown-toggle btn filter__button'])[4]")
    public WebElement renkler;
    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    public WebElement cerez;
    @FindBy(xpath = "//label[text()='Beyaz ']")
    public WebElement beyaz;
    @FindBy(xpath = "//label[text()='Kırmızı ']")
    public WebElement kirmizi;
    @FindBy(xpath = "//label[text()='Çok Renkli ']")
    public WebElement cokRenkli;
    @FindBy(xpath = "//label[text()='Gri ']")
    public WebElement gri;
    @FindBy(xpath = "//label[text()='Kahverengi ']")
    public WebElement kahverengi;
    @FindBy(xpath = "(//div[@class='product-search__inner-container']/child::input[@placeholder='Ürün veya kategori ara'])[1]")
    public WebElement aramaCubugu;
    @FindBy(xpath = "(//button[@class='js-product-search-button btn product-search__button'])[1]")
    public WebElement aramaButonu;
}
