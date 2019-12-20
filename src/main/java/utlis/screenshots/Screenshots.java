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

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

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
            byte[] source = resizeImage(ts.getScreenshotAs(OutputType.BYTES),620,480);
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
    public static void unhighlight(WebElement el){
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].style.boxShadow='none'", el);
    }
    static byte[] resizeImage(final byte[] imageInByte, int width, int height) throws IOException {
        BufferedImage image = ImageIO.read(new ByteArrayInputStream(imageInByte));
        final BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        final Graphics2D graphics2D = bufferedImage.createGraphics();
        graphics2D.setComposite(AlphaComposite.Src);
        //below three lines are for RenderingHints for better image quality at cost of higher processing time
        graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        graphics2D.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2D.drawImage(image, 0, 0, width, height, null);
        graphics2D.dispose();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ImageIO.write(bufferedImage, "png", byteArrayOutputStream);
        byteArrayOutputStream.flush();
        byte[] fromBufferedImage = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        return fromBufferedImage;
    }
}
