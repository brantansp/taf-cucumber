package wdcoder.stepDefinitions;

import com.epam.healenium.SelfHealingDriver;
import io.cucumber.java.en.*;
import wdcoder.context.World;
import wdcoder.objects.UserObject;
import wdcoder.pages.AdminPage;

public class AdminPageStepdefs {

    private SelfHealingDriver driver;
    private UserObject user;

    public AdminPageStepdefs(World world){
        driver = world.driver;
    }

    @When("User enter the username and password")
    public void userEnterTheUsernameAndPassword(UserObject user) {
        this.user = user;
        new AdminPage(driver).
                enterUsername(this.user).
                enterPassword(this.user);
    }

    @And("Clicking on login")
    public void clickingOnLogin() {
        new AdminPage(driver).clickOnSignIn();
    }

    @Then("Admin panel should be displayed")
    public void adminPanelShouldBeDisplayed() {
        new AdminPage(driver).verifyThatDashboardIsDisplayed();
    }
}
