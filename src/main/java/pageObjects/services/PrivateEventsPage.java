package pageObjects.services;

import pageObjects.AbstractPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PrivateEventsPage extends AbstractPage {

    public PrivateEventsPage() {
        super();
    }

    @FindBy(xpath = "//div[@class='img-header__title']")
    private WebElement image_textHolder;

    @FindBy(xpath = "//h1[contains(text(),'Отметь свой праздник вместе с друзьями в Andy’s Pizza!')]")
    private WebElement headerOnPageRU;
    @FindBy(xpath = "//h1[contains(text(),'We like to be chosen by big companies')]")
    private WebElement headerOnPageEN;
    @FindBy(xpath = "//h1[contains(text(),'Serbează orice eveniment la ')]")
    private WebElement headerOnPageRO;

    @Override
    public void url() {
        url = "/private_events";
    }
}
