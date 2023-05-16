package driver;

import org.openqa.selenium.WebDriver;
import settings.ConfigProperty;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Driver {
    private static WebDriver webDriver;
    public static Config config;


    public static WebDriver getWebDriver() {
        if (webDriver == null) {
            webDriver = DriverManager.getDriver(config);
        }
        setTimeOuts(20);
        ConfigProperty.initPropertyFile();
        return webDriver;
    }
    private static void setTimeOuts(int seconds) {
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
        webDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(seconds));
        webDriver.manage().timeouts().scriptTimeout(Duration.ofSeconds(seconds));
    }
    public static void close() {
        webDriver.close();
    }
    public static void quite() {
        webDriver.quit();
    }

}
