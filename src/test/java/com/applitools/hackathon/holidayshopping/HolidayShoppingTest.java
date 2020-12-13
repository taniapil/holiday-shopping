package com.applitools.hackathon.holidayshopping;

import com.applitools.hackathon.holidayshopping.enums.Checkpoint;
import com.applitools.hackathon.holidayshopping.enums.Filter;
import com.applitools.hackathon.holidayshopping.enums.Product;
import com.applitools.hackathon.holidayshopping.pageobjects.FilteredProductGridPage;
import com.applitools.hackathon.holidayshopping.pageobjects.MainPage;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HolidayShoppingTest extends TestBase {

    private MainPage mainPage;
    private FilteredProductGridPage filteredProductGridPage;

    @BeforeClass(alwaysRun = true, dependsOnMethods = "setUp")
    void initialise() {
        mainPage = new MainPage(driver);
        filteredProductGridPage = new FilteredProductGridPage(driver);
    }

    @Test
    public void testMainPage() {
        driver.get(System.getProperty("site.url"));
        validate("AppliFashion", "Test 1", "main page");
    }

    @Test(dependsOnMethods = "testMainPage")
    public void testFilteredProductGrid() {
        filteredProductGridPage.selectFilter(Filter.COLOR_BLACK);
        filteredProductGridPage.pressFilterButton();
        validate("AppliFashion", "Test 2", "filter by color", Checkpoint.REGION, driver.findElement(By.cssSelector(MainPage.Locators.PRODUCT_GRID.get())));
    }

    @Test(dependsOnMethods = "testFilteredProductGrid")
    public void testProductDetails() {
        filteredProductGridPage.pressResetButton();
        mainPage.selectProduct(Product.APPLI_AIR_X_NIGHT);
        validate("AppliFashion", "Test 3", "product details");
    }
}
