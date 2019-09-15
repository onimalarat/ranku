package com.wiley.ranku.steps;

import com.wiley.ranku.pages.HomePage;
import com.wiley.ranku.util.driver.Driver;
import com.thoughtworks.gauge.Step;
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


public class HomePageStepImpl {

    private WebDriver driver = Driver.driver;
    private HomePage homepage = PageFactory.initElements(driver, HomePage.class);

    @Step("Open Sign-Up Form")
    public void openSignUpForm() {
        homepage.clickSignUpButton();
    }


}
