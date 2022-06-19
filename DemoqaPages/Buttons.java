package DemoqaPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Buttons {
    public WebDriver driver;
    public WebDriverWait wdwait;

    public Buttons(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "doubleClickBtn")
    WebElement doubleClickButton;
    @FindBy(id = "rightClickBtn")
    WebElement rightClickButton;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]/button[1]")
    WebElement clickButton;
    @FindBy(id = "doubleClickMessage")
    WebElement doubleClickMessage;
    @FindBy(id = "rightClickMessage")
    WebElement rightClickMessage;
    @FindBy(id = "dynamicClickMessage")
    WebElement clickOnButtonMessage;


    //---------METHODS

    public void performDoubleClick() {
        Actions act = new Actions(driver);
        act.doubleClick(doubleClickButton).perform();
    }

    public void performRightClick() {
        Actions act = new Actions(driver);
        act.contextClick(rightClickButton).perform();
    }

    public void performClickOnButton() {
        clickButton.click();
    }


    //----------GETTERS

    public WebElement getDoubleClickMessage() {
        return doubleClickMessage;
    }

    public WebElement getRightClickMessage() {
        return rightClickMessage;
    }

    public WebElement getClickOnButtonMessage() {
        return clickOnButtonMessage;
    }


    //----------TEXT FROM ELEMENT

    public String textFromDoubleClickMessage() {
        return getDoubleClickMessage().getText();
    }

    public String textFromRightClickMessage() {
        return getRightClickMessage().getText();
    }

    public String textFromClickOnButtonMessage() {
        return getClickOnButtonMessage().getText();
    }
}
