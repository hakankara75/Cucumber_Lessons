package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.day04_DataTable_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class day04_DataTable_StefDef {
    day04_DataTable_Page data=new day04_DataTable_Page();

    @Given("{string} sitesine gidilir")
    public void sitesineGidilir(String arg0) {
        switch (arg0){
            case "herokuapp":
                Driver.getDriver().get(ConfigReader.getProperty("herokuapp"));
                break;
            case "cicek sepeti":
                Driver.getDriver().get(ConfigReader.getProperty("cicekSepeti"));
                break;
            case "pazarama":
                Driver.getDriver().get(ConfigReader.getProperty("pazarama"));
                break;
            case "trendyol":
                Driver.getDriver().get(ConfigReader.getProperty("trendyol"));
                break;
        }

    }
    @When("hediye linki tiklanir")
    public void hediye_linki_tiklanir() {
        data.hediye.click();

      ReusableMethods.bekle(3);
    }
    @And("dogum gunu linki tiklanir")
    public void dogumGunuLinkiTiklanir() {
        ReusableMethods.webelementJavaScript("document.querySelector(\"body > div.header__bottom.js-header-bottom.switcher-active > div.container.container--main-menu.js-navigasyon-container > div.responsive-menu.js-responsive-menu > nav > ul > li:nth-child(11) > span > a\")").click();
    }

    @Then("dogum gunu sayfasinda oldugu dogrulanir")
    public void dogumGunuSayfasindaOlduguDogrulanir() {
        String expectedTitle="Doğum Günü Hediyeleri (1000'den Fazla Hediye Önerisi)";
        String actualTitle=Driver.getDriver().getTitle();
        assertEquals(expectedTitle, actualTitle);

    }



    @And("arama cubuguna {string} yaz")
    public void aramaCubugunaYaz(String arg0) {
        data.cerez.click();

        ReusableMethods.bekle(2);

        WebElement aramaCubugu=ReusableMethods.webelementJavaScript("document.querySelector(\"#product-search-1 > div.product-search__inner-container > input\")");
        ReusableMethods.sendKeysJS(aramaCubugu, arg0);
        data.aramaButonu.click();
        ReusableMethods.bekle(2);

    }

    @When("renk drop down tiklanir")
    public void renkDropDownTiklanir() {

        
    }

    @Then("sirasiyla renkler secilir")
    public void sirasiylaRenklerSecilir(DataTable dataTable) {
        data.renkler.click();
        List<String> bilgiler = dataTable.asList();
        System.out.println("bilgiler.size() = " + bilgiler.size());
        for (int i = 1; i < bilgiler.size(); i++) {
        switch (bilgiler.get(i)) {

            case "Beyaz":
                ReusableMethods.waitForClickablility( data.uyari, 15);
                 data.uyari.click();
                data.beyaz.click();
                ReusableMethods.bekle(2);
                break;
            case "Gri":
                data.gri.click();
                ReusableMethods.bekle(3);
                break;
            case "Çok Renkli ":
                data.cokRenkli.click();
                ReusableMethods.bekle(3);
                break;
            case "Kırmızı":
                data.kirmizi.click();
                ReusableMethods.bekle(3);
                break;
            case "Kahverengi ":
                data.kahverengi.click();
                ReusableMethods.bekle(3);
                assertTrue(data.kahverengi.isSelected());
                break;
            default:
                break;

        }
        Driver.getDriver().get("https://www.ciceksepeti.com/dogum-gunu-hediyeleri");
            ReusableMethods.bekle(5);
            data.renkler.click();
        }

    }



}
