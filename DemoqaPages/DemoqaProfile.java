package DemoqaPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoqaProfile {
    public WebDriver driver;
    public WebDriverWait wdwait;

    public DemoqaProfile(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
        PageFactory.initElements(driver, wdwait);
    }

    @FindBy(id = "gotoStore")
    WebElement storeButton;
    @FindBy(linkText = "Delete Account")
    WebElement deleteAccountButton;
    @FindBy(linkText = "Delete All Books")
    WebElement deleteAllBooksButton;
    //----------------------------
    @FindBy(id = "searchBox")
    WebElement searchBox;


    //------METHODS

    public void goToBookStore() {
        storeButton.click();
    }

    public void deleteAccount() {
        deleteAccountButton.click();
    }

    public void deleteAllBooks() {
        deleteAllBooksButton.click();
    }

    public void inputTextInSearhField(String text) {
        searchBox.sendKeys(text);
    }


    //------GETTERS

    public WebElement getStoreButton() {
        return storeButton;
    }
}
