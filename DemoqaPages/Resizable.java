package DemoqaPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Resizable {
    public WebDriver driver;
    public WebDriverWait wdwait;

    public Resizable(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@id='resizableBoxWithRestriction']/span")
    WebElement resizeWithRestriction;
    @FindBy(xpath = "//div[@id='resizable']/span")
    WebElement resizeNoRestriction;
    @FindBy(xpath = "//div[@class='constraint-area']")
    WebElement restrictionBox;

    //----------METHODS

    public void resizeElement(WebElement element, int offsetX, int offsetY) {
        Actions act = new Actions(driver);
        act.dragAndDropBy(element, offsetX, offsetY).build().perform();
        element.click();
    }


    //----------GETTERS
    public WebElement getResizeWithRestriction() {
        return resizeWithRestriction;
    }

    public WebElement getResizeNoRestriction() {
        return resizeNoRestriction;
    }

    public WebElement getRestrictionBox() {
        return restrictionBox;
    }
}
