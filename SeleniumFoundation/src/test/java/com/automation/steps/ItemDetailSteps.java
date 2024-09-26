package com.automation.steps;

import com.automation.pages.ItemDetailPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ItemDetailSteps {

    ItemDetailPage itemDetailPage = new ItemDetailPage();

    @Then("verify user is on item detail page")
    public void verify_user_is_on_item_detail_page() {
        Assert.assertTrue(itemDetailPage.detailPageIsDisplayed());
    }

    @Then("select size and click add to cart button")
    public void select_size_and_click_add_to_cart_button() {
        itemDetailPage.addToCart();
    }

    @Then("verify item is added to the cart")
    public void verifyItemIsAddedToTheCart() {
    }
}
