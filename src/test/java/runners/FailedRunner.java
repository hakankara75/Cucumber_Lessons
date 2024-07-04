package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)

@CucumberOptions(
        plugin = {
                "pretty", //console renkli yazdirmak icin
                "html:TestOutput/htmlReport/cucumberHooks.html", //html report için
                "json:target/json-reports/cucumber.json",  //cucumber report için
                "junit:TestOutput/htmlReport/cucumber.xml", //xml report için
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",//spark report icin
                "rerun:target/failed_scenario.txt"},//rerun hata veren testleri kaydedip yeniden otomatik kosmak icin
        //  monochrome = true, //console okunakli hale getirir, renksiz yapar
        features = "@TestOutput/failed_scenario.txt", //----------------------
        glue = {"stepdefinitions", "runners"},
        dryRun = false,
        monochrome = false //console okunakli hale getirir,false scenario adimlarini renkli gosterir,  true renksiz yapar
)


public class FailedRunner {


}
