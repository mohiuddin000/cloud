package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleCloudHomePage {
    private WebDriver driver;
    //private By searchButton = By.xpath("//button[@aria-label='Search']");
    private By searchField = By.xpath("//input[@name='q']");

    public GoogleCloudHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://cloud.google.com/");
    }

    public void search(String query) {
        driver.findElement(searchField).sendKeys(query);

    }

    public void enter() {
        driver.get("https://cloud.google.com/s/results/?q=google%20cloud%20platform%20pricing%20calculator&text=google%20cloud%20platform%20pricing%20calculator");
    }
    

 
}
