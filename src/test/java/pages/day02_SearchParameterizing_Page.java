package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class day02_SearchParameterizing_Page {
    public day02_SearchParameterizing_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "pz-form-input-AutocompleteInput")
    public WebElement searchBox;
    @FindBy(xpath = "(//button[normalize-space()='EN'])[1]")
    public WebElement english;
    @FindBy(css = "button[class='cc-nb-reject")
    public WebElement cerez;
    @FindBy(css = "img[class='mfp-close wis-mfp-close-244800")
    public WebElement reklam;
}
