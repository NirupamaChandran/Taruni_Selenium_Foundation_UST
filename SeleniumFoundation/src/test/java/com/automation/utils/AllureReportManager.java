package com.automation.utils;

import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.ByteArrayInputStream;

public class AllureReportManager {

    public static void attachScreenShot() {
        TakesScreenshot takesScreenshot = (TakesScreenshot) DriverManager.getDriver();
        byte[] screenShot = takesScreenshot.getScreenshotAs(OutputType.BYTES);
        Allure.addAttachment("screenshot", new ByteArrayInputStream(screenShot));
    }
}

