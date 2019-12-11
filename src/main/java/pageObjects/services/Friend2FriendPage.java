package pageObjects.services;

import pageObjects.Page;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
@Setter
public class Friend2FriendPage extends Page {

    @FindBy(xpath = "//h1/strong")
    private WebElement textHeader;

    @FindBy(xpath = "(//p/u/strong)[4]")
    private WebElement lastPoint;
}
