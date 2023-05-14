package wdcoder.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.epam.healenium.SelfHealingDriver;

public class DriverFactory {

    public static SelfHealingDriver initialize(String browser) throws InstantiationException {
        switch (browser){
            case "chrome" :
                WebDriverManager.chromedriver().setup();
                ChromeOptions options = new ChromeOptions();
                options.addArguments("start-maximized"); // open Browser in maximized mode
                options.addArguments("disable-infobars"); // disabling infobars
                options.addArguments("--disable-extensions"); // disabling extensions
                options.addArguments("--disable-gpu"); // applicable to windows os only
                options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
                options.addArguments("--no-sandbox"); // Bypass OS security model
                options.addArguments("--remote-allow-origins=*");
                WebDriver cdelegate = new ChromeDriver();

                return SelfHealingDriver.create(cdelegate);
                //return cdelegate;
            case "firefox" :
                WebDriverManager.firefoxdriver().setup();
                WebDriver fdelegate = new FirefoxDriver();
                return SelfHealingDriver.create(fdelegate);
                //return fdelegate;
            default:
                throw new InstantiationException();
        }
    }
}
