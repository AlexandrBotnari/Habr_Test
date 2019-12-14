package pageObjects.services;

import pageObjects.AbstractPage;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
@Setter
public class LookingforTastersPage extends AbstractPage {

    public LookingforTastersPage() {
        super();
    }

    @FindBy(xpath = "//div[@class='img-header__title']")
    private WebElement image_textHolder;

    @Override
    public String url() {
url = "/we_are_looking_for_tasters";
        return null;
    }
}
