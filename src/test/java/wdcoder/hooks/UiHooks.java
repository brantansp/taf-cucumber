package wdcoder.hooks;

import com.epam.healenium.SelfHealingDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import wdcoder.context.World;
import wdcoder.utilities.DriverFactory;

public class UiHooks {

    private SelfHealingDriver driver;
    private final World world;

    public UiHooks(World world){
        this.world = world;
    }

    @Before
    public void beforeHook() throws InstantiationException {
        driver = DriverFactory.initialize("chrome");
        world.driver = driver;
        driver.manage().window().maximize();
    }

    @After
    public void afterHook(){
        driver.close();
        driver.quit();
    }
}
