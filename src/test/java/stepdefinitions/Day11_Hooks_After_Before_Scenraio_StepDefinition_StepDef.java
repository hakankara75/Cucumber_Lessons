package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Day11_Hooks_After_Before_Scenraio_StepDefinition_Page;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;
import static utilities.Driver.getDriver;

public class Day11_Hooks_After_Before_Scenraio_StepDefinition_StepDef {


    Day11_Hooks_After_Before_Scenraio_StepDefinition_Page page=new Day11_Hooks_After_Before_Scenraio_StepDefinition_Page();

    String expectedText;

    @Given("got to practice")
    public void gotToPractice() {
    }

    @And("click on shop")
    public void clickOnShop() {
        getDriver().get("https://practice.automationtesting.in/my-account/");
        page.shop.click();

    }

    @When("click on android basket button")
    public void clickOnAndroidBasketButton() {
        ReusableMethods.scroll(page.productClass);
        ReusableMethods.bekle(2);

        expectedText = page.product.getText();
        page.android.click();

        ReusableMethods.scrollHome();
        ReusableMethods.bekle(2);
    }

    @Then("verify basket")
    public void verifyBasket() {
        page.basket.click();
        String actualText= page.productInBasket.getText();

        assertEquals("Sepet boş veya yanlış ürün eklenmiş",expectedText, actualText);
    }


    @And("click on shop for admin")
    public void clickOnShopForAdmin() {
    }
}
