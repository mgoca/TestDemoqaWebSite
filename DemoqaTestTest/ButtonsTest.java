package DemoqaTestTest;

import DemoqaBase.BaseDemoqa;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class ButtonsTest extends BaseDemoqa {
    @BeforeMethod
    public void SetUpPage() {
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/buttons");
    }

    @Test(priority = 3)
    public void testDoubleClickButton() {
        buttons.performDoubleClick();

        String actualMessage = buttons.textFromDoubleClickMessage();
        System.out.println(actualMessage);

        String expectedMessage = "You have done a double click";
        System.out.println(expectedMessage);

        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test(priority = 2)
    public void testRightClickButton() {
        buttons.performRightClick();

        String actualMessage = buttons.textFromRightClickMessage();
        System.out.println(actualMessage);

        String expectedMessage = "You have done a right click";
        System.out.println(expectedMessage);

        Assert.assertEquals(actualMessage, expectedMessage);

    }

    @Test(priority = 1)
    public void testClickOnButton() {
        buttons.performClickOnButton();

        String actualMessage = buttons.textFromClickOnButtonMessage();
        System.out.println(actualMessage);

        String expectedMessage = "You have done a dynamic click";
        System.out.println(expectedMessage);

        Assert.assertEquals(actualMessage, expectedMessage);

    }


}
