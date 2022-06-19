package DemoqaTestTest;

import DemoqaBase.BaseDemoqa;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;



//Not working,need to change
public class SortTestWebTable extends BaseDemoqa {
    @BeforeMethod
    public void setUpPage() {
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/webtables");
    }

    @Test
    public void sortFirstName() throws InterruptedException {
        webTables.sortTableFirstName();
        Thread.sleep(3000);


        List<String> expected = webTables.sortFirstNames();
        System.out.println(webTables.sortFirstNames());

        List<String> actual = webTables.actualFirstName();
        System.out.println(webTables.actualFirstName());
        Assert.assertEquals(actual, expected);
    }

   }


