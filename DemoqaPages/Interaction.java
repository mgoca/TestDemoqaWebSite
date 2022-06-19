package DemoqaPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Interaction {
    public WebDriver driver;
    public WebDriverWait wdwait;

    public Interaction(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='accordion']/div[5]/div/ul/li[1]")
    WebElement sortable;
    @FindBy(xpath = "//div[@class='accordion']/div[5]/div/ul/li[2]")
    WebElement selectable;
    @FindBy(xpath = "//div[@class='accordion']/div[5]/div/ul/li[3]")
    WebElement resizable;
    @FindBy(xpath = "//div[@class='accordion']/div[5]/div/ul/li[4]")
    WebElement droppable;


//-------METHODS

    public void sortableClick() {
        sortable.click();
    }

    public void droppableClick() {
        droppable.click();
    }

    public void selectableClick() {
        selectable.click();
    }

    public void resizableClick() {
        resizable.click();
    }

}
