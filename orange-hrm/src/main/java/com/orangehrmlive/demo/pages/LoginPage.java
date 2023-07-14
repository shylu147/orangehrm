package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    /*LoginPage - Store usename, password, Login Button, HR for All logo, and LOGIN Panel text Locators
    and create appropriate methods for it.*/
    By userName=By.name("username");
    By passWord=By.name("password");
    By loginButton=By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]");
    By hrForAll=By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]");
    By dashboard=By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']");

    public void enterUserName(){
        clickOnElement(userName);
        sendTextToElement(userName,"Admin");
    }
    public void enterPassWord(){
        clickOnElement(passWord);
        sendTextToElement(passWord,"admin123");
    }
    public void clickLoginButton(){
        clickOnElement(loginButton);
    }
    public String getTextDashBoard(){
        return getTextFromElement(dashboard);
    }

}
