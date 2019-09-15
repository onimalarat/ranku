package com.wiley.ranku.util;

import com.maxsoft.greporter.Email;
import com.maxsoft.greporter.JsonReportReader;

/**
 * Project Name    : MaxSoft-WebBot
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 9/10/2019
 * Time            : 7:45 PM
 * Description     :
 **/


public class EmailSender {

    public static void main(String[] args) {
        Email.send(JsonReportReader.getExecutionResults());
    }


}
