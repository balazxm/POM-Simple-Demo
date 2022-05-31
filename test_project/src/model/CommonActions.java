package model;

import org.openqa.selenium.WebDriver;

public class CommonActions {

    public static MainPage clickHeader(WebDriver driver) {
        driver.findElement(Constants.pageHeaderBy).click();

        return new MainPage(driver);
    }

    public static String getMainHeaderText(WebDriver driver) {
        return driver.findElement(Constants.mainHeaderBy).getText();
    }
}
