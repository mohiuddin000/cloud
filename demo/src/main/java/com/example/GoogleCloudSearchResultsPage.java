package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleCloudSearchResultsPage {
    private WebDriver driver;
    private By searchResultLink = By.xpath("(//a[@class='gs-title'])[1]");

    public GoogleCloudSearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSearchResultLink() {
        driver.findElement(searchResultLink).click();
    }
}
