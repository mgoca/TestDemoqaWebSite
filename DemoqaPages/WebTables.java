package DemoqaPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WebTables {
    public WebDriver driver;
    public WebDriverWait wdwait;

    public WebTables(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "addNewRecordButton")
    WebElement addButton;
    @FindBy(id = "searchBox")
    WebElement searchBox;
    @FindBy(className = "rt-td")
    List<WebElement> tableRowsList;

    @FindBy(xpath = "//*[contains(@class,'rt-tr -odd')]")
    List<WebElement> listOddRows;
    @FindBy(xpath = "//*[contains(@class,'rt-tr -even')]")
    List<WebElement> listEvenRows;

    @FindBy(xpath = "//*[contains(@class,'action-buttons')]/*[contains(@id,'delete-record')]")
    WebElement deleteRow;
    @FindBy(id = "delete-record-2")
    WebElement deleteSecondRow;

    //-----ELEMENTS FOR SORT METHODS

    @FindBy(xpath = "//*[@class='rt-table']/div/div/div/div[1]")
    WebElement sortFirstName;
    @FindBy(xpath = "//*[@class='rt-tbody']/div/div/div[1]")
    List<WebElement> firstNames;
    @FindBy(xpath = "//*[@class='rt-table']/div/div/div[2]/div[1]")
    WebElement sortLastName;
    @FindBy(xpath = "//*[@class='rt-body']/div/div/div[2]")
    List<WebElement> lastNames;


    //--------REGISTRATION FORM

    @FindBy(id = "firstName")
    WebElement firstNameField;
    @FindBy(id = "lastName")
    WebElement lastNameField;
    @FindBy(id = "userEmail")
    WebElement userEmailField;
    @FindBy(id = "age")
    WebElement ageField;
    @FindBy(id = "salary")
    WebElement salaryField;
    @FindBy(id = "department")
    WebElement departmentField;
    @FindBy(id = "submit")
    WebElement submitButton;

    //---------METHODS

    public void addNewRow() {
        addButton.click();
    }

    public void inputFirstName(String fname) {
        firstNameField.clear();
        firstNameField.sendKeys(fname);
    }

    public void inputLastName(String lname) {
        lastNameField.clear();
        lastNameField.sendKeys(lname);
    }

    public void inputEmail(String email) {
        userEmailField.clear();
        userEmailField.sendKeys(email);
    }

    public void inputAge(int userAge) {
        ageField.clear();
        ageField.sendKeys(String.valueOf(userAge));
    }

    public void inputSalary(int salary) {
        salaryField.clear();
        salaryField.sendKeys(String.valueOf(salary));
    }

    public void inputDepartment(String department) {
        departmentField.clear();
        departmentField.sendKeys(department);
    }

    public void clickOnSubmitButton() {
        submitButton.click();
    }

    public int numberOfInsertRowsInTable() {
        return getListEvenRows().size() + getListOddRows().size();
    }

    public void deleteRows() {
        for (int i = getListEvenRows().size() + getListOddRows().size(); i > 0; i--) {
            deleteRow.click();
        }
    }

    public void deleteSecondRow() {
        deleteSecondRow.click();
    }


    //--------Sort methods

    public void sortTableFirstName() {
        getSortFirstName().click();
    }

    public void sortTableLastName() {
        getSortLastName().click();
    }

    public List<String> sortFirstNames() {
        List<String> names = new ArrayList<>();
        List<WebElement> listFirst = this.getFirstNames();
        for (int i = 0; i < listFirst.size(); i++) {

            names.add(getFirstNames().get(i).getText());
        }
        names.sort(Comparator.naturalOrder());
        return names;
    }

    public List<String> actualFirstName() {
        List<String> names = new ArrayList<>();
        for (int i = 0; i < this.firstNames.size(); i++) {

            names.add(this.getFirstNames().get(i).getText());

        }
        return names;
    }

    public List<String> sortLastNames() {
        List<String> names = new ArrayList<>();
        List<WebElement> listLast = this.getLastNames();
        for (int i = 0; i < listLast.size(); i++) {
            names.add(getLastNames().get(i).getText());
        }
        names.sort(Comparator.naturalOrder());
        return names;
    }

    public List<String> actualLastNames() {
        List<String> names = new ArrayList<>();
        for (int i = 0; i < this.lastNames.size(); i++) {

            names.add(this.getFirstNames().get(i).getText());
            //  names.sort(Comparator.naturalOrder());
        }
        return names;
    }


    //-------GETTERS


    public WebElement getSortFirstName() {
        return sortFirstName;
    }

    public List<WebElement> getFirstNames() {
        return firstNames;
    }

    public WebElement getSortLastName() {
        return sortLastName;
    }

    public List<WebElement> getLastNames() {
        return lastNames;
    }

    public List<WebElement> getTableRowsList() {
        return tableRowsList;
    }


    public List<WebElement> getListFilledRows() {
        return listOddRows;
    }

    public void dataFromRows() {
        for (int i = 0; i < tableRowsList.size(); i++)
            System.out.println(getTableRowsList().get(i).getText());

    }

    public int countRows() {

        return listOddRows.size();

    }

    public List<WebElement> getListOddRows() {
        return listOddRows;
    }

    public List<WebElement> getListEvenRows() {
        return listEvenRows;
    }
}



