package ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import ui.common.PageHelper;

/**
 * Created by KAMRUBY on 4/4/2017.
 */
public class EarringsPage extends PageHelper{

    private WebDriver driver;

    @FindBy(xpath = ".//*[@id='Menu']/li[1]/a")
    private  WebElement bodyJewelry;
    @FindBy(xpath = ".//*[@id='Menu']/li[1]/ul/li[1]/a")
    private WebElement earringLink;

    @FindBy(name = "qty3")
    private  WebElement earringQuantityField;
    @FindBy(xpath = ".//*[@id='items']/table/tbody/tr/td/table/tbody/tr[2]/td/input[2]")
    private WebElement addToCartButton;
    @FindBy(xpath = "//*[@id='items']/table/tbody/tr/td/table/tbody/tr[2]/td/input[3]")
    private WebElement goToCart;
    @FindBy (xpath = "html/body/div[1]/table/tbody/tr/td/table/tbody/tr[2]/td[4]")
    private  WebElement cartQuantityText;

    public EarringsPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public void navigateToEarringPage(){
        Actions action = new Actions(driver);
        action.moveToElement(bodyJewelry).perform();
        action.moveToElement(earringLink).click().perform();

    }
    public void enterQuantityField(String enterQuantity){
        driverWaitUntil(earringQuantityField,90);
        earringQuantityField.sendKeys(enterQuantity);     // ----------------review
    }

    public void clickAddToCartButton(){
        addToCartButton.click();
    }

    public void clickGoToCart() {
        goToCart.click();
    }

    public void acceptAlert(){
        driver.switchTo().alert().accept();}

public String getCartQuantityTest(){
    return cartQuantityText.getText();
}



}
