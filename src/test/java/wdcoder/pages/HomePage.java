package wdcoder.pages;

import com.epam.healenium.SelfHealingDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage{
    public HomePage(SelfHealingDriver driver) {
        super(driver);
    }

    public void clickOnLink(String linkText) {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[text()='"+linkText+"']")))).click();
        //wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[text()='Driver method']")))).click();
    }
}
