package stepdefinitions;

import io.cucumber.java.en.*;
import pages.Amazon_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;


public class Amazon_StepDef {
    Amazon_Page amazonPage = new Amazon_Page();

    @Given("Amazon sitesine gidilir")
    public void amazon_sitesine_gidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("amazon"));

    }

    @When("yeni cikanlar secilir")
    public void yeniCikanlarSecilir() {
        try{
        ReusableMethods.click(amazonPage.yeniCikanlar);
}catch (Exception e){

    }
        }
    @Then("gorunen urunlerde firca oldugu dogrulanir")
    public void gorunen_urunlerde_firca_oldugu_dogrulanir() {
        for (int i = 0; i < amazonPage.urunler.size(); i++) {
            System.out.println("amazonPage.urunler.get(i).getText() = " + amazonPage.urunler.get(i).getText());
            assertTrue(amazonPage.urunler.get(i).getText().contains("fırça"));

        }
    }


}
