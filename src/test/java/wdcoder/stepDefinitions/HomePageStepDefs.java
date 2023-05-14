package wdcoder.stepDefinitions;

import com.epam.healenium.SelfHealingDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import wdcoder.context.World;
import wdcoder.objects.AppObject;
import wdcoder.objects.UserObject;
import wdcoder.pages.BasePage;
import wdcoder.pages.HomePage;

public class HomePageStepDefs {

    private SelfHealingDriver driver;
    private UserObject user;

    public HomePageStepDefs(World world){
        driver = world.driver;
    }

    @Given("User opening the site {string}")
    public void userOpeningTheSite(String url) {
        new BasePage(driver).loadUrl(url);
    }

    @When("User clicks on {AppPage}")
    public void userClicksOn(AppObject pageName) {
        new HomePage(driver).clickOnLink(pageName.getPageName());
    }
}
