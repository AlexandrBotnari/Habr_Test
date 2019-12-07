import Browser.DriverManager;
import Browser.DriverType;
import PageObjects.PrivateEventsPage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


public class TestTest {

    @Test
    public void test(){
        DriverManager.createDriver(DriverType.CHROME);
        WebDriver webDriver = DriverManager.getDriver();
        webDriver.get("https://www.andys.md/ru");
        System.out.println(webDriver.getTitle());



        PrivateEventsPage privateEventsPage =new PrivateEventsPage();
        privateEventsPage.init(webDriver);

        privateEventsPage.Testrrr();
        webDriver.quit();
    }
}
