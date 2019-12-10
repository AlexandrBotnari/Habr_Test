import browser.Driver;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class test {
    @Test
    public void startDriver(){
        Driver.getDriver().get(Driver.getProperty("login.url"));

    }
}
