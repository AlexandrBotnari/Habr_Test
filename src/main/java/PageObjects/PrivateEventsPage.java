package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PrivateEventsPage extends AbstarctPage {
    @FindBy(xpath = "//body/header[@class='header header_fix']/div[@class='container']/div[@class='header__content']/div[@class='header__menu']/div[@class='header__main']/div[@class='header__navbar']/ul[@class='dropmenu']/li[5]/a[1]")
    private WebElement s1;

    @FindBy(xpath = "//div[@class='img-header__title']")
    private WebElement image_textHolder;

    @FindBy(xpath = "//h1[contains(text(),'Отметь свой праздник вместе с друзьями в Andy’s Pizza!')]")
    private WebElement headerOnPage;

    public void Testrrr() {
        s1.click();
        System.out.println(headerOnPage.getText());
        Assert.assertEquals("Отметь свой праздник вместе с друзьями в Andy’s Pizza!",headerOnPage.getText());
    }
}
