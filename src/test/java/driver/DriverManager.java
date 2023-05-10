package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;


public class DriverManager {
    public static WebDriver getDriver(Config config) {
        return switch (config != null ? config : Config.CHROME) {
            case CHROME -> getChromeDriver();
            case FF -> getFireFoxDriver();
            case Edge -> getEdgeDriver();
        };
    }

    public static WebDriver getChromeDriver() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        return driver;

    }

    private static WebDriver getEdgeDriver() {
        return null;
    }

    private static WebDriver getFireFoxDriver() {
        return null;
    }

}
