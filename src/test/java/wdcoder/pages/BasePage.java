package wdcoder.pages;

import com.epam.healenium.SelfHealingDriver;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected SelfHealingDriver driver;
    protected WebDriverWait wait;

    private BasePage(){}

    public BasePage(SelfHealingDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
    }

    public void loadUrl (String url){
        driver.get(url);
    }

}
