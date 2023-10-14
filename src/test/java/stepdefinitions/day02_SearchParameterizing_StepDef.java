package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.day02_SearchParameterizing_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class day02_SearchParameterizing_StepDef {

    day02_SearchParameterizing_Page search=new day02_SearchParameterizing_Page();
    String string1="";

    @Given("madame coco sitesine gidilir")
    public void madame_coco_sitesine_gidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("cocoUrl"));
        try {
            search.cerez.click();
            search.reklam.click();
        }catch (Exception e) {

        }
    }
    @And("ingilizce menu secilir")
    public void ingilizceMenuSecilir() {

        search.english.click();

    }
    @Given("arama kutusuna vazo yazilir")
    public void arama_kutusuna_vazo_yazilir() {
       search.searchBox.sendKeys("vazo");
    }
    @Then("sonuclarda vazo oldugu dogrulanir")
    public void sonuclarda_vazo_oldugu_dogrulanir() {
       List<WebElement> products= Driver.getDriver().findElements(By.cssSelector("a[class='product-item__name']"));
        for (int i = 0; i < products.size(); i++) {
            assertTrue(products.get(i).getText().contains("vazo"));

        }
        Driver.closeDriver();
    }

    @Given("arama kutusuna {string} yazilir")
    public void arama_kutusuna_yazilir(String string) {
        Faker faker=new Faker();
        String string1= faker.commerce().productName();
        if(string.equals("<urun>")){
            search.searchBox.click();
            search.searchBox.sendKeys(string1);
        }
        ReusableMethods.bekle(2);

    }
    @Then("sonuclarda {string} oldugu dogrulanir")
    public void sonuclarda_oldugu_dogrulanir(String string) {

        //ReusableMethods.alertDismiss();
        List<WebElement> products= Driver.getDriver().findElements(By.cssSelector("a[class='product-item__name']"));
        for (int i = 0; i < products.size(); i++) {
            assertTrue(products.get(i).getText().contains(string1));

        }
        Driver.closeDriver();
    }


}
