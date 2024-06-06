package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Day11_Hooks_After_Before_Scenraio_StepDefinition_Page {


    public Day11_Hooks_After_Before_Scenraio_StepDefinition_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(css = "#username")
    public WebElement username;
    @FindBy(css = "#password")
    public WebElement password;
    @FindBy(css = "input[value='Login']")
    public WebElement login;
    @FindBy(css = "a[href='https://practice.automationtesting.in/shop/']")
    public WebElement shop;
    @FindBy(css = "a[href='https://practice.automationtesting.in/product/android-quick-start-guide/']")
    public WebElement productClass;
    @FindBy(css = "a[href='/shop/?add-to-cart=169']")
    public WebElement android;
    @FindBy(css = "a[title='View your shopping cart']")
    public WebElement basket;
    @FindBy(xpath = "//h3[normalize-space()='Android Quick Start Guide']")
    public WebElement product;
    @FindBy(css = "td[class='product-name'] a")
    public WebElement productInBasket;
}
