package DemoqaTestTest;

import DemoqaBase.BaseDemoqa;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class RegisterUserTest extends BaseDemoqa {
    @BeforeMethod
    public void setUpPage() {
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/register");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void registerWithValidDataTest() {

        registerNewUser.inputFirstname("Talicni");
        registerNewUser.insertLastname("Tom");
        registerNewUser.insertUsername("tt");
        registerNewUser.insertPassword("Pass123@@ ->");

        scrollDown();
        registerNewUser.clikOnRegistar();

        //----ovako reseno zbog recaptcha
        String expectedErrorMessage = "Please verify reCaptcha to register!";
        String actualErrorMessage = registerNewUser.textMessage();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);


    }


}
