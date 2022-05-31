package model;

import org.openqa.selenium.By;

public class Constants {
    public static final String chromeDriverPropName = "webdriver.chrome.driver",
            chromeDriverPath = "C:/Drivers/chromedriver.exe",
            baseUrl = "https://demoqa.com/",
            elementsUrl = baseUrl + "elements";

    public static final By pageHeaderBy = By.cssSelector("#app > header:nth-child(1) > a:nth-child(1)"),
            mainHeaderBy = By.cssSelector(".main-header"),
            mainPageElementsBy = By
                    .cssSelector("div.card:nth-child(1) > div:nth-child(1) > div:nth-child(3) > h5:nth-child(1)"),
            elementsMenuTextBox = By.xpath("//span[text()=\"Text Box\"]"),
            elementsMenuButtons = By.xpath("//span[text()=\"Buttons\"]");

    public static final int SCROLL_PIXELS = 4500;
}