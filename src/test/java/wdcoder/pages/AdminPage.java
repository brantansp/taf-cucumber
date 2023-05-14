package wdcoder.pages;

import com.epam.healenium.SelfHealingDriver;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import wdcoder.objects.UserObject;

public class AdminPage extends BasePage {

    @FindBy(id = "user_login") private WebElement username;
    @FindBy(id = "user_pass") private WebElement password;
    @FindBy(id = "wp-submit") private WebElement signinButton;
    @FindBy(xpath = "//h1[text()='Dashboard']") private WebElement dashboardVerification;

    public AdminPage(SelfHealingDriver driver) {
        super(driver);
    }

    public AdminPage enterUsername(UserObject user) {
        wait.until(ExpectedConditions.visibilityOf(this.username)).sendKeys(user.getUsername());
        return this;
    }

    public void enterPassword(UserObject user) {
        wait.until(ExpectedConditions.visibilityOf(this.password)).sendKeys(user.getPassword());
    }

    public void clickOnSignIn() {
        wait.until(ExpectedConditions.elementToBeClickable(this.signinButton)).click();
    }

    public void verifyThatDashboardIsDisplayed() {
        boolean isDisplayed = wait.until(ExpectedConditions.visibilityOf(this.dashboardVerification)).isDisplayed();
        Assert.assertTrue(isDisplayed);
    }
}
