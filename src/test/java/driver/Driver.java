package driver;

import org.openqa.selenium.WebDriver;
import settings.ConfigProperty;

import java.util.concurrent.TimeUnit;

public class Driver {
    private static WebDriver webDriver;
    public static Config config;


    public static WebDriver getWebDriver() throws NullPointerException {
        ConfigProperty.initPropertyFile();
        if (webDriver == null) {
            webDriver = DriverManager.getDriver(config);
            setTimeOuts();

        }
        return webDriver;
    }
    private static void setTimeOuts() {
        if (webDriver != null) {
            webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }

    }

    public static void setConfig(Config config) {
        Driver.config = null == config ? Config.valueOf(System.getProperty("CONFIG")) : config;
    }
}
