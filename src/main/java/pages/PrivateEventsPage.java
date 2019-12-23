package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PrivateEventsPage extends AndysPage {

    public PrivateEventsPage() {
        super();
    }

    @FindBy(xpath = "//div[@class='img-header__title']")
    private WebElement image_textHolder;
    @FindBy(xpath ="//li[contains(@class,'dropmenu__item dropmenu__item_isdrop ')]/a[contains(text(),'Services')]" )
    private WebElement services;
    @FindBy(xpath = "//li[@class='dropmenu__item dropmenu__item_isdrop active']//li[1]")
    private WebElement walft;
    @FindBy(xpath = "//h1[contains(text(),'Отметь свой праздник вместе с друзьями в Andy’s Pizza!')]")
    private WebElement headerOnPageRU;
    @FindBy(xpath = "//h1[contains(text(),'We like to be chosen by big companies')]")
    private WebElement headerOnPageEN;
    @FindBy(xpath = "//h1[contains(text(),'Serbează orice eveniment la ')]")
    private WebElement headerOnPageRO;

    @Override
    public String getUrl() {
        url = "https://www.andys.md/en/private_events";
        return url;
    }
}
