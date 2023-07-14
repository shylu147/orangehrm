package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.*;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.checkerframework.checker.units.qual.A;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    ViewSystemUserPage viewSystemUserPage = new ViewSystemUserPage();

    AddUserPage addUserPage = new AddUserPage();

    @Test
    public void adminShouldAddUserSuccessFully() {
        loginPage.enterUserName();
        loginPage.enterPassWord();
        loginPage.clickLoginButton();
        homePage.clickAdmin();
        Assert.assertEquals(viewSystemUserPage.getSystemUserText(), "System Users");
        /* addUserPage.selectDropDownAdmin();*/
    }

    @Test

    public void searchTheUserCreatedAndVerifyIt() throws InterruptedException {
        loginPage.enterUserName();
        loginPage.enterPassWord();
        loginPage.clickLoginButton();
        homePage.clickAdmin();
        Assert.assertEquals(viewSystemUserPage.getSystemUserText(), "System Users");
        homePage.clickAdmin();
        Thread.sleep(30);
        addUserPage.typeEmployeeName();


    }


}
