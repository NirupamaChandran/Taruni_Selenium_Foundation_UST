package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ItemDetailPage extends BasePage {

    ItemListPage itemListPage = new ItemListPage();

    @FindBy(className = "product-title")
    List<WebElement> productTitle;

    @FindBy(css = ".block-swatch")
    List<WebElement> sizeButton;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement addToCartButton;

    public boolean detailPageIsDisplayed() {
        return productTitle.get(0).getText().equals(itemListPage.titleList.get(0).getText());
    }

    public void addToCart() {
        sizeButton.get(0).click();
        addToCartButton.click();
    }
}
