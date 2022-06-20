package com.base.web.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "cb1-edit")
    WebElement searchFieldLocator;

    @FindBy(css = ".nav-search-btn")
    WebElement searchButtonLocator;

    public void entersItemToSearch(String itemToSearch) {
        searchFieldLocator.sendKeys(itemToSearch);
        searchButtonLocator.click();
    }
}
