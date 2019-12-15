package utlis;

import pageObjects.AbstractPage;
import pageObjects.MenuPage;



public class Action extends AbstractPage {

    MenuPage menuPage = new MenuPage();

    public Action() {
        super();
    }


    public void GetRandomCategory() throws InterruptedException {
        RandomListSelect.GetRandomFromList(menuPage.getMenuList()).click();

    }

    public void GetRandomProduct() throws InterruptedException {
        RandomListSelect.GetRandomFromList(menuPage.getProductList()).click();
    }
}
