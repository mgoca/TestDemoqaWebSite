package DemoqaPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserWindows {
    public WebDriver driver;
    public WebDriverWait wdwait;
    public BrowserWindows(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="tabButton")
    WebElement newTabButton;
    @FindBy(id="windowButton")
    WebElement newWindowButton;
    @FindBy(id="messageWindowButton")
    WebElement messWindowButton;


    //-------METHODS

    public void openaNewTab(){
        newTabButton.click();
    }
    public void openNewWindow(){
        newWindowButton.click();
    }
    public void openMessageWindow(){
        messWindowButton.click();
    }

}
