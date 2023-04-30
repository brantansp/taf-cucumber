package wdcoder.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/wdcoder/features",
        glue = {"wdcoder/stepDefinitions", "wdcoder/hooks", "wdcoder/objects", "wdcoder/types"},
        monochrome = false,
        tags = ("@webtest")
)
public class JunitRunnerUiTest {

}
