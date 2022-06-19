package DemoqaTestTest;

import DemoqaBase.BaseDemoqa;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TextBoxTest extends BaseDemoqa {

    @BeforeMethod
    public void setUpPage() {
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/text-box");
    }

    @Test
    public void inputCorrectDataInTextBoxTest() throws InterruptedException {
        textBoxDemoqa.inputFullName("Jon Doe");
        textBoxDemoqa.inputUserEmail("jd@gmail.com");
        textBoxDemoqa.inputCurrentAddress("Somewhere 1");
        textBoxDemoqa.inputPermanentAddress("Somewhere else 1");
        scrollDown();
        textBoxDemoqa.clickSubmit();

        Assert.assertTrue(textBoxDemoqa.getOutput().isDisplayed());

        String expectedNameOutput = "Name:Jon Doe";
        String actualNameOutput = textBoxDemoqa.textFromOutputName();
        Assert.assertEquals(actualNameOutput, expectedNameOutput);

        String expectedEmailOutput = "Email:jd@gmail.com";
        String actualEmailOutput = textBoxDemoqa.textFromOutputEmail();
        Assert.assertEquals(actualEmailOutput, expectedEmailOutput);

        String expectedCurrentAddressOutput = "Current Address :Somewhere 1";
        String actualCurrentAddressOutput = textBoxDemoqa.textFromOutputCurrentAddress();
        Assert.assertEquals(actualCurrentAddressOutput, expectedCurrentAddressOutput);


        //spelling mistake on site
        String expectedPermanentAddressOutput = "Permananet Address :Somewhere else 1";
        String actualPermanentAddressOutput = textBoxDemoqa.textFromOutputPermanentAddress();
        Assert.assertEquals(actualPermanentAddressOutput, expectedPermanentAddressOutput, "Letter mistake in last output.It says \"Permananet\".It should be \"Permanent\"!!!");


    }

}
