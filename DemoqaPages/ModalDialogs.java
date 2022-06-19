package DemoqaPages;

import DemoqaBase.BaseDemoqa;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ModalDialogs extends BaseDemoqa {
    public WebDriver driver;
    public WebDriverWait wdwait;

    public ModalDialogs(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "showSmallModal")
    WebElement smallModalButton;
    @FindBy(id = "showLargeModal")
    WebElement largeModalButton;
    @FindBy(id = "closeSmallModal")
    WebElement closeSmallModalButton;
    @FindBy(id = "closeLargeModal")
    WebElement closeLargeModalButton;
    @FindBy(className = "modal-body")
    WebElement largeModalBodyMessage;
    @FindBy(className = "modal-content")
    WebElement smallModalBodyMessage;

    //---------METHODS

    public void clickOnSmalModalButton() {
        smallModalButton.click();
    }

    public void clickOnLargeModalButton() {
        largeModalButton.click();
    }

    public String textFromLargeModalBodyMessage() {
        return getLargeModalBodyMessage().getText();
    }

    public void closeSmallModal(){
        closeSmallModalButton.click();
    }
    public void closeLargeModal(){
        closeLargeModalButton.click();
    }

    //--------GETTERS


    public WebElement getSmallModalButton() {
        return smallModalButton;
    }

    public WebElement getLargeModalButton() {
        return largeModalButton;
    }

    public WebElement getCloseSmallModalButton() {
        return closeSmallModalButton;
    }

    public WebElement getCloseLargeModalButton() {
        return closeLargeModalButton;
    }

    public WebElement getLargeModalBodyMessage() {
        return largeModalBodyMessage;
    }

    public WebElement getSmallModalBodyMessage() {
        return smallModalBodyMessage;
    }
}
