package DemoqaTestTest;

import DemoqaBase.BaseDemoqa;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class WebTablesTest extends BaseDemoqa {
    @BeforeMethod
    public void setUpPage() {
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/webtables");
    }

    @Test
    public void addDeleteOneDataRowInTableTest() {

        webTables.addNewRow();
        webTables.inputFirstName("Tom");
        webTables.inputLastName("Talicni");
        webTables.inputEmail("tt@gmail.com");
        webTables.inputAge(35);
        webTables.inputSalary(100000);
        webTables.inputDepartment("Automation QA");
        webTables.clickOnSubmitButton();

        System.out.println(webTables.numberOfInsertRowsInTable());
        int actualNubmerOfRows = webTables.numberOfInsertRowsInTable();
        int expectedNumberOfRows = 4;
        Assert.assertEquals(actualNubmerOfRows, expectedNumberOfRows, "The  number of filled rows is not correct");


        webTables.deleteSecondRow();

        System.out.println(webTables.numberOfInsertRowsInTable());
        int newActualNumOfRows = webTables.numberOfInsertRowsInTable();
        int newExpectedNumberOfRows = 3;
        Assert.assertEquals(actualNubmerOfRows, expectedNumberOfRows, "The  number of filled rows is not correct");
    }
}