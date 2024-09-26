package com.automation.steps;

import com.automation.pages.ItemListPage;
import io.cucumber.java.en.When;

public class ItemListSteps {

    ItemListPage itemListPage = new ItemListPage();

    @When("user click first element")
    public void user_click_first_element() {
        itemListPage.selectProduct();
    }
}
