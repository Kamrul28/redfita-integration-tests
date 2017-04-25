package ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ui.common.PageHelper;

/**
 * Created by kamru on 4/24/2017.
 */
public class ShoppingCartPage extends PageHelper {
    WebDriver driver;

    public ShoppingCartPage(WebDriver webDriver) {
        super(webDriver);
        this.driver = webDriver;

    }

    @FindBy (xpath = "//*[@id='items']/table/tbody/tr/td/table/tbody/tr[3]/td/input[1]")
    public WebElement quantityField;
    @FindBy (xpath = ".//*[@id='items']/table/tbody/tr/td/table/tbody/tr[3]/td/input[2]")
    public WebElement addToCartButton;
    @FindBy (xpath = ".//*[@id='items']/table/tbody/tr/td/table/tbody/tr[5]/td/input[3]")
    public WebElement goToCartButton;
    @FindBy (xpath = "html/body/div[1]/table/tbody/tr/td/table/tbody/tr[2]/td[6]/a")
    public WebElement removeItemLink;
    @FindBy(xpath = "html/body/div[1]/table/tbody/tr/td/table/tbody/tr[2]/td")
    public WebElement yourCartIsEmptyMessage;

    public void setQuantityField(){
        quantityField.clear();
        quantityField.sendKeys("2");
    }
    public void clickOnAddToCartButton(){
        addToCartButton.click();
    }
    public void accpectAlert(){
        try {
            driver.switchTo().alert().accept();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void clickOnGoToCartButton(){
        goToCartButton.click();
    }
    public void clickToRemoveItem(){
        removeItemLink.click();
    }
    public String getEmptyCartMessage(){
       return yourCartIsEmptyMessage.getText();
    }


}
