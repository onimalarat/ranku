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


public class SignupPage extends Base {

    private WebDriver driver = Driver.driver;

    public SignupPage() {
        PageFactory.initElements(driver, this);
    }

    public void inputFirstName(String firstName) {
        inputText("SignupPage", "txt_firstname", firstName);
    }

    public void inputLastName(String lastName) {
        inputText("SignupPage", "txt_lastname", lastName);
    }

    public void inputEmail(String email) {
        inputText("SignupPage", "txt_email", email);
    }

    public void inputPassword(String password) {
        inputText("SignupPage", "txt_password", password);
    }

    public void clickCreateAccountButton() {
        clickElement("SignupPage", "btn_create_account");
    }

    public void fillSignupInfo(String firstName, String lastName, String email, String password) {
        inputFirstName(firstName);
        inputLastName(lastName);
        inputEmail(email);
        inputPassword(password);
    }


}
