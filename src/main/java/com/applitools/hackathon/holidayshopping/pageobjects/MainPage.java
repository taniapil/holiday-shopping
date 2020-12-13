package com.applitools.hackathon.holidayshopping.pageobjects;

import com.applitools.hackathon.holidayshopping.enums.Product;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.text.MessageFormat;

public class MainPage {
    private final WebDriver driver;

    public enum Locators {
        PRODUCT_GRID("#product_grid"),
        SELECT_PRODUCT("#product_grid #{0}");

        private final String locator;

        Locators(String locator) {
            this.locator = locator;
        }

        public String get() {
            return locator;
        }

        public String getWithParams(Object... params) {
            return MessageFormat.format(locator, params);
        }
    }

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectProduct(Product product) {
        driver.findElement(By.cssSelector(Locators.SELECT_PRODUCT.getWithParams(product.getProductId()))).click();
    }

}
