package wdcoder.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnLink(String linkText) {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[text()='"+linkText+"']")))).click();
    }
}
