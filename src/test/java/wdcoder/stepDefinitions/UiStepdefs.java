package wdcoder.stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import wdcoder.objects.UserObject;
import wdcoder.objects.AppObject;
import wdcoder.pages.AdminPage;
import wdcoder.pages.BasePage;
import wdcoder.pages.DocumentationPage;
import wdcoder.pages.HomePage;
import wdcoder.utilities.DriverFactory;

public class UiStepdefs {
    public WebDriver driver;
    private UserObject user;

    @Given("User opening the site {string}")
    public void userOpeningTheSite(String url) {
        driver = DriverFactory.getDriver();
        new BasePage(driver).loadUrl(url);
    }

    @When("User clicks on {AppPage}")
    public void userClicksOn(AppObject pageName) {
        new HomePage(driver).clickOnLink(pageName.getPageName());
    }

    @Then("User should see the {AppPage}")
    public void useShouldSeeThePage(AppObject pageName) {
        new DocumentationPage(driver).verifyUserIsOnDocumentation(pageName.getPageName());
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
