package DemoqaPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginDemoqa {
    public WebDriver driver;
    public WebDriverWait wdwait;

    public LoginDemoqa(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "userName")
    WebElement userName;
    @FindBy(id = "password")
    WebElement password;
    @FindBy(id = "login")
    WebElement loginButton;

    @FindBy(id = "userName-value")
    WebElement userIsLogIn;


    //----------METHODS

    public void inputUsername(String user) {
        userName.clear();
        userName.sendKeys(user);
    }

    public void inputPassword(String pass) {
        password.clear();
        password.sendKeys(pass);
    }

    public void loginOnPage() {
        loginButton.click();
    }

    public String textFromUserIsLogin() {
        return getUserIsLogIn().getText();
    }


    //------------GETTERS


    public WebElement getUserIsLogIn() {
        return userIsLogIn;
    }
}



