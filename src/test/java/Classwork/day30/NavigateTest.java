package Classwork.day30;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        driver.navigate().to("http://ya.ru");
        driver.navigate().back();
        driver.navigate().refresh();
    }
}
