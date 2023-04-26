package Classwork.day32;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class W3SchoolTest {
    private WebDriver driver;

    @Before
    public void startTest() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

    }
    @Test
    public void schoolTest() {

        driver.get("https://www.w3schools.com/java/");
        WebElement element = driver.findElement(By.xpath("//*[@class='color_h1']"));
        Actions make = new Actions(driver);
        make
                .doubleClick(element)
                .keyDown(Keys.LEFT_CONTROL)
                .sendKeys("c")
                .keyUp(Keys.LEFT_CONTROL)
                .build()
                .perform();
        driver.navigate().to("https://www.google.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement element2 = driver.findElement(By.xpath("//*[@name='q']"));

        make
                .click(element2)
                .keyDown(Keys.LEFT_CONTROL)
                .sendKeys("v")
                .keyUp(Keys.LEFT_CONTROL)
                .keyDown(Keys.ENTER)
                .keyUp(Keys.ENTER)
                .build()
                .perform();

        List<WebElement> list = driver.findElements(By.xpath("//div[@class='g']"));
        for (WebElement text : list) {
            String findText = text.getText();
            Assert.assertTrue("Поисковый результат не содержащий 'Tutorial':\n" + findText, findText.contains("tutorial"));

        }
    }

    @After
    public void finished() {
        driver.quit();
    }
}

