package com.applitools.hackathon.holidayshopping.pageobjects;

import com.applitools.hackathon.holidayshopping.enums.Filter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.text.MessageFormat;

public class FilteredProductGridPage {
    private final WebDriver driver;

    public enum Locators {
        FILTER_CHECKBOX("#sidebar_filters #{0}"),
        FILTER_BUTTON("#filterBtn"),
        RESET_BUTTON("#resetBtn");

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

    public FilteredProductGridPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectFilter(Filter filter) {
        driver.findElement(By.cssSelector(Locators.FILTER_CHECKBOX.getWithParams(filter.getFilterId()))).click();
    }

    public void pressFilterButton() {
        driver.findElement(By.cssSelector(Locators.FILTER_BUTTON.get())).click();
    }

    public void pressResetButton() {
        driver.findElement(By.cssSelector(Locators.RESET_BUTTON.get())).click();
    }

}
