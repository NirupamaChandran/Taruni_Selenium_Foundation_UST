package com.automation.test;

import com.automation.utils.ConfigReader;
import com.automation.utils.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {


    @BeforeMethod
    public void setUp() {
        ConfigReader.initConfig();
        DriverManager.createDriver();
    }

    @AfterMethod
    public void cleanUp() {
        DriverManager.getDriver().quit();
    }
}
