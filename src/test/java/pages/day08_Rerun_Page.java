package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class day08_Rerun_Page {
/*
bu derste extend yaparak ortak metot kullanimi yap tum sayfalari
 */
@FindBy(id = "myGlobalSearchBtn")
public WebElement arama;
    @FindBy(css = "h2[class='h-title mb-0")
    public WebElement aramaSonucu;

    @FindBy(css = "div[class='detail-content-inner")
    public List<WebElement> haberIcerigi;
    @FindBy(css = "div[class='last-minute-post-list-items item-two-col")
    public List<WebElement> haberList;

}
