package pageObjects;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@Getter
public class HeaderMenu {

    public HeaderMenu() {
        super();
    }

    @FindBy(xpath = "//a[@class='bag__tobag']")
    private WebElement shoppingCart;

    @FindBy(xpath = "//div[@class='header__addt']//a[contains(@href,'https://www.andys.md/')]")
    private WebElement languages;

    @FindBy(xpath = "//a[@class='prodimgp']/div[contains(text(),'Lunch')]")
    private WebElement lunchButton1;

    @FindBy(xpath = "//div[@class='selphonenum__curr']")
    private WebElement cityCurrent;

    @FindBy(xpath = "//div/ul/li/span[contains(text(),'B')]")
    private WebElement baltiCity;

    @FindBy(xpath = "//div/ul/li/span[contains(text(),'C')]")
    private WebElement chisinauCity;

    @FindBy(xpath = "//ul[@class='dropmenu']//a[contains(@href,'restaurants')]")
    private WebElement restaurants;

    @FindBy(xpath = "//ul[@class='dropmenu']//a[contains(@href,'news')]")
    private WebElement news;

    @FindBy(xpath = "//ul[@class='dropmenu']//a[contains(@href,'cariera')]")
    private WebElement career;



}
