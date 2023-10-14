package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.day07ParalelTest_Page;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertTrue;

public class day07_ParalelTest_01_StepDef {

    day07ParalelTest_Page page=new day07ParalelTest_Page();
    @When("search box ina {string} yazılır")
    public void search_box_ina_yazılır(String string) {

        page.cerez.click();
        ReusableMethods.visibleWait(page.evet, 15);
        page.evet.click();
        ReusableMethods.flash(page.searchBox, Driver.getDriver());
        page.searchBox.sendKeys(string, Keys.ENTER);


    }
    @Then("goruntulenen sonuclarda {string} yazdigi dogrulanir")
    public void goruntulenen_sonuclarda_yazdigi_dogrulanir(String string) {

        ReusableMethods.bekle(5);
        List<WebElement> list= Driver.getDriver().findElements(By.cssSelector("div[class='line-clamp-2 text-gray-600 h-9 text-xs leading-4.5 mb-1.5"));

        for (int i = 0; i < list.size(); i++) {
            if (string.equals("jenga")){
                assertTrue(list.get(i).getText().contains(string) || list.get(i).getText().contains("Jenga")|| list.get(i).getText().contains("JENGA"));

            }else {
                //assertTrue(list.get(i).getText().contains(string) || list.get(i).getText().contains("Ahşap")|| list.get(i).getText().contains("AHŞAP"));

            }
        }
    }

    @When("ilk urun favorilere eklenir")
    public void ilk_urun_favorilere_eklenir() {
        ReusableMethods.flash(page.favori, Driver.getDriver());
        page.favori.click();

    }
    @When("giris sayfasi acilir")
    public void giris_sayfasi_acilir() {
       String expectedUrl="https://www.pazarama.com/login";
       ReusableMethods.bekle(5);
        assertTrue(expectedUrl.contains("Login") || expectedUrl.contains("login") );
    }
    @And("email ve passwordkutusuna girilir")
    public void emailVePasswordkutusunaGirilir(DataTable dataTable) {
        List<String> mail = dataTable.row(1);
        for (int i = 1; i < mail.size(); i++) {
            ReusableMethods.flash(page.email, Driver.getDriver());
            page.email.sendKeys(dataTable.row(1).get(i-1));
            ReusableMethods.flash(page.sifre, Driver.getDriver());
            page.sifre.sendKeys(dataTable.row(1).get(i));
        }
    }
    @And("password kutusuna girilir")
    public void passwordKutusunaGirilir(DataTable dataTable) {


    }
    @Then("devam butonunun oldugu dogrulanir")
    public void devam_butonunun_oldugu_dogrulanir() {
        assertTrue(page.devamButonu.isDisplayed());
    }














    @And("ilk urun sepete eklenir")
    public void ilkUrunSepeteEklenir() {
        ReusableMethods.scroll(page.sepeteEkle);


        ReusableMethods.clickJSElementWithJavaScript("document.querySelector(\"#app > div > div:nth-child(1) > div:nth-child(2) > div > div.flex-1.pl-6\\\\.25.mb-9 > div.flex.flex-wrap.-mt-2\\\\.5.-mx-2\\\\.5 > div:nth-child(1) > div > button\")");

    }

    @And("email ve passwordkutusuna veri girilir")
    public void emailVePasswordkutusunaVeriGirilir(DataTable dataTable) {
        List<Map<String, String>> map= dataTable.asMaps();
        for (int i = 1; i < map.size(); i++) {
            ReusableMethods.flash(page.email, Driver.getDriver());

            page.email.sendKeys(dataTable.asMaps().get(i).get("email"));
            ReusableMethods.flash(page.sifre, Driver.getDriver());
            page.sifre.sendKeys(dataTable.asMaps().get(i).get("password"));





        }
    }
}
