package hooks;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pages.Day11_Hooks_After_Before_Scenraio_StepDefinition_Page;
import utilities.Driver;


import java.util.ArrayList;
import java.util.List;

import static utilities.Driver.getDriver;
import static utilities.ReusableMethods.getApkTags;

public class Hooks {
    /*
    Hooks : Her bir Scenario ya da Scenario Outline dan once ya da sonra calismasini istedigimiz metotlar konur
    @Before ve @After metotlarini icerir
     */

    @Before ("@admin")
    public void setUpAdmin(){
        Day11_Hooks_After_Before_Scenraio_StepDefinition_Page page=new Day11_Hooks_After_Before_Scenraio_StepDefinition_Page();
        getDriver().get("https://practice.automationtesting.in/my-account/");
        page.username.sendKeys("hakandenememail@gmail.com");
        page.password.sendKeys("1361Hakan.");
        page.login.click();
        page.shop.click();

    }

    @After ("@admin")
    public void close(){
        getDriver().quit();
    }


    @Before ("@user")
    public void setUpScenarios(){
        System.out.println("Bu metoto @user tagi için çalıştı. Before Metotu çalıştı.");
    }
    @After("@login")
    public void tearDownScenarios(Scenario scenario) {
        List<String> tags = (List<String>) scenario.getSourceTagNames();
        List<String> exeptList = new ArrayList<>();
        exeptList.add("@login");
        boolean conclusionBoolean = getApkTags(tags, exeptList);
        System.out.println("conclusionBoolean = " + conclusionBoolean);

        System.out.println("After Metotu");
//        Eger bir Scenario FAIL ederse, ekran goruntusunu al ve rapora ekle

            final byte[] failedScreenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
//                       ekran goruntusu    file tipi                  ekran goruntusunun adi
        if (scenario.isFailed()) {
            scenario.attach(failedScreenshot, "image/png", "failed_scenario_" + scenario.getName());
            Driver.closeDriver();
        }
            if (!conclusionBoolean == true) {
                Driver.closeDriver(); // Burasi tarayici kapatir
            }

    }


}