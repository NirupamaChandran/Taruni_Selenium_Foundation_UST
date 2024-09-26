package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class HomePage extends BasePage{

    @FindBy(xpath = "//div[@class='prose']/div/a")
    WebElement shopNowButton;

    @FindBy(xpath = "//a/span[text()='Open search']")
    WebElement searchButton;

    @FindBy(xpath = "//form[@id='predictive-search-form']/div/input")
    WebElement searchInput;

    @FindBy(className = "wishlist-engine-button")
    List<WebElement> wishListButton;

    @FindBy(xpath = "(//span[@data-total='1'])[1]")
    WebElement wishListCount;

    public void openWebsite(){
        driver.get(ConfigReader.getConfigValue("base.url"));
    }

    public void clickShopNow(){
        shopNowButton.click();
    }

    public void searchItem(String itemName){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();",searchButton );
        searchInput.sendKeys(itemName);
    }

    public void clickWishList(){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();",wishListButton.get(0) );
    }

    public String checkWishListCount(){
        return wishListCount.getText();
    }

}
