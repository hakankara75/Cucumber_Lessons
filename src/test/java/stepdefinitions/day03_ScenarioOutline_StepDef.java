package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.day03_ScenarioOutline_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class day03_ScenarioOutline_StepDef {

    day03_ScenarioOutline_Page scenario = new day03_ScenarioOutline_Page();
    Faker faker = new Faker();

    @Given("boyner sitesine gidilir")
    public void boyner_sitesine_gidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("boynerUrl"));

    }

    @When("login ikonu ustune gidilir")
    public void loginIkonuUstuneGidilir() {
        ReusableMethods.moveToElementWithAction(scenario.loginIkon);
    }

    @When("uye ol linki tiklanir")
    public void uye_ol_linki_tiklanir() {
        scenario.uyeOl.click();

    }

    @Then("uyelik sayfasinda oldugu dogrulanir")
    public void uyelik_sayfasinda_oldugu_dogrulanir() {
        String expectedText = "Boyner dünyasına hoş geldin";
        String actualText = scenario.uyelikSayfasi.getText();
        assertTrue(actualText.contains(expectedText));
    }

    @And("uyelik sayfasinda ad girilir")
    public void uyelikSayfasindaAdGirilir() {
        String firstname = faker.name().firstName();
        String surname = faker.name().lastName();
        scenario.adSoyad.sendKeys(firstname + surname);
    }

    @Then("email girilir")
    public void email_girilir() {
        String email = faker.internet().emailAddress();
        scenario.eposta.sendKeys(email);
    }

    @And("uyelik sayfasinda password girilir")
    public void uyelikSayfasindaPasswordGirilir() {

        String password = faker.internet().password();
        scenario.password.sendKeys(password);
    }

    @Then("cep telefonu girilir")
    public void cep_telefonu_girilir() {
        String cepTelefonu = faker.numerify("##########");
        scenario.cepTelefonu.sendKeys(cepTelefonu);
    }

    @And("uyelik metni checkbox secilir")
    public void uyelikMetniCheckboxSecilir() {
        try{
            ReusableMethods.scrollEnd();
        }catch (Exception e){}

        scenario.uyelikSozlesmesi.click();
    }


    @And("riza metni checkbox secilir")
    public void rizaMetniCheckboxSecilir() {
        scenario.rizaMetni.click();
    }

// ssn = faker.number().numberBetween(10, 99)
    @And("uyelik metni icin {string} checkbox secilir")
    public void uyelikMetniIcinCheckboxSecilir(String arg0) {
        if (arg0.equals("0"))
            scenario.uyelikSozlesmesi.click();

    }

    @And("riza metni icin {string} checkbox secilir")
    public void rizaMetniIcinCheckboxSecilir(String arg0) {
        if (arg0.equals("0"))
            scenario.rizaMetni.click();
    }

    @Then("uye ol butonu tiklanir")
    public void uye_ol_butonu_tiklanir() {
        scenario.uyelikButton.click();
    }


    @And("uyelik sayfasinda {string} girilir")
    public void uyelikSayfasindaGirilir(String arg0) {
        scenario.password.sendKeys(arg0);
    }


    @And("uyelik sayfasinda ad bolumune {string} girilir")
    public void uyelikSayfasindaAdBolumuneGirilir(String arg0) {
        scenario.adSoyad.sendKeys(arg0);
    }

    @And("uyelik sayfasinda email bolumune{string} girilir")
    public void uyelikSayfasindaEmailBolumuneGirilir(String arg0) {
        scenario.eposta.sendKeys(arg0);
    }

    @And("uyelik sayfasinda password bolumune{string} girilir")
    public void uyelikSayfasindaPasswordBolumuneGirilir(String arg0) {
        scenario.password.sendKeys(arg0);
    }

    @And("uyelik sayfasinda cep telefonu bolumune{string} girilir")
    public void uyelikSayfasindaCepTelefonuBolumuneGirilir(String arg0) {
        scenario.cepTelefonu.sendKeys(arg0);
    }
}
