package runners;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;


import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

import static utilities.ReusableMethods.getApkTags;

public class Hooks {
    /*
    Hooks : Her bir Scenario ya da Scenario Outline dan once ya da sonra calismasini istedigimiz metotlar konur
    @Before ve @After metotlarini icerir
     */
    @Before
    public void setUpScenarios(){
        System.out.println("Before Metotu");
    }
    @After
    public void tearDownScenarios(Scenario scenario) {
        List<String> tags = (List<String>) scenario.getSourceTagNames();
        List<String> exeptList = new ArrayList<>();
        exeptList.add("@login");
        boolean conclusionBoolean = getApkTags(tags, exeptList);
        System.out.println("conclusionBoolean = " + conclusionBoolean);

        System.out.println("After Metotu");
//        Eger bir Scenario FAIL ederse, ekran goruntusunu al ve rapora ekle

            final byte[] failedScreenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
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