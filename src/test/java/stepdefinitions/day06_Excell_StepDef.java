package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.day06_Excell_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExcelUtils;


import static org.junit.Assert.assertTrue;

public class day06_Excell_StepDef {

    day06_Excell_Page page=new day06_Excell_Page();
    String expectedUrl;
    String actualUrl;


    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String arg0) {
        Driver.getDriver().get(ConfigReader.getProperty("herokuapp"));
    }
    @Given("kullanici exceldeki {string} sayfasindaki kullanici bilgileri ile login olur")
    public void kullanici_exceldeki_sayfasindaki_kullanici_bilgileri_ile_login_olur(String string) {
        expectedUrl= "https://thinking-tester-contact-list.herokuapp.com/contactList";
        ExcelUtils excelUtils=new ExcelUtils("src/test/resources/userData.xlsx", string);//ExcelUtils classtaki metotlara ulmak icin const. olusturdum
        for (int i = 1; i <= excelUtils.rowCount(); i++) { //i=1 olmali cunku excellin ilk satiri basliktir. rowCount() satir sayisini verir. <= olmali ki son satiri da alsin
            String email=excelUtils.getCellData(i, 0); //excellden email sutununundaki bilgileri okuyup stringe atar
            String password=excelUtils.getCellData(i, 1); //excellden password sutununundaki bilgileri okuyup stringe atar
            page.email.sendKeys(email);
            page.password.sendKeys(password);
            page.submit.click();
            page.logout.click();


        }
    }



    @And("kullanici exceldeki {string} sayfasindaki kullanici bilgileri ile login olamadigini dogrular")
    public void kullaniciExceldekiSayfasindakiKullaniciBilgileriIleLoginOlamadiginiDogrular(String string) {
        expectedUrl= "https://thinking-tester-contact-list.herokuapp.com/";
        ExcelUtils excelUtils=new ExcelUtils("src/test/resources/userData.xlsx", string);//ExcelUtils classtaki metotlara ulmak icin const. olusturdum
        for (int i = 1; i <= excelUtils.rowCount(); i++) { //i=1 olmali cunku excellin ilk satiri basliktir. rowCount() satir sayisini verir. <= olmali ki son satiri da alsin
            String email=excelUtils.getCellData(i, 0); //excellden email sutununundaki bilgileri okuyup stringe atar
            String password=excelUtils.getCellData(i, 1); //excellden password sutununundaki bilgileri okuyup stringe atar
            page.email.sendKeys(email);
            page.password.sendKeys(password);
            page.submit.click();
            actualUrl= Driver.getDriver().getCurrentUrl();
            assertTrue(actualUrl.equals(expectedUrl));
            Driver.getDriver().get(ConfigReader.getProperty("herokuapp"));

        }
    }

    @Then("kullanici login oldugunu dogrular")
    public void kullaniciLoginOldugunuDogrular() {
        actualUrl= Driver.getDriver().getCurrentUrl();
        assertTrue(actualUrl.equals(expectedUrl));
    }


}
