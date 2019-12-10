package pageObjects.services;

import pageObjects.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PrivateEventsPage extends Page {

    @FindBy(xpath = "//div[@class='img-header__title']")
    private WebElement image_textHolder;

    @FindBy(xpath = "//h1[contains(text(),'Отметь свой праздник вместе с друзьями в Andy’s Pizza!')]")
    private WebElement headerOnPageRU;
    @FindBy(xpath = "//h1[contains(text(),'We like to be chosen by big companies')]")
    private WebElement headerOnPageEN;
    @FindBy(xpath = "//h1[contains(text(),'Serbează orice eveniment la ')]")
    private WebElement headerOnPageRO;


}
