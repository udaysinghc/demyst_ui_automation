package com.demyst.stepDefinations;

import com.demyst.base.DriverFactory;
import com.demyst.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginPageSteps extends DriverFactory {

    private static final Logger log = LoggerFactory.getLogger (LoginPageSteps.class);
    private final LoginPage loginPage;

    public LoginPageSteps () {
        driver = DriverFactory.getDriver ();
        this.loginPage = new LoginPage (driver);
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
    }

    @Given ("user on the login page")
    public void user_on_the_login_page () {
        loginPage.clickOnLoginButton ();

    }


    @When ("user enter email {string}, password {string}")
    public void userEnterEmailPassword (String email , String password) {

        loginPage.enterEmailPassword (email , password);
    }

    @Then ("click on the continue button")
    public void clickOnTheContinueButton () {
        loginPage.clickOnContinueButton ();
    }


    @Then ("verify the error message {string}")
    public void verifyTheErrorMessage (String message) {
        loginPage.verifyMessage (message);
    }


    @Then ("I should see error message for {string}")
    public void iShouldSeeErrorMessageFor (String message) {
        loginPage.verifyErrorMessage (message);
    }
}
