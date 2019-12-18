package utlis;

import org.junit.Assert;
import pageObjects.*;
import org.apache.log4j.Logger;
import lombok.Getter;

@Getter
public class Action extends AbstractPage {

    private static org.apache.log4j.Logger logger = Logger.getLogger(Action.class);

    HomePage homePage = new HomePage();
    CartPage cartPage = new CartPage();
    MenuPage menuPage = new MenuPage();
    CareerPage careerPage = new CareerPage();



    public Action() {
        super();
    }

    public void GetRandomCategory() {
        logger.info("Gets Random Category");
        RandomListSelect.GetRandomFromList(menuPage.getMenuList()).click();
    }

    public void GetRandomProduct() {
        logger.info("Gets Random Product");
        RandomListSelect.GetRandomFromList(menuPage.getProductList()).click();
    }

    public void RemoveRandomFromCart() {
        logger.info("Removes Random product from cart");
        RandomListSelect.GetRandomFromList(cartPage.getRemoveFromCart()).click();
}

    public void GetRandomProductPhoto() {
        logger.info("Gets Random product photo");
        RandomListSelect.GetRandomFromList(menuPage.getProductPhotoList()).click();
    }

    public void EnterDataInRandomField() {
        logger.info("Enters data in random Field");
        RandomListSelect.GetRandomFromList(careerPage.getInformationFillList()).click();
    }




    @Override
    public String getUrl() {
        return null;
    }
}
