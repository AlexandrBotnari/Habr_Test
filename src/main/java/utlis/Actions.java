package utlis;

import pageObjects.AbstractPage;
import pageObjects.MenuPage;



public class Actions extends AbstractPage {

    MenuPage menuPage = new MenuPage();

    public Actions() {
        super();
    }


    public void GetRandomCategory() throws InterruptedException {
        RandomListSelect.GetRandomFromList(menuPage.getMenuList()).click();

    }

    public void GetRandomProduct() throws InterruptedException {
        RandomListSelect.GetRandomFromList(menuPage.getProductList()).click();
    }
}
