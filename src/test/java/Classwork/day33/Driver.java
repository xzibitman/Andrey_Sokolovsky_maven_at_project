package Classwork.day33;

import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Driver {
    private static WebDriver webDriver;
    public static Config config;

    public static WebDriver getWebDriver() {
        if (webDriver == null) {
            webDriver = DriverManager.getDriver(config);
            setTimeOuts(10);
        }
        return webDriver;
    }
    private static void setTimeOuts(int seconds) {
        if (webDriver != null) {
            webDriver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
        }

    }

    public static void setConfig(Config config) {
        Driver.config = null == config ? Config.valueOf(System.getProperty("CONFIG")) : config;
    }
}
