package wdcoder.hooks.ui;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import wdcoder.utilities.DriverFactory;

public class UiHooks {
    public static WebDriver driver;
    @Before
    public void beforeHook() throws InstantiationException {
        driver = DriverFactory.initialize("chrome");
    }

    @After
    public void afterHook(){
        driver.close();
        driver.quit();
    }
}
