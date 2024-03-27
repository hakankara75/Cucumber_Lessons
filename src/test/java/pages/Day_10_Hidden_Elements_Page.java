package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

import static org.junit.Assert.*;

public class Day_10_Hidden_Elements_Page {
    public Day_10_Hidden_Elements_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(css = "[placeholder='Username']")
    public WebElement username;
    @FindBy(css = "[placeholder='Password']")
    public WebElement password;
    @FindBy(css = "button[type='submit']")
    public WebElement loginButton;
    @FindBy(css = ".oxd-text.oxd-text--h6.oxd-topbar-header-breadcrumb-module")
    public WebElement dashboard;
    @FindBy(css = "body > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > aside:nth-child(1) > nav:nth-child(1) > div:nth-child(2) > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1) > span:nth-child(2)")
    public WebElement admin;
    @FindBy(css = "button[class='oxd-button oxd-button--medium oxd-button--secondary']")
    public WebElement add;
    @FindBy(css = "body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > form:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1)")
    public WebElement adminRole;
    @FindBy(xpath = "//div[@role='listbox']//div")
    public List<WebElement> adminRoleMenu;
    @FindBy(xpath = "(//div[@class='oxd-select-text-input'])[2]")
    public WebElement status;

    @FindBy(xpath = "//div[@role='listbox']//div")
    public List<WebElement> statusMenu;
    @FindBy(css = "input[placeholder='Type for hints...']")
    public WebElement employee;
    @FindBy(xpath = "//div[@role='listbox']//span")
    public List<WebElement>  employeeMenu;
    @FindBy(css = "div[class='oxd-form-row'] div[class='oxd-grid-2 orangehrm-full-width-grid'] div[class='oxd-grid-item oxd-grid-item--gutters'] div[class='oxd-input-group oxd-input-field-bottom-space'] div input[class='oxd-input oxd-input--active']")
    public WebElement newusername;
    @FindBy(css = "div[class='oxd-grid-item oxd-grid-item--gutters user-password-cell'] div[class='oxd-input-group oxd-input-field-bottom-space'] div input[type='password']")
    public WebElement newPassword;
    @FindBy(css = "div[class='oxd-grid-item oxd-grid-item--gutters'] div[class='oxd-input-group oxd-input-field-bottom-space'] div input[type='password']")
    public WebElement reNewPassword;
    @FindBy(css = "button[type='submit']")
    public WebElement saveButton;
    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text']")
    public WebElement message;
    public void textAssertEquals(String str1, String str2){
        assertEquals(str1, str2);
    }

}
