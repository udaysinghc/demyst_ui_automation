package com.demyst.pages;

import com.demyst.base.DriverFactory;
import com.demyst.utility.HighlightElementLocatorFactory;
import com.demyst.utility.TestUtil;
import org.junit.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends DriverFactory {


    public LoginPage (WebDriver driver) {
        PageFactory.initElements (new HighlightElementLocatorFactory (driver) , this);
    }

    @FindBy (css = "[class*='button-component button-component-in']")
    public WebElement loginButton;

    @FindBy (id = "email")
    public WebElement emailField;

    @FindBy (id = "password")
    public WebElement passwordField;

    @FindBy (css = "[data-test-id='loginForm_submit']")
    public WebElement continueButton;

    @FindBy (css = "[class='MessageBox MessageBox__error']")
    public WebElement errorMessage;

    public void clickOnLoginButton () {
        TestUtil testUtil1 = new TestUtil ();
        testUtil1.presenceOfElementWait (loginButton);
        loginButton.click ();

    }

    public void enterEmailPassword (String email , String password) {
        TestUtil testUtil1 = new TestUtil ();
        testUtil1.presenceOfElementWait (emailField);
        emailField.sendKeys (email);
        testUtil1.presenceOfElementWait (passwordField);
        passwordField.sendKeys (password);
    }

    public void clickOnContinueButton () {
        TestUtil testUtil1 = new TestUtil ();
        testUtil1.presenceOfElementWait (continueButton);
        continueButton.click ();
    }

    public void verifyMessage (String message) {


        JavascriptExecutor javaScriptEcecutor = (JavascriptExecutor) driver;
        Object validationMessage = javaScriptEcecutor.executeScript ("return document.getElementById('email').validationMessage;");
        System.out.println ("validationMessage"+validationMessage);
        assert validationMessage != null;
        String mess = validationMessage.toString ();
        if (mess.equalsIgnoreCase ("")) {
            Object validationMessagePassword = javaScriptEcecutor.executeScript ("return document.getElementById('password').validationMessage;");
            Assert.assertEquals (message , validationMessagePassword);
        } else {
            Assert.assertEquals (message , validationMessage);
        }


    }

    public void verifyErrorMessage (String message) {
        TestUtil testUtil1 = new TestUtil ();
        testUtil1.presenceOfElementWait (errorMessage);
        String messageError = errorMessage.getText ();
        System.out.println (messageError);
        Assert.assertEquals (message , messageError);
    }

}

