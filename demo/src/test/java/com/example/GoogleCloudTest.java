package com.example;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

public class GoogleCloudTest {
    private WebDriver driver;
    private GoogleCloudHomePage homePage;
    private GoogleCloudSearchResultsPage searchResultsPage;
    private GoogleCloudPlatformPricingCalculatorPage googleCloudPlatformPricingCalculatorPage;

    @Before
    public void setup() {
        driver = new ChromeDriver(); 
        homePage = new GoogleCloudHomePage(driver);
        searchResultsPage = new GoogleCloudSearchResultsPage(driver);
        googleCloudPlatformPricingCalculatorPage = new GoogleCloudPlatformPricingCalculatorPage(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

  /*  @After
    public void teardown() {
        driver.quit();
    }*/

    @Test
    public void testGoogleCloudPricingCalculator() throws InterruptedException {
        // Open the Google Cloud homepage
        homePage.open();

        // Search for "Google Cloud Platform Pricing Calculator"
        homePage.search("Google Cloud Platform Pricing Calculator");


        homePage.enter();
        // Click the search result link
        searchResultsPage.clickSearchResultLink();

        googleCloudPlatformPricingCalculatorPage.fillform();

        // Click the "Compute Engine" button
         }
}
