package com.wiley.ranku.pages;

import com.wiley.ranku.common.Base;
import com.wiley.ranku.util.driver.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Project Name    : Ranku_UniWebSite_Automation
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 9/14/2019
 * Time            : 7:25 PM
 * Description     :
 **/


public class HomePage extends Base {

    private static String HomePageUrl = APPLICATION_ENDPOINT;
    private WebDriver driver = Driver.driver;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void navigateToHomePage() {
        driver.get(HomePageUrl);
    }

    public void clickSignUpButton() {
        clickElement("HomePage", "link_signup");
    }


}
