package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.day01_Background_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import static org.junit.Assert.assertEquals;
import static utilities.ReusableMethods.click;

public class day01_Background_StepDef {
    /*
    Bu derste iki ayrı senaryo yazariz.
    Senaryolar bitince ortak 2 step Background kısmına eklenir.
    Background bize senaryolarda ortak olarak tekrar edecek kodları 1 kez yazarak clear code yapar
    Background ayrıca loop özelliğine sahiptir. Her scenario öncesi kodlar otomatik çalışır.

     */
    day01_Background_Page loginNegatif = new day01_Background_Page();
    String expectedTitle;

    @Given("ets tur sitesine gidilir")
    public void ets_tur_sitesine_gidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("etsUrl"));
        ReusableMethods.visibleWait(loginNegatif.shadowRoot,5);

        //youtube shadow root videosunda bu konu islendi
//        SearchContext searchContext = Driver.getDriver().findElement(By.xpath("efilli-layout-etstur")).getShadowRoot();
//        WebElement shadowElement = searchContext.findElement(By.cssSelector("//div[text()='Kabul Et']"));
//        shadowElement.click();

        loginNegatif.shadowRoot.click();
        loginNegatif.kabulEt.click();

    }

    @Given("login butonu ustune gidilir")
    public void login_butonu_ustune_gidilir() {
        ReusableMethods.moveToElementWithAction(loginNegatif.dropDown);
    }

    @Then("giris butonuna basilir")
    public void giris_butonuna_basilir() {
        click(loginNegatif.giris);
    }

    @Then("eposta girilir")
    public void eposta_girilir() {
        ReusableMethods.visibleWait(loginNegatif.email, 30);
        expectedTitle = Driver.getDriver().getTitle();

        loginNegatif.email.sendKeys(ConfigReader.getProperty("email"));
    }

    @Then("password girilir")
    public void password_girilir() {
        loginNegatif.password.sendKeys(ConfigReader.getProperty("password"));
    }

    @When("giris yap butonuna basilir")
    public void giris_yap_butonuna_basilir() {
        loginNegatif.girisYap.click();
    }

    @When("sayfaya gidilemedigi dogrulanir")
    public void sayfaya_gidilemedigi_dogrulanir() {
        String actualTitle = Driver.getDriver().getTitle();
        assertEquals(expectedTitle, actualTitle);
        Driver.getDriver().close();
    }

    @Then("uye ol butonuna basilir")
    public void uye_ol_butonuna_basilir() {
        ReusableMethods.scroll(loginNegatif.uyeOl);
        loginNegatif.uyeOl.click();
    }

    @Then("ad girilir")
    public void ad_girilir() {
        loginNegatif.ad.sendKeys("hakan");
        expectedTitle = Driver.getDriver().getTitle();
    }

    @Then("soyad girilir")
    public void soyad_girilir() {
        loginNegatif.soyad.sendKeys("kara");
    }

    @And("uyelik icin eposta girilir")
    public void uyelikIcinEpostaGirilir() {
        loginNegatif.uyelikEmail.sendKeys(ConfigReader.getProperty("email"));
    }

    @And("uyelik icin password girilir")
    public void uyelikIcinPasswordGirilir() {
        loginNegatif.uyelikPassword.sendKeys(ConfigReader.getProperty("password"));
    }

    @Then("ceptelefonu girilir")
    public void ceptelefonu_girilir() {
        loginNegatif.uyelikPhone.sendKeys("5555555555");
    }

    @Then("password yeniden girilir")
    public void password_yeniden_girilir() {
        loginNegatif.uyelikPasswordTekrar.sendKeys(ConfigReader.getProperty("password"));
    }

    @Then("kullanim sartlari checkbox secilir")
    public void kullanim_sartlari_checkbox_secilir() {
        ReusableMethods.clickJSElementWithJavaScript("document.querySelector(\"body > efilli-layout-etstur\").shadowRoot.querySelector(\"div > div.banner__accept-button\")");
        loginNegatif.kullanimSartlari.click();


    }

    @Then("firsat ve kampanyalar checkbox secilir")
    public void firsat_ve_kampanyalar_checkbox_secilir() {
        loginNegatif.firsatlar.click();
    }

    @When("uyelik bolumunde uye ol butonuna basilir")
    public void uyelikBolumundeUyeOlButonunaBasilir() {
        loginNegatif.uyeOlButton.click();

    }



}
