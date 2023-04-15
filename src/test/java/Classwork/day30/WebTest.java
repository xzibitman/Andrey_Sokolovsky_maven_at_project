package Classwork.day30;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium.dev");
    }
}
