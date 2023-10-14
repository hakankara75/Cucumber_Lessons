package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class day05_Hooks_Page {
    public day05_Hooks_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(css = "input[data-testid='suggestion")
    public WebElement searchBox;
    @FindBy(xpath = "//div[@class='dscrptn dscrptn-V2']/h1")
    public WebElement aramaSonucuUrunIsmı;
    @FindBy(css = "div[class='srch-ttl-cntnr-wrppr")
    public WebElement aramaSonucuTamami;
    @FindBy(css = "div[class='image-overlay-body")
    public WebElement urun;
    @FindBy(css = "svg[width")
    public WebElement reklam;
    @FindBy(id = "onetrust-accept-btn-handler")
    public WebElement cerezler;
}
