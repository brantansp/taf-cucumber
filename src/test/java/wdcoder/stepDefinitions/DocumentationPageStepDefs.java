package wdcoder.stepDefinitions;

import com.epam.healenium.SelfHealingDriver;
import io.cucumber.java.en.Then;
import wdcoder.context.World;
import wdcoder.objects.AppObject;
import wdcoder.objects.UserObject;
import wdcoder.pages.DocumentationPage;

public class DocumentationPageStepDefs {

    private SelfHealingDriver driver;
    private UserObject user;

    public DocumentationPageStepDefs(World world){
        driver = world.driver;
    }

    @Then("User should see the {AppPage}")
    public void useShouldSeeThePage(AppObject pageName) {
        new DocumentationPage(driver).verifyUserIsOnDocumentation(pageName.getPageName());
    }
}
