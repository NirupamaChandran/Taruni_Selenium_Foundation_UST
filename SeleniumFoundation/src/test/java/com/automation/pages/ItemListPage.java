package com.automation.pages;

import com.automation.utils.DriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class ItemListPage extends BasePage{


    @FindBy(xpath = "//div[2]/div/div/a")
    List<WebElement> titleList;


    public void selectProduct() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();",titleList.get(0) );
    }

}
