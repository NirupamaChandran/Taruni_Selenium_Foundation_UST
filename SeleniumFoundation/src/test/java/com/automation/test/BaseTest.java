package com.automation.test;

import com.automation.pages.HomePage;
import com.automation.pages.ItemListPage;
import com.automation.utils.ConfigReader;
import com.automation.utils.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    HomePage homePage;
    ItemListPage itemListPage;

    @BeforeMethod
    public void setUp() {
        ConfigReader.initConfig();
        DriverManager.createDriver();
        homePage = new HomePage();
        itemListPage = new ItemListPage();
    }

    @AfterMethod
    public void cleanUp() {
        DriverManager.getDriver().quit();
    }
}
