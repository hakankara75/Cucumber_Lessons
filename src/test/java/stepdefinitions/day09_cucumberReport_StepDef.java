package stepdefinitions;

import io.cucumber.java.en.When;
import pages.day09_cucumberReport_Page;
import utilities.ReusableMethods;

public class day09_cucumberReport_StepDef {

    day09_cucumberReport_Page locate=new day09_cucumberReport_Page();

    @When("cerezleri kapatir")
    public void cerezleri_kapatir() {
        ReusableMethods.clickJSElementWithJavaScript("document.querySelector(\"#__next > div.sc-927cf94c-0.kpliOC > div > div.sc-927cf94c-3.hAPxep > div:nth-child(1) > button\")");
    }

}
