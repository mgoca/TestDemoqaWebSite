package DemoqaTestTest;

import DemoqaBase.BaseDemoqa;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ModalDialogsTest extends BaseDemoqa {

    @BeforeMethod
    public void setUpPage() {
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/modal-dialogs");

    }

    @Test(priority=1)
    public void openLargeModuleTest() {
        modalDialogs.clickOnLargeModalButton();

        Assert.assertTrue(modalDialogs.getCloseLargeModalButton().isDisplayed());

    }

    @Test(priority=2)
    public void openSmallModuleTest() {
        modalDialogs.clickOnSmalModalButton();

        Assert.assertTrue(modalDialogs.getSmallModalBodyMessage().isDisplayed());
    }

}
