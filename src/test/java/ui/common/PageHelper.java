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
    public void driverWaitUntil(WebElement elementPath , int timeToWait){
        WebDriverWait wait = new WebDriverWait(driver, timeToWait);
        wait.until(ExpectedConditions.visibilityOf(elementPath));
    }

    public void acceptAlert(){
        try {
            Thread.sleep(1000); //TODO use global explicit wait
            driver.switchTo().alert().accept();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getAlertText(){
        try {
            Thread.sleep(1000); //TODO use global explicit wait
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return driver.switchTo().alert().getText();
    }


}


