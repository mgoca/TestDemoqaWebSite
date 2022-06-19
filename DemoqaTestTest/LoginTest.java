package DemoqaTestTest;

import DemoqaBase.BaseDemoqa;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest extends BaseDemoqa {
    @BeforeMethod
    public void setUpPage(){
        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        driver.navigate().to("https://demoqa.com/login");
    }

    @Test
    public void testLoginOnSite() throws InterruptedException {

        loginDemoqa.inputUsername("tt");
        loginDemoqa.inputPassword("Pass123@@ ->");
        loginDemoqa.loginOnPage();

        Thread.sleep(3000);
        String actualUrl=driver.getCurrentUrl();
        String expectUrl="https://demoqa.com/profile";

        Assert.assertEquals(actualUrl,expectUrl);

        System.out.println(loginDemoqa.textFromUserIsLogin());
        Assert.assertTrue(loginDemoqa.getUserIsLogIn().isDisplayed());

    }

}

