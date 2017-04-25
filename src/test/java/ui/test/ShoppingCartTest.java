package ui.test;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import ui.common.TestHelper;
import ui.pages.ShoppingCartPage;

/**
 * Created by kamru on 4/24/2017.
 */
public class ShoppingCartTest extends TestHelper {

    @Test
    public void verfiyRemoveItemInCart(){
        ShoppingCartPage shoppingCartPage = PageFactory.initElements(driver, ShoppingCartPage.class );
        shoppingCartPage.setQuantityField();
        shoppingCartPage.clickOnAddToCartButton();
        shoppingCartPage.accpectAlert();
        shoppingCartPage.clickOnGoToCartButton();
        shoppingCartPage.getEmptyCartMessage();
    }
}
