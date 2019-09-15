package com.wiley.ranku.steps;

import com.thoughtworks.gauge.Step;
import com.wiley.ranku.pages.SignupPage;
import com.wiley.ranku.util.driver.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Project Name    : Ranku_UniWebSite_Automation
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 9/14/2019
 * Time            : 7:31 PM
 * Description     :
 **/


public class SignupPageStepImpl {

    private WebDriver driver = Driver.driver;
    private SignupPage signupPage = PageFactory.initElements(driver, SignupPage.class);

    @Step("Fill Signup Information <firstName> <lastName> <email> <password>")
    public void fillSignupInfo(String firstName, String lastName, String email, String password) {
        signupPage.fillSignupInfo(firstName, lastName, email, password);
    }

    @Step("Click on Create Account button")
    public void clickCreateAccountButton(){
        signupPage.clickCreateAccountButton();
    }


}
