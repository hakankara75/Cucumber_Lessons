package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Amazon_Page {

    public Amazon_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "a[href='/gp/new-releases/?ref_=nav_cs_newreleases")
    public WebElement yeniCikanlar;
    @FindBy(xpath = "//div[@class='p13n-sc-truncate-desktop-type2  p13n-sc-truncated']")
    public List<WebElement> urunler;
}
