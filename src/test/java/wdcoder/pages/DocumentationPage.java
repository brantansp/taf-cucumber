package wdcoder.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DocumentationPage extends BasePage{

    public DocumentationPage (WebDriver driver) {
        super(driver);
    }

    public void verifyUserIsOnDocumentation(String pageTitle) {
        wait.until(
                ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h1[text()='"+pageTitle+"']")))
        );
    }
}
