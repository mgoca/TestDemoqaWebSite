package DemoqaPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBoxDemoqa {
    public WebDriver driver;
    public WebDriverWait wdwait;


    public TextBoxDemoqa(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "userName")
    WebElement fullNameField;
    @FindBy(id = "userEmail")
    WebElement userEmailField;
    @FindBy(id = "currentAddress")
    WebElement currentAddressField;
    @FindBy(id = "permanentAddress")
    WebElement permanentAddressField;
    @FindBy(id = "submit")
    WebElement submitButton;
    //-------------------
    @FindBy(id = "output")
    WebElement output;
    @FindBy(id = "name")
    WebElement outputName;
    @FindBy(id = "email")
    WebElement outputEmail;
    @FindBy(xpath = "//p[@id='currentAddress']")
    WebElement outputCurrentAddress;
    @FindBy(xpath = "//p[@id='permanentAddress']")
    WebElement outputPermanentAddress;


    //---------METHODS

    public void inputFullName(String fName) {
        fullNameField.clear();
        fullNameField.sendKeys(fName);
    }

    public void inputUserEmail(String email) {
        userEmailField.clear();
        userEmailField.sendKeys(email);
    }

    public void inputCurrentAddress(String currentAddress) {
        currentAddressField.clear();
        currentAddressField.sendKeys(currentAddress);
    }

    public void inputPermanentAddress(String permanentAddress) {
        permanentAddressField.clear();
        permanentAddressField.sendKeys(permanentAddress);
    }

    public void clickSubmit() {
        submitButton.click();
    }
//----------MOZE I OVAKO

//        public void clickSubmitButton() {
//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//        jse.executeScript("arguments[0].scrollIntoView(true);", submitButton);
//        submitButton.click();
//    }

    //--------GETTERS


    public WebElement getSubmitButton() {
        return submitButton;
    }

    public WebElement getOutput() {
        return output;
    }

    public WebElement getOutputName() {
        return outputName;
    }

    public WebElement getOutputEmail() {
        return outputEmail;
    }

    public WebElement getOutputCurrentAddress() {
        return outputCurrentAddress;
    }

    public WebElement getOutputPermanentAddress() {
        return outputPermanentAddress;
    }

    //-------TEXT FROM ELEMENTS

    public String textFromOutputName() {
        return getOutputName().getText();
    }

    public String textFromOutputEmail() {
        return getOutputEmail().getText();
    }

    public String textFromOutputCurrentAddress() {
        return getOutputCurrentAddress().getText();
    }

    public String textFromOutputPermanentAddress() {
        return getOutputPermanentAddress().getText();
    }

}
