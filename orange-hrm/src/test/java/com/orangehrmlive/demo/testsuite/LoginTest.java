package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
LoginPage loginPage=new LoginPage();

@Test
    public void verifyUserShouldLoginSuccessFully(){
    loginPage.enterUserName();
    loginPage.enterPassWord();
    loginPage.clickLoginButton();
    Assert.assertEquals(loginPage.getTextDashBoard(),"Dashboard");
}

}
