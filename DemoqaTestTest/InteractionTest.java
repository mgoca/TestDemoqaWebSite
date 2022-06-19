package DemoqaTestTest;

import DemoqaBase.BaseDemoqa;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class InteractionTest extends BaseDemoqa {
    @BeforeMethod
    public void setUpPage() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://demoqa.com/interaction");
    }

    @Test(priority = 1)
    public void sortableTest() throws InterruptedException {
        scrollDown();
        interaction.sortableClick();
        Thread.sleep(3000);
        sortable.closeAdvertise();
        sortable.moveElement(sortable.getOne(), sortable.getSix());
        sortable.moveElement(sortable.getOne(), sortable.getFive());
        sortable.moveElement(sortable.getOne(), sortable.getFour());
        sortable.moveElement(sortable.getOne(), sortable.getThree());
        sortable.moveElement(sortable.getOne(), sortable.getTwo());

        Thread.sleep(8000);
        String[] actual = sortable.textFromList();
        System.out.println(Arrays.toString(actual));

        String[] expected = {"Six", "Five", "Four", "Three", "Two", "One"};
        System.out.println(Arrays.toString(expected));

        Assert.assertEquals(actual, expected);
    }

    @Test(priority = 2)
    public void droppableTest() throws InterruptedException {
        scrollDown();
        interaction.droppableClick();
        Thread.sleep(8000);
        droppable.moveElement(droppable.getDragMeBox(), droppable.getDropHereBox());

        Assert.assertTrue(droppable.getMessageDropped().isDisplayed());

        String actualMessage = droppable.textFromMessageDropped();
        String expectedMessage = "Dropped!";
        Assert.assertEquals(actualMessage, expectedMessage);

        String actualColor = droppable.getDropHereBox().getCssValue("background-color");
        String expectedColor = "rgba(70, 130, 180, 1)";
        Assert.assertEquals(actualColor, expectedColor);

    }

    @Test(priority = 3)
    public void selectableTest() throws InterruptedException {
        scrollDown();
        interaction.selectableClick();
        Thread.sleep(3000);
        selectable.selectFirstElement();
        selectable.selectSecondElement();

        String classAttributeFirst = selectable.getFirst().getAttribute("class");
        System.out.println(classAttributeFirst);
        boolean isItem1Selected = classAttributeFirst.contains("active");

        String classAttributeSecond = selectable.getSecond().getAttribute("class");
        boolean isItem2Selected = classAttributeFirst.contains("active");

        Assert.assertTrue(isItem1Selected);
        Assert.assertTrue(isItem2Selected);
    }

    @Test(priority = 4)
    public void resizableTest() throws InterruptedException {
        scrollDown();
        interaction.resizableClick();
        Thread.sleep(5000);



        resizable.resizeElement(resizable.getResizeWithRestriction(), 150, 150);
        Thread.sleep(2000);
        int widthRestriction=resizable.getResizeWithRestriction().getSize().getWidth();
        int hightRestriction=resizable.getResizeWithRestriction().getSize().getHeight();
        System.out.println(widthRestriction +" "+hightRestriction);
        int newWidthRestricnion=driver.findElement(By.xpath("//div[@id='resizableBoxWithRestriction']")).getSize().getWidth();
        int newHightRestriction=driver.findElement(By.xpath("//div[@id='resizableBoxWithRestriction']")).getSize().getHeight();

        System.out.println(newHightRestriction+" "+newWidthRestricnion);



        scrollDown();
        Thread.sleep(2000);
        resizable.resizeElement(resizable.getResizeNoRestriction(), 250, 150);
        Thread.sleep(2000);

        int width=resizable.getResizeNoRestriction().getSize().getWidth();
        int hight=resizable.getResizeNoRestriction().getSize().getHeight();
        System.out.println(width +" "+hight);
        int newWidth=driver.findElement(By.xpath("//*[@id='resizable']")).getSize().getWidth();
        int newHight=driver.findElement(By.xpath("//*[@id='resizable']")).getSize().getHeight();

        System.out.println(newHight+" "+newWidth);
        Assert.assertNotEquals(width,newHight);
        Assert.assertNotEquals(hight,newHight);
    }
}
