package com.base.web.test;

import com.base.web.helper.BaseHelper;
import com.base.web.util.Driver;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;

public class BlogSectionTests {

    static Driver driver = new Driver();
    BaseHelper baseHelper = new BaseHelper();

    @BeforeAll
    public static void setUp() {
        driver.createDriver();
    }

    @Test
    public void firstItemPriceShouldBeGreaterToExpectedPrice() throws InterruptedException {
        //preconditions
        String keyword = "gorra";
        int expectedProductPrice = 100;
        int obtainedProductPrice = 0;

        //Action
        obtainedProductPrice = baseHelper.getFirstProductResultAmount(keyword);

        //Verification
        assertThat(obtainedProductPrice, greaterThan(expectedProductPrice));
    }

    @AfterAll
    public static void tearDown() {
        driver.exitDriver();
    }
}
