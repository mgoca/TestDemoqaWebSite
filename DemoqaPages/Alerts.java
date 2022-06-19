package DemoqaPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts {
    public WebDriver driver;
    public WebDriverWait wdwait;

    public Alerts(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "alertButton")
    WebElement alertButton;
    @FindBy(id = "timerAlertButton")
    WebElement timerAlert;
    @FindBy(id = "confirmButton")
    WebElement confirmAlertButton;
    @FindBy(id = "promtButton")
    WebElement promtAlertButton;
    @FindBy(id = "confirmResult")
    WebElement confirmResult;
    @FindBy(id = "promptResult")
    WebElement promptResult;

    //--------METHODS

    public void clickOnAlertButton() {
        alertButton.click();
    }

    public void clickOnTimerAlertButton() {
        timerAlert.click();
    }

    public void clickOnConfirmAlertButton() {
        confirmAlertButton.click();
    }

    public void clickOnPromtAlertButton() {
        promtAlertButton.click();
    }

    public String textFromAlert() {
        return getConfirmResult().getText();
    }

    public String textFromPrompAlert() {
        return getPromptResult().getText();
    }


    //--------GETTERS

    public WebElement getConfirmResult() {
        return confirmResult;
    }

    public WebElement getPromptResult() {
        return promptResult;
    }
}
