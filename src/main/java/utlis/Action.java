package utlis;

import pageObjects.AbstractPage;
import pageObjects.CartPage;
import pageObjects.MenuPage;
import lombok.Getter;

@Getter

public class Action extends AbstractPage {

    CartPage cartPage = new CartPage();
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

    public void RemoveRandomFromCart(){
        RandomListSelect.GetRandomFromList(cartPage.getRemoveFromCart()).click();
    }
}
