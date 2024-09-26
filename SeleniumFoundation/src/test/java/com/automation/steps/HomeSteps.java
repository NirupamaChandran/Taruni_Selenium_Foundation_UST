package com.automation.steps;

import com.automation.pages.HomePage;
import io.cucumber.java.en.Given;


public class HomeSteps {

    HomePage homePage = new HomePage();

    @Given("user opens the website")
    public void user_opens_the_website() {
        homePage.openWebsite();
    }

    @Given("click shop now button")
    public void click_shop_now_button() {
        homePage.clickShopNow();
    }





}
