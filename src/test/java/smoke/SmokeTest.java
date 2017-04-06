package smoke;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by KAMRUBY on 4/1/2017.
 */
public class SmokeTest{
    WebDriver chromeDriver;

    @Before
    public void setupWEBdriver(){
        System.setProperty("webdriver.chrome.driver","C:\\apps\\chromedriver.exe");
        chromeDriver = new ChromeDriver();
        chromeDriver.get("http://www.redfita.com");
        chromeDriver.manage().window().maximize();
    }

    @After
    public void tearDownWebDriver(){
        chromeDriver.quit();
    }

    @Test
    public void verifyAlertMessage(){
      String itemQuantity = "3";
        chromeDriver.findElement(By.xpath(".//*[@id='items']/table/tbody/tr/td/table/tbody/tr[2]/td/input[1]")).sendKeys(itemQuantity);
        chromeDriver.findElement(By.xpath(".//*[@id='items']/table/tbody/tr/td/table/tbody/tr[2]/td/input[2]")).click();
        String actualText = chromeDriver.switchTo().alert().getText();
        Assert.assertTrue("Quantity not matched in alert messagebox",actualText.contains(itemQuantity));

    }

    @Test
    public void verifySddedIteminShoppingCart(){
        String itemQuantiy = "4";
        String itemName = "Fast and Furious";

        chromeDriver.findElement(By.xpath(".//*[@id='items']/table/tbody/tr/td/table/tbody/tr[2]/td/input[1]")).sendKeys(itemQuantiy);
        chromeDriver.findElement(By.xpath(".//*[@id='items']/table/tbody/tr/td/table/tbody/tr[2]/td/input[2]")).click();
        String actualAlertText = chromeDriver.switchTo().alert().getText();
        Assert.assertEquals(itemQuantiy + " - " + itemName + " added to your cart. Thank you for shopping @ RedFita.", actualAlertText);
        chromeDriver.switchTo().alert().accept();
        chromeDriver.findElement(By.xpath(".//*[@id='items']/table/tbody/tr/td/table/tbody/tr[5]/td/input[3]")).click();
        String productCartItem = chromeDriver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td/table/tbody/tr[2]/td[2]")).getText();
        String productCartQuantity = chromeDriver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td/table/tbody/tr[2]/td[4]")).getText();
        Assert.assertTrue(chromeDriver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td/table/tbody/tr[2]/td[1]")).isDisplayed());
        Assert.assertTrue(chromeDriver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td/table/tbody/tr[2]/td[3]")).isDisplayed());
        Assert.assertEquals(itemName,   productCartItem);
        Assert.assertEquals(itemQuantiy,  itemQuantiy);

    }










}
