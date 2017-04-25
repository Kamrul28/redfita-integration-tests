package ui.test;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import ui.common.TestHelper;
import ui.pages.OrderItemRemovePage;

/**
 * Created by kamru on 4/24/2017.
 */
public class OrderItemRemoveTest extends TestHelper {

    @Test
    public void verfiyRemoveItemInCart(){
        OrderItemRemovePage orderItemRemovePage = PageFactory.initElements(driver, OrderItemRemovePage.class );
        orderItemRemovePage.clickQntField();
        orderItemRemovePage.setQuantityField();
        orderItemRemovePage.navigateAddToCart();
        orderItemRemovePage.accpectAlert();
        orderItemRemovePage.clickToCartButton();
        orderItemRemovePage.getEmptyCartMessage();


    }
}
