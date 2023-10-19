package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class day09_cucumberReport_Page {

    public day09_cucumberReport_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//button[@aria-label='Tümünü Kabul Et']")
    public WebElement cerezler;
}
