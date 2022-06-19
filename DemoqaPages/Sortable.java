package DemoqaPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Sortable {
    public WebDriver driver;
    public WebDriverWait wdwait;

    public Sortable(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[@id='demo-tabpane-list']/div/div[1]")
    WebElement one;
    @FindBy(xpath = "//div[@id='demo-tabpane-list']/div/div[2]")
    WebElement two;
    @FindBy(xpath = "//div[@id='demo-tabpane-list']/div/div[3]")
    WebElement three;
    @FindBy(xpath = "//div[@id='demo-tabpane-list']/div/div[4]")
    WebElement four;
    @FindBy(xpath = "//div[@id='demo-tabpane-list']/div/div[5]")
    WebElement five;
    @FindBy(xpath = "//div[@id='demo-tabpane-list']/div/div[6]")
    WebElement six;
    //--------
    @FindBy(id="close-fixedban")
    WebElement closeAdds;
    @FindBy(xpath =
            "//div[@class='vertical-list-container mt-4']/div[@class='list-group-item list-group-item-action']")
    List<WebElement>listElements;


    //-------METHODS

    public void moveElement(WebElement element1, WebElement element2) {
        Actions act = new Actions(driver);
        act.dragAndDrop(element1, element2).build().perform();
    }
    public void closeAdvertise(){
        closeAdds.click();
    }
    public String[] textFromList(){
        List<String> list=new ArrayList<>();
        for(int i=0;i<listElements.size();i++){
            list.add(getListElements().get(i).getText());
        }
        String[] nova = list.toArray(new String[0]);
        return nova;
    }




  //-------GETTERS

    public WebElement getOne() {
        return one;
    }

    public WebElement getTwo() {
        return two;
    }

    public WebElement getThree() {
        return three;
    }

    public WebElement getFour() {
        return four;
    }

    public WebElement getFive() {
        return five;
    }

    public WebElement getSix() {
        return six;
    }

    public List<WebElement> getListElements() {
        return listElements;
    }

}
