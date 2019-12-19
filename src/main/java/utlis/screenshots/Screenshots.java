package utlis.screenshots;

import cucumber.api.Scenario;
import org.apache.commons.io.FileUtils;
import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;

import static browser.Driver.getDriver;

public class Screenshots {
    private final static DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd-HH-mm-ss");

    private static Scenario scenario;
    private static String time;


    public static void setScenario(Scenario scenario) {
        Screenshots.scenario = scenario;
        Screenshots.time = formatter.print(LocalDateTime.now());

    }

    public static void screenshot(String name) {
        try {
            TakesScreenshot ts = (TakesScreenshot) getDriver();
            byte[] source = ts.getScreenshotAs(OutputType.BYTES);
            scenario.embed(source, "image/png");
            FileUtils.writeByteArrayToFile(new File("target/screenshots/" + scenario.getName() + "/" + time + "/" + name + ".png"), source);
        } catch (Exception e) {
            System.out.println("Exception while taking screenshots" + e.getMessage());

        }
    }

    public static void highLighterMethod(WebElement el) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');", el);


    }
}
