package scenarios;

import model.*;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class chromeTests {

    @Test
    void basicPageFunctions() {
        System.setProperty(Constants.chromeDriverPropName, Constants.chromeDriverPath);

        WebDriver driver = new ChromeDriver();

        // Navigate to main page and initialize Main page instance
        driver.navigate().to(Constants.baseUrl);
        MainPage mainPg = new MainPage(driver);

        // scroll by ad and click on Elements
        mainPg.scrollBy(Constants.SCROLL_PIXELS);
        ElementsPage elementsPg = mainPg.clickElements();

        // Open buttons though sidebar and assert Main header text
        elementsPg.openButtons();
        String mainHeaderText = CommonActions.getMainHeaderText(elementsPg.getDriver());
        Assert.assertEquals(mainHeaderText, "Buttons");

        // Return to main page by clicking the header
        mainPg = CommonActions.clickHeader(elementsPg.getDriver());

        // Close browser
        driver.quit();
    }
}