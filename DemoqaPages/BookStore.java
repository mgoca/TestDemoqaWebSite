package DemoqaPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookStore {
    public WebDriver driver;
    public WebDriverWait wdwait;

    public BookStore(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
        PageFactory.initElements(driver, this);

    }

    @FindBy(linkText = "Git Pocket Guide")
    WebElement gitPocketBook;
    @FindBy(linkText = "Learning JavaScript Design Patterns")
    WebElement learningJavaScriptDesignPatterns;
    @FindBy(linkText = "Designing Evolvable Web APIs with ASP.NET")
    WebElement designingEvolvableWebAPIswithASPNET;
    @FindBy(linkText = "Speaking JavaScript")
    WebElement speakingJavaScript;
    @FindBy(linkText = "You Don't Know JS")
    WebElement youDontKnowJS;
    @FindBy(linkText = "Programming JavaScript Applications")
    WebElement programmingJavaScriptApplications;
    @FindBy(linkText = "Eloquent JavaScript, Second Edition")
    WebElement eloquentJavaScriptSecondEdition;
    @FindBy(linkText = "Understanding ECMAScript 6")
    WebElement understandingECMAScript6;

    //-----------METHODS

    public void lookAtGitPocketBook() {
        gitPocketBook.click();
    }

    public void lookAtLearningJavaScriptDesignPatterns() {
        learningJavaScriptDesignPatterns.click();
    }

    public void lookAtDesigningEvolvableWebAPIswithASPNET() {
        designingEvolvableWebAPIswithASPNET.click();
    }

    public void lookAtSpeakingJavaScript() {
        speakingJavaScript.click();
    }

    public void lookAtYouDontKnowJS() {
        youDontKnowJS.click();
    }

    public void lookAtProgrammingJavaScriptApplications() {
        programmingJavaScriptApplications.click();
    }

    public void lookAteLoquentJavaScriptSecondEdition() {
        eloquentJavaScriptSecondEdition.click();
    }

    public void lookAtUnderstandingECMAScript6() {
        understandingECMAScript6.click();
    }

}
