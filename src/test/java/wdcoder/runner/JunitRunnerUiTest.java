package wdcoder.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/wdcoder/features/ui",
        glue = {"wdcoder/stepDefinitions/ui","wdcoder/hooks/ui"},
        monochrome = false,
        tags = ("@webtest")
)
public class JunitRunnerUiTest {

}
