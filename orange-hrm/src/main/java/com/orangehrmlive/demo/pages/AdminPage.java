package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class AdminPage extends Utility {
    //AdminPage - UserManagement, Job, Organization Tabs Locators and it's actions

    By userManagement = By.xpath("//span[normalize-space()='User Management']");
    By job = By.xpath("//div[@class='oxd-topbar-body']//li[1]");
    By organizationTab = By.xpath("//span[normalize-space()='Organization']");

}

