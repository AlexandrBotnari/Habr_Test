package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PrivateEventsPage extends AbstractPage {

    @FindBy(xpath = "//div[@class='img-header__title']")
    private WebElement image_textHolder;

    @FindBy(xpath = "//h1[contains(text(),'Отметь свой праздник вместе с друзьями в Andy’s Pizza!')]")
    private WebElement headerOnPage;


}
