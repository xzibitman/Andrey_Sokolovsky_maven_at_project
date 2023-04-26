package Classwork.day33;

import org.openqa.selenium.WebDriver;


public class DriverManager {
    public static WebDriver getDriver(Config config) {
        return switch (config) {
            case CHROME -> getChromeDriver();
            case FF -> getFireFoxDriver();
            case Edge -> getEdgeDriver();
        };
    }


    private static WebDriver getEdgeDriver() {
        return null;
    }

    private static WebDriver getFireFoxDriver() {
        return null;
    }

    private static WebDriver getChromeDriver() {
        return null;
    }
}
