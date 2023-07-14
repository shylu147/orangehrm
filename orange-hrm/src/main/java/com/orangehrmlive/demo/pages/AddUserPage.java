package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AddUserPage extends Utility {
    /*AddUserPage - User Role Drop Down, Employee Name, Username, Status Drop Down, Password, Confirm Password,
     Save and Cancle Button Locators and it's actions*/

    By addButton = By.xpath("//button[normalize-space()='Add']");

    By userRoleDropDown = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]");
    By employeeName = By.xpath("//input[@placeholder='Type for hints...']");
    By statusDropDown = By.xpath("//i[@class='oxd-icon bi-caret-up-fill oxd-select-text--arrow']");
    By cancelButton = By.xpath("//button[normalize-space()='Cancel']");
    By saveButton = By.xpath("//button[@type='submit']");
    By adminInDropDown = By.xpath("//div[contains(text(),'Admin')]");
    By userName1 = By.xpath("//input[@class='oxd-input oxd-input--focus']");

    public void clickAddButton() {
        clickOnElement(addButton);
    }

    public void clickDropDownAdmin() {
        clickOnElement(userRoleDropDown);
    }

    public void clickAdminInDropDown() {
        clickOnElement(adminInDropDown);

        /*try {
            List<WebElement> roleList = driver.findElements(userRoleDropDown);
            for (WebElement element : roleList ){
                if (element.getText().equals( "Admin")){
                    element.click();
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());*/
    }

    public void clickEmployeeName() {
        clickOnElement(employeeName);
    }
    public void typeEmployeeName(){
        sendTextToElement(employeeName,"Ananya Dash");
    }
}




