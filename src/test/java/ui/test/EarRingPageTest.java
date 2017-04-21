package ui.test;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import ui.common.TestHelper;
import ui.pages.EarringsPage;

/**
 * Created by KAMRUBY on 4/4/2017.
 */
public class EarRingPageTest extends TestHelper {


    @Test
    public void verfiyAddedEarringMatchedInCart(){
        EarringsPage earringsPgage = PageFactory.initElements(driver, EarringsPage.class);

        driver.get("http://www.redfita.com/earrings.html");
        earringsPgage.enterQuantityField("3");
        earringsPgage.clickAddToCartButton();
        earringsPgage.acceptAlert();
        earringsPgage.clickGoToCart();
    }
}
