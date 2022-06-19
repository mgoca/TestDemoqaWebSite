package DemoqaPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterNewUser {

    public WebDriver driver;
    public WebDriverWait wdwait;

    public RegisterNewUser(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "firstname")
    WebElement firstname;
    @FindBy(id = "lastname")
    WebElement lastName;
    @FindBy(id = "userName")
    WebElement userName;
    @FindBy(id = "password")
    WebElement password;
    @FindBy(className = "recaptcha-checkbox-border")
    WebElement notARobot;
    @FindBy(id = "register")
    WebElement registerButton;
    @FindBy(className = "mb-1")
    WebElement errorMessage;


    public void inputFirstname(String name) {
        //  firstname.clear();
        firstname.sendKeys(name);
    }

    public void insertLastname(String last) {
        lastName.clear();
        lastName.sendKeys(last);
    }

    public void insertUsername(String user) {
        userName.clear();
        userName.sendKeys(user);
    }

    public void insertPassword(String pass) {
        password.clear();
        password.sendKeys(pass);
    }

    public void clickNotaRobot() {
        notARobot.click();
    }

    public void clikOnRegistar() {
        registerButton.click();
    }

    public String textMessage() {
        return errorMessage.getText();
    }

}
