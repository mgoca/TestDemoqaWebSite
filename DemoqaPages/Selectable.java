package DemoqaPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selectable {
    public WebDriver driver;
    public WebDriverWait wdwait;

    public Selectable(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//ul[@id='verticalListContainer']/li[1]")
    WebElement first;
    @FindBy(xpath = "//ul[@id='verticalListContainer']/li[2]")
    WebElement second;

    public void selectFirstElement() {
        first.click();
    }

    public void selectSecondElement() {
        second.click();
    }

    public WebElement getFirst() {
        return first;
    }

    public WebElement getSecond() {
        return second;
    }
}
