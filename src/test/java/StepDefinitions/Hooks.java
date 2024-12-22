package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Hooks {
    public static WebDriver HZM;

    public static WebDriver getDriver() {
        return HZM; // Access the driver here
    }

    @Before
    public void openBrowser() {
        String browserName = "chrome";
        if (browserName.contains("chrome")) {
            HZM = new ChromeDriver();
        } else if (browserName.contains("edge")) {
            HZM = new EdgeDriver();
        } else if (browserName.contains("firefox")) {
            HZM = new FirefoxDriver();
        } else {
            HZM = new ChromeDriver();
        }

        HZM.manage().window().maximize();
        HZM.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        HZM.get("https://www.demoblaze.com/");
    }

    @After
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(1000);
        if (HZM != null) {
            HZM.quit();
        }
    }

}
