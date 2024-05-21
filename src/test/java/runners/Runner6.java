package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/*
Runner class; testNG deki .xml file larda belirttiğimiz class'ları,packageları veya methodları nasıl
çalıştırıyorsak, Cucumber frameworkundede Runner class'ındaki tags parametresi ile belirttiğimiz
senaryoyu çalıştırabiliriz
 */
//Cucumber ile JUnit'in entegre olmasını sağlayan test çalıştırıcı notasyonudur
@RunWith(Cucumber.class)
//Seneryoların nerede ve nasıl çalışacağı, hangi raporu kullanacağıyla alakalı seçenekleri ayarlarız
@CucumberOptions(  //plugin kismi raporlar icin
                plugin = {
                        "pretty", //console renkli yazdirmak icin
                        "html:TestOutput/htmlReport/cucumberHooks1.html", //html report için
                        "json:target/json-reports/cucumber1.json",  //cucumber report için
                        "junit:test-output/htmlReport/cucumber1.xml", //xml report için
                        "rerun:TestOutput/failed_scenario.txt",//bu satirdaki kod, hata veren testleri kaydedip yeniden otomatik kosmak icin
                        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},//spark report icin
              //  monochrome = true, //console okunakli hale getirir, renksiz yapar
                features = "src/test/resources/features",
                 glue = {"stepdefinitions", "runners"},
        /* 1-Bu parametre ile kodlarımızı yazdığımız stepDefinition class'ının packege'ını belirtiriz
2- Hooks classin yolunu veririz.
                                             */
                 tags = "@excel",
                 dryRun = false,
                 monochrome = false //console okunakli hale getirir,false scenario adimlarini renkli gosterir,  true renksiz yapar
                        )
/*
features ===> features'ların olduğu packega'ın yolunu ver(ContentRoot)
glue ====> stepDefinition'ların olduğu packega'ın yolunu ver(Source Root), Hooks class yolunu ver
tags ====> çalıştırmak istediğin grubu yaz
dryRun = true ====> eksik step definition bulup gösterir. calismaz. konsolda eksik stepleri gosterir.
 */

public class Runner6 {
}
