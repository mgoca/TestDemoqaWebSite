package DemoqaPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UploadAndDownload {
    public WebDriver driver;
    public WebDriverWait wdwait;

    public UploadAndDownload(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "downloadButton")
    WebElement downloadButton;
    @FindBy(id = "uploadFile")
    WebElement uploadFile;


}
