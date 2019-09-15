package com.wiley.ranku.util.screenshot;

import com.wiley.ranku.util.driver.Driver;
import com.thoughtworks.gauge.screenshot.ICustomScreenshotGrabber;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

/**
 * Project Name    : MaxSoft-WebBot
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 9/10/2019
 * Time            : 7:45 PM
 * Description     :
 **/


// Using WebDriver public class
public class CustomScreenshotGrabber implements ICustomScreenshotGrabber {

    public CustomScreenshotGrabber(){}

    private WebDriver driver = Driver.driver;

    // Return a screenshot byte array
    public byte[] takeScreenshot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }


}
