package DemoqaBase;
import DemoqaPages.*;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import java.io.IOException;
import java.time.Duration;

public class BaseDemoqa {
    public WebDriver driver;
    public WebDriverWait wdwait;
    public TextBoxDemoqa textBoxDemoqa;
    public WebTables webTables;
    public Buttons buttons;
    public ModalDialogs modalDialogs;
    public RegisterNewUser registerNewUser;
    public LoginDemoqa loginDemoqa;
    public BookStore bookStore;
    public DemoqaProfile demoqaProfile;
    public Interaction interaction;
    public Sortable sortable;
    public Droppable droppable;
    public Selectable selectable;
    public Resizable resizable;
    public Alerts alerts;
    public BrowserWindows browserWindows;


    @BeforeClass
    public void setUp() {
        ChromeDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        textBoxDemoqa = new TextBoxDemoqa(driver, wdwait);
        webTables = new WebTables(driver, wdwait);
        buttons = new Buttons(driver, wdwait);
        modalDialogs = new ModalDialogs(driver, wdwait);
        registerNewUser = new RegisterNewUser(driver, wdwait);
        loginDemoqa = new LoginDemoqa(driver, wdwait);
        bookStore = new BookStore(driver, wdwait);
        demoqaProfile = new DemoqaProfile(driver, wdwait);
        interaction = new Interaction(driver, wdwait);
        sortable = new Sortable(driver, wdwait);
        droppable = new Droppable(driver, wdwait);
        selectable = new Selectable(driver, wdwait);
        resizable = new Resizable(driver, wdwait);
        alerts = new Alerts(driver, wdwait);
        browserWindows = new BrowserWindows(driver, wdwait);

    }

    public void waiter(WebElement element) {
        wdwait.until(ExpectedConditions.visibilityOf(element));

    }

    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
    }

    public void scrollIntoView(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void logInOnPage() {

        loginDemoqa.inputUsername("tt");
        loginDemoqa.inputPassword("Pass123@@ ->");
        loginDemoqa.loginOnPage();
    }

    @AfterClass
    public void tearDown() throws IOException {
       // driver.close();
        //driver.quit();
    }

    @AfterSuite
    public void end() throws IOException {
       //   Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
    }
}
