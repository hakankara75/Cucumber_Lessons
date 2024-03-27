package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Day_10_Hidden_Elements_Page;
import utilities.ConfigReader;
import utilities.ReusableMethods;

import static utilities.Driver.getDriver;

public class Day_10_Hidden_Elements_StepDef {
    Day_10_Hidden_Elements_Page page=new Day_10_Hidden_Elements_Page();
    @Given("As a user got to orange")
    public void asAUserGotToOrange() {
        getDriver().get(ConfigReader.getProperty("orange"));
    }

    @Then("verify url")
    public void verifyUrl() {
        String expectedUrl = ConfigReader.getProperty("orange");
        String actualUrl = getDriver().getCurrentUrl();
        page.textAssertEquals(expectedUrl, actualUrl);
    }

    @And("I enter username {string}")
    public void ıEnterUsername(String arg0) {
        page.username.sendKeys(arg0);


    }

    @And("I enter password {string}")
    public void ıEnterPassword(String arg0) {
        page.password.sendKeys(arg0);
    }

    @When("I click login button")
    public void ıClickLoginButton() {
        page.loginButton.click();
    }

    @Then("I verify in dashboard with {string}")
    public void ıVerifyInDashboardWith(String expected) {
        String actual= page.dashboard.getText();
        page.textAssertEquals(expected, actual);

    }

    @And("I click admin link")
    public void ıClickAdminLink() {

        page.admin.click();

    }

    @And("I click add button")
    public void ıClickAddButton() {

        page.add.click();
    }

    @And("I select {string} with user role dropdown")
    public void ıSelectWithUserRoleDropdown(String arg0) {
        if(arg0.equals("Admin")) {
        page.adminRole.click();
        page.adminRoleMenu.get(1).click();
        }else {
            page.statusMenu.get(2).click();
        }
    }

    @And("I select {string} with status dropdown")
    public void ıSelectWithStatusDropdown(String arg0) {
        if(arg0.equals("Enabled")) {
            page.status.click();
            page.statusMenu.get(1).click();
        }else {
            page.statusMenu.get(2).click();
        }
    }

    @And("I write {string} with employee name box")
    public void ıWriteWithEmployeeNameBox(String arg0) {
        if(arg0.equals("Muhammad Haseeb 1935")){
            page.employee.click();
            page.employee.sendKeys("a");
            ReusableMethods.visibleWait(page.employeeMenu.get(1),4);
            page.employeeMenu.get(1).click();
        }else {

        }

    }

    @And("I {string} with new user name box")
    public void ıWithNewUserNameBox(String arg0) {
        page.newusername.sendKeys(arg0);
    }

    @And("I write {string} with new password box")
    public void ıWriteWithNewPasswordBox(String arg0) {
        page.newPassword.sendKeys(arg0);
    }

    @And("I write {string} with re new password box")
    public void ıWriteWithReNewPasswordBox(String arg0) {
        page.reNewPassword.sendKeys(arg0);
    }

    @When("I click save button")
    public void ıClickSaveButton() {
        page.saveButton.click();
    }

    @Then("I verify {string} with success message box")
    public void ıVerifyWithSuccessMessageBox(String expected) {
        ReusableMethods.visibleWait(page.message,2);
        String actual=page.message.getText();
        page.textAssertEquals(expected,actual);
    }
}
