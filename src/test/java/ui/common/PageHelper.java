package ui.common;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by KAMRUBY on 4/2/2017.
 */
public class PageHelper {

   WebDriver driver;

    public  PageHelper(WebDriver webDriver){
        this.driver = webDriver;

    }

    //Explicit wait
    public void driverWaitUntill(WebElement elementPath ,int timeToWait){
        WebDriverWait wait = new WebDriverWait(driver, timeToWait);
        wait.until(ExpectedConditions.visibilityOf(elementPath));
    }

    public void accepctAlert(){
        driver.switchTo().alert().accept();

    }

    public String getAlertText(){
        return driver.switchTo().alert().getText();

    }

}


