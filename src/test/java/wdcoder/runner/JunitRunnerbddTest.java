package wdcoder.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:/target/cucumber.html"},
        snippets = CucumberOptions.SnippetType.UNDERSCORE,
        dryRun = false,
        features = "src/test/resources/wdcoder/features/bdd",
        glue = {"wdcoder/stepDefinitions/bdd","wdcoder/types","wdcoder/hooks"},
        monochrome = false,
        tags = ("@webtest")
)
public class JunitRunnerbddTest {
    /*@BeforeClass
    public static void beforeClass(){
        System.out.println("beforeclass");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("afterClass");
    }*/
}
