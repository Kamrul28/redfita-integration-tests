package ui.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import ui.common.TestHelper;
import ui.pages.JewelryPage;

/**
 * Created by KAMRUBY on 4/2/2017.
 */
public class JewelryPageTest extends TestHelper {




    @Test
    public void verifyAddedAlertText(){
        String itemQuantiy = "2";
        String itemName = "Fast and Furious";
        JewelryPage iJewelryPage = PageFactory.initElements(driver, JewelryPage.class);
        iJewelryPage.addToCart(itemQuantiy);
        String actualAlertText = iJewelryPage.getAlertText();
        Assert.assertEquals(itemQuantiy + " - " + itemName + " added to your cart. Thank you for shopping @ RedFita.", actualAlertText);
    }

    @Test
    public void verifyShoppingCart(){

        JewelryPage iJewelryPage = PageFactory.initElements(driver,JewelryPage.class);
        iJewelryPage.addToCart("3");
        String getQuantity = iJewelryPage.quantityText();
        Assert.assertEquals("3", getQuantity);

    }



}

