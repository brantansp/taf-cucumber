package wdcoder.stepDefinitions.ui;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import wdcoder.pages.BasePage;
import wdcoder.pages.DocumentationPage;
import wdcoder.pages.HomePage;
import wdcoder.utilities.DriverFactory;

import java.time.Duration;

public class UiStepdefs {
    public WebDriver driver;
    @Then("User should see the {string}")
    public void useShouldSeeThePage(String pageTitle) {
        new DocumentationPage(driver).verifyUserIsOnDocumentation(pageTitle);
    }

    @When("User clicks on {string}")
    public void userClicksOn(String linkText) {
        new HomePage(driver).clickOnLink(linkText);
    }

    @Given("User opening the site {string}")
    public void userOpeningTheSite(String url) {
        driver = DriverFactory.getDriver();
        new BasePage(driver).loadUrl(url);
    }
}
