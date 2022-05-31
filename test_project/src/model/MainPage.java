package model;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class MainPage {

    protected WebDriver driver;

    // Parametrized constructor
    public MainPage(WebDriver driver) {
        this.driver = driver;

        // Check URL
        String currentUrl = this.driver.getCurrentUrl();
        if (!Constants.baseUrl.equals(currentUrl)) {
            throw new IllegalStateException("Current URL is " + currentUrl + ", expected " + Constants.baseUrl);
        }
    }

    // Click on Elements
    public ElementsPage clickElements() {
        driver.findElement(Constants.mainPageElementsBy).click();

        return new ElementsPage(driver);
    }

    public void scrollBy(int pixels) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0, " + pixels + ")");
    }

    public WebDriver getDriver() {
        return driver;
    }
}
