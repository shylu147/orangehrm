package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utility {
/*HomePage - Search, Admin, PIM, Leave, and Dashboard locatores
  and create appropriate methods for it.*/

By search=By.xpath("//input[@placeholder='Search']");
By admin=By.xpath("//li[1]//a[1]//span[1]");
By pim=By.xpath("//span[normalize-space()='PIM']");
By leave=By.xpath("//span[normalize-space()='Leave']");

public void clickAdmin(){
    clickOnElement(admin);
}

}
