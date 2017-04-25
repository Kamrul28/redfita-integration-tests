package ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ui.common.PageHelper;

/**
 * Created by KAMRUBY on 4/2/2017.
 */
public class JewelryPage extends PageHelper{
    private WebDriver driver;

    @FindBy(xpath = ".//*[@id='items']/table/tbody/tr/td/table/tbody/tr[2]/td/input[1]")
    private WebElement fastAndFuriousQuantityFiled;

    @FindBy (xpath =".//*[@id='items']/table/tbody/tr/td/table/tbody/tr[2]/td/input[2]")
    private WebElement  fastAndFuriousButton;
    @FindBy (xpath =".//*[@id='items']/table/tbody/tr/td/table/tbody/tr[5]/td/input[3]")
    private WebDriver goToCartButton;

    @FindBy (xpath = "html/body/div[1]/table/tbody/tr/td/table/tbody/tr[2]/td[4]")
    private WebElement getCartQuantityText;

    public JewelryPage(WebDriver driver){
        super(driver);
    }
    public void addToCart(String abc){
        fastAndFuriousQuantityFiled.sendKeys(abc);
        fastAndFuriousButton.click();
    }
   public String quantityText(){
      return getCartQuantityText.getText();

   }

}
