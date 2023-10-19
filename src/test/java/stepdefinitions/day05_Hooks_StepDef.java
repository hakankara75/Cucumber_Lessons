package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pages.day05_Hooks_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class day05_Hooks_StepDef {

    day05_Hooks_Page hooks = new day05_Hooks_Page();
    String actualSize;
    @Given("trendyol sitesine gidilir")
    public void trendyol_sitesine_gidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("trendyol"));

        hooks.cerezler.click();
      hooks.reklam.click();
      ReusableMethods.bekle(3);
       ReusableMethods.alertDismiss();
    }

    @Given("arama kutusuna {string} yazılır")
    public void arama_kutusuna_yazılır(String string) {
        ReusableMethods.showElementWithFrame("input[data-testid='suggestion");
        ReusableMethods.bekle(3);
        hooks.searchBox.sendKeys(string, Keys.ENTER);

    }

    @Then("sonuc sayfasinda {string} oldugu dogrulanir")
    public void sonuc_sayfasinda_oldugu_dogrulanir(String string) {
        assertEquals(hooks.aramaSonucuUrunIsmı.getText(), string);
    }


    @Then("arama sonuclarinin goruntulendigi dogrulanir")
    public void aramaSonuclarininGoruntulendigiDogrulanir() {
        assertTrue(hooks.aramaSonucuUrunIsmı.isDisplayed());

    }

    @When("sonuc sayfasindaki arama sonuc sayisi alinir")
    public void sonucSayfasindakiAramaSonucSayisiAlinir() {
        actualSize = hooks.aramaSonucuTamami.getText().replaceAll("\\D", "");

    }


    @Then("{int} den fazla urunun ekranda goruntulendigi dogrulanir")
    public void denFazlaUrununEkrandaGoruntulendigiDogrulanir(int arg0) {
        int actualProduct= Driver.getDriver().findElements(By.cssSelector("div[class='image-overlay-body")).size();
        int expectedSize= arg0;
        System.out.println("expectedSize = " + expectedSize);
        System.out.println("actualSize = " + actualSize);
        assertTrue(actualProduct>=expectedSize);
    }

    @Then("sonuc sayisindaki kadar urunun ekranda goruntulendigi dogrulanir")
    public void sonucSayisindakiKadarUrununEkrandaGoruntulendigiDogrulanir() {
        int actualProduct= Driver.getDriver().findElements(By.cssSelector("div[class='image-overlay-body")).size();
        System.out.println("actualProduct = " + actualProduct);
        int expectedSize= Integer.parseInt(actualSize);
        assertTrue(actualProduct==expectedSize);
    }


}
