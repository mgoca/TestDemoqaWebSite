package DemoqaTestTest;

import DemoqaBase.BaseDemoqa;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

//DOPUNITI TESTOVE
public class DropTest extends BaseDemoqa {

    @BeforeMethod
    public void setUpPage(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://demoqa.com/droppable/");
    }
   @Test
    public void DropTest() throws InterruptedException {


       Thread.sleep(1000);



       WebElement from = driver.findElement(By.id("draggable"));

       WebElement to = driver.findElement(By.id("droppable"));

       Actions act = new Actions(driver);

       // act.dragAndDrop(from, to).perform();

       // act.dragAndDropBy(from, 133, 22).perform();

       act.clickAndHold(from).moveToElement(to).release().build().perform();


       WebElement droppedMsg = driver.findElement(By.xpath("//div/p[text()='Dropped!']"));

       if (droppedMsg.isDisplayed()) {

           System.out.println("Success");

           System.out.println("Message is: "+droppedMsg.getText());

       } else {

           System.out.println("Failed");

       }
    }

}
