package model;

import org.openqa.selenium.WebDriver;

public class ElementsPage {
    protected WebDriver driver;

    // Parametrized constructor
    public ElementsPage(WebDriver driver) {
        this.driver = driver;

        // Check URL
        String currentUrl = this.driver.getCurrentUrl();
        if (!Constants.elementsUrl.equals(currentUrl)) {
            throw new IllegalStateException("Current URL is " + currentUrl + ", expected " + Constants.elementsUrl);
        }
    }

    public void openButtons() {
        // Open Buttons though the sidebar
        driver.findElement(Constants.elementsMenuButtons).click();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
