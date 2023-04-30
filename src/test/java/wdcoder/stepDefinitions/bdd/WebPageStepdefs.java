package wdcoder.stepDefinitions.bdd;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebPageStepdefs {

    WebDriver driver;
    @Given("User is on the Documentation page")
    public void userIsOnTheDocumentationPage() {
        //driver = initialize("chrome");
        driver.get("https://wdcoder.site");
    }

    @Then("User click on {string}")
    public void userClickOn(String page) throws InterruptedException {
        driver.findElement(By.xpath("//a[normalize-space(text())='"+page+"']")).click();
        Thread.sleep(3000);
    }
}
