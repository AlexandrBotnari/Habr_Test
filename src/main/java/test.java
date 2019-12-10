import browser.Driver;
import browser.DriverType;
import browser.PropertyReader;
import org.junit.Before;
import org.junit.Test;


public class test {

    private PropertyReader propertyReader;
    private Driver driver;

    @Before
    public void startDriver(){
        propertyReader = new PropertyReader();
        Driver.createDriver(DriverType.IE);
        Driver.getDriver().manage().window().maximize();
    }

    @Test
    public void x(){
        Driver.getDriver().get("https://www.google.com/");

    }

}
