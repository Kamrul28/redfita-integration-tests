package ui.common;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Created by KAMRUBY on 4/3/2017.
 */
public class TestHelper {
    protected static WebDriver driver;

    @Before
    public void setupDriver(){
        ChromeOptions options = new ChromeOptions();
        Map<String, Object> pref = new HashMap<String, Object>();
        pref.put("profile.default_content_settings.popups", 0);
        pref.put("credentials_enable_service", false);
        pref.put("password_manager_enabled", false);
        options.addArguments("disable-extensions");
        options.setExperimentalOption("prefs", pref);
        options.addArguments("disable-infobars");
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);

        System.setProperty("webdriver.chrome.driver","C:\\app\\chromedriver.exe");
        driver = new ChromeDriver(capabilities);
        driver.get("http://www.redfita.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // Implcitilywait ..
    }

    @After
    public void tearDownDriver(){
        driver.quit();
    }

}
