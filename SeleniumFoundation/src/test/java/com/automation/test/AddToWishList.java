package com.automation.test;

import com.automation.utils.DataProviderClass;
import org.junit.Assert;
import org.testng.annotations.Test;

public class AddToWishList extends BaseTest{

    @Test(dataProvider = "data", dataProviderClass = DataProviderClass.class)
    public void verifyAddToWishList(String searchItem){
        homePage.openWebsite();
        homePage.searchItem(searchItem);
        homePage.clickWishList();
        Assert.assertEquals("1",homePage.checkWishListCount());
    }
}




