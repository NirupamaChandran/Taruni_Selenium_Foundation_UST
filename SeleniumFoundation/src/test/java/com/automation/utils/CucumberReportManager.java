package com.automation.utils;

import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class CucumberReportManager {

    static Scenario scenario;

    public static void initReport(Scenario scenario){
        CucumberReportManager.scenario=scenario;
    }

    public static void attachScreenShot(){
        scenario.attach(takeScreenShot(),"image/png","Snap Shot");
    }

    public static byte[] takeScreenShot(){
        TakesScreenshot takesScreenshot=(TakesScreenshot) DriverManager.driver;
        byte[] screenshot=takesScreenshot.getScreenshotAs(OutputType.BYTES);
        return screenshot;
    }
}


