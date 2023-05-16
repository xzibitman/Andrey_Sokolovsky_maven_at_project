package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class DriverManager {
    public static WebDriver getDriver(Config config) {
        return switch (config != null ? config : Config.CHROME) {
            case CHROME -> getChromeDriver();
            case FF -> getFireFoxDriver();
            case EDGE -> getEdgeDriver();
        };
    }

    private static WebDriver getChromeDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        return new ChromeDriver(options);
    }

    private static WebDriver getEdgeDriver() {
        return null;
    }

    private static WebDriver getFireFoxDriver() {
        return null;
    }

}
