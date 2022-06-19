package DemoqaTestTest;

import DemoqaBase.BaseDemoqa;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
;

public class WindowHandleTest extends BaseDemoqa {
    @BeforeMethod
    public void setUpPage() {
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/browser-windows");
    }

    @Test(priority = 1)
    public void openNewTab() {
        String parentWindow = driver.getWindowHandle();
        browserWindows.openaNewTab();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }

        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://demoqa.com/sample";
        Assert.assertEquals(actualUrl, expectedUrl);
    }

    @Test(priority = 2)
    public void openaNewWindow() {
        String parentWIndow = driver.getWindowHandle();
        browserWindows.openNewWindow();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://demoqa.com/sample";
    }

    @Test(priority = 3)
    public void openWindowMessage() {

        browserWindows.openMessageWindow();

    }

}
