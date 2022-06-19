package DemoqaTestTest;

import DemoqaBase.BaseDemoqa;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsTest extends BaseDemoqa {

    @BeforeMethod
    public void setUpPage() {
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/alerts");
    }

    @Test(priority = 1)
    public void simpleAlertTest() {
        alerts.clickOnAlertButton();
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println(alertText);
        alert.accept();
    }

    @Test(priority = 5)
    public void timerAlertTest() throws InterruptedException {
        alerts.clickOnTimerAlertButton();
        wdwait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        Thread.sleep(7000);
        String alertText1 = alert.getText();
        System.out.println(alertText1);
        alert.accept();
    }

    @Test(priority = 3)
    public void dismissAlertTest() {
        alerts.clickOnConfirmAlertButton();
        Alert alert = driver.switchTo().alert();
        alert.dismiss();

        String actual=alerts.textFromAlert();
        String expected="You selected Cancel";
        Assert.assertEquals(actual,expected);
    }

    @Test(priority = 4)
    public void inputTextInAlertTest() {
        alerts.clickOnPromtAlertButton();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Jone");
        alert.accept();

        String actualMessage=alerts.textFromPrompAlert();
        String expectedMessage="You entered Jone";
        Assert.assertEquals(actualMessage,expectedMessage);
    }
}
