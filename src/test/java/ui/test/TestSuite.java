package ui.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ui.pages.JewelryPage;
import ui.pages.SubscribePage;

/**
 * Created by hcakbar on 4/20/2017.
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
        JewelryPageTest.class,
        EarRingPageTest.class,
        SubscribePageTest.class,
        ShoppingCartTest.class


})
public class TestSuite {

}
