package wdcoder.hooks.bdd;

import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;
import wdcoder.utilities.DriverFactory;
import static wdcoder.utilities.DriverFactory.initialize;

public class CucumberHooks {

    static WebDriver driver;

    @BeforeAll
    public static void beforeAll() {
        System.out.println("BeforeAll");
    }

    @Before(value = "@scenario1", order = 0)
    public static void before() {
        System.out.println("Before");
    }

    @Before(order = 1)
    public static void before(Scenario scenario) throws InstantiationException {
        driver = initialize("chrome");
        System.out.println(scenario.getName());
    }

    @BeforeStep
    public static void beforeStep(Scenario scenario) {
        System.out.println("beforestep");
    }

    @AfterStep
    public static void afterStep() {
        System.out.println("afterstep");
    }

    @After
    public static void after(Scenario scenario) {
        System.out.println("After");
        System.out.println(scenario.getStatus());
        driver.close();
        driver.quit();
    }

    @AfterAll
    public static void AfterAll() {
        System.out.println("AfterAll");
    }
}
