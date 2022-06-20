package com.base.web.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ItemResultsPage {

    WebDriver driver;

    public ItemResultsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".price-tag-fraction")
    List<WebElement> productList;

    public int getItemPrice() {
        WebElement firstProduct = productList.get(0);
        return Integer.parseInt(firstProduct.getText());
    }
}
