package com.base.web.helper;

import com.base.web.page.HomePage;
import com.base.web.page.ItemResultsPage;
import com.base.web.util.Driver;

public class BaseHelper extends Driver {

    HomePage homePage = new HomePage(driver);
    ItemResultsPage itemResultsPage = new ItemResultsPage(driver);

    public int getFirstProductResultAmount(String keyword) {
        homePage.entersItemToSearch(keyword);
        return itemResultsPage.getItemPrice();
    }
}

