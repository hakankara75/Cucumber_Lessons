package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.day08_Rerun_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


import static org.junit.Assert.assertTrue;


public class day08_Rerun_StepDef {

    day08_Rerun_Page locate = new day08_Rerun_Page();

    @Given("Kullanici {string} e gider")
    public void kullaniciEGider(String arg0) {
        Driver.getDriver().get(ConfigReader.getProperty("getir"));
    }

    @And("arama butonuna basar")
    public void aramaButonunaBasar() {
        ReusableMethods.clickJSElementWithJavaScript("document.querySelector(\"#myGlobalSearchBtn\")");

    }

    @And("arama kutusuna {string} yazar")
    public void aramaKutusunaYazar(String arg0) {

        ReusableMethods.webelementJavaScript("document.querySelector(\"#myGlobalSearchInput\")").sendKeys(arg0);
        ReusableMethods.clickJSElementWithJavaScript("document.querySelector(\"#taboola-video-reel-close-slider\")");
        ReusableMethods.clickJSElementWithJavaScript("document.querySelector(\"#myGlobalSearchBtn\")");
        ReusableMethods.bekle(30);
    }

    @Then("sonuçlarda {string} oldugunu dogrular")
    public void sonuclardaOldugunuDogrular(String arg0) {
        String baslik= ReusableMethods.webelementJavaScript("document.querySelector(\"body > section > div > div:nth-child(2) > div > h2\")").getText();
        System.out.println("baslik = " + baslik);
        assertTrue(baslik.contains("qa"));
        locate.haberList.get(0).click();
        for (int i = 0; i < locate.haberIcerigi.size(); i++) {
            assertTrue(locate.haberIcerigi.get(i).getText().contains("qa"));
        }


         }
}
