package DemoqaPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Droppable {
    public WebDriver driver;
    public WebDriverWait wdwait;

    public Droppable(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "draggable")
    WebElement dragMeBox;
    @FindBy(id = "droppable")
    WebElement dropHereBox;
    @FindBy(xpath = "//div/p[text()='Dropped!']")
    WebElement messageDropped;

    public void moveElement(WebElement element1, WebElement element2) {
        Actions act = new Actions(driver);
        // act.dragAndDrop(element1,element2).perform();
        act.clickAndHold(element1).moveToElement(element2).release().build().perform();
    }

    public WebElement getDragMeBox() {
        return dragMeBox;
    }

    public WebElement getDropHereBox() {
        return dropHereBox;
    }

    public String textFromMessageDropped() {
        return getMessageDropped().getText();
    }


    //-------GETTTERS

    public WebElement getMessageDropped() {
        return messageDropped;
    }
}

