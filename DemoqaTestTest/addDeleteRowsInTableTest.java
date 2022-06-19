package DemoqaTestTest;

import DemoqaBase.BaseDemoqa;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.*;


public class addDeleteRowsInTableTest extends BaseDemoqa {

    @BeforeClass
    public void set() {
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/webtables");
    }

    @DataProvider(name = "data")
    public Object[][] dataProvider() {
        Faker faker = new Faker();
        return new Object[][]{

                {faker.name().firstName(), faker.name().lastName(), faker.internet().emailAddress(),
                        faker.number().numberBetween(21, 80), faker.number().numberBetween(1000, 10000), faker.job().title()},
                {faker.name().firstName(), faker.name().lastName(), faker.internet().emailAddress(),
                        faker.number().numberBetween(21, 80), faker.number().numberBetween(1000, 10000), faker.job().title()},
                {faker.name().firstName(), faker.name().lastName(), faker.internet().emailAddress(),
                        faker.number().numberBetween(21, 80), faker.number().numberBetween(1000, 10000), faker.job().title()},
                {faker.name().firstName(), faker.name().lastName(), faker.internet().emailAddress(),
                        faker.number().numberBetween(21, 80), faker.number().numberBetween(1000, 10000), faker.job().title()},
                {faker.name().firstName(), faker.name().lastName(), faker.internet().emailAddress(),
                        faker.number().numberBetween(21, 80), faker.number().numberBetween(1000, 10000), faker.job().title()},
                {faker.name().firstName(), faker.name().lastName(), faker.internet().emailAddress(),
                        faker.number().numberBetween(21, 80), faker.number().numberBetween(1000, 10000), faker.job().title()},
        };
    }


    @Test(dataProvider = "data", priority = 1)
    public void testAddMoreRowsDataInTable(String firstName, String lastName, String email, int age, int salary, String jobTitle) throws InterruptedException {

        webTables.addNewRow();
        webTables.inputFirstName(firstName);
        webTables.inputLastName(lastName);
        webTables.inputEmail(email);
        webTables.inputAge(age);
        webTables.inputSalary(salary);
        webTables.inputDepartment(jobTitle);
        webTables.clickOnSubmitButton();

        Thread.sleep(1000);
    }

    @Test(priority = 2)
    public void assertIsSumOfRowsCorrect() {
        System.out.println(webTables.numberOfInsertRowsInTable());

        int actualNubmerOfRows = webTables.numberOfInsertRowsInTable();
        int expectedNumberOfRows = 9;

        Assert.assertEquals(actualNubmerOfRows, expectedNumberOfRows, "The  number of  rows is not correct");

    }

    @Test(priority = 3)
    public void deleteRowsTest() {
        webTables.deleteRows();

        int actualNubmerOfRows = webTables.numberOfInsertRowsInTable();
        int expectedNumberOfRows = 0;
        System.out.println(actualNubmerOfRows);
        Assert.assertEquals(actualNubmerOfRows, expectedNumberOfRows, "The  number of  rows is not correct");
    }

}
