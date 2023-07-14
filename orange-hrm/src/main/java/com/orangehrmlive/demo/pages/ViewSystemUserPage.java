package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ViewSystemUserPage extends Utility {
    By systemUserText= By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/h5[1]");

    public String getSystemUserText(){
        return getTextFromElement(systemUserText);
    }
}
