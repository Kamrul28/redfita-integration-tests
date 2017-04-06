package ui.common;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by KAMRUBY on 4/3/2017.
 */
public class TestHelper {
    protected static WebDriver driver;

    @Before
    public void setupWEBdriver(){
        System.setProperty("webdriver.chrome.driver","C:\\app\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.redfita.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // Implcitilywait ..
    }

    @After
    public void tearDownWebDriver(){
        driver.quit();
    }

}
