package Classwork.day32;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JsExecutorTest {
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
    public void JsTest() {

        driver.get("https://booking.com/");
        driver.findElement(By.xpath("//*[@aria-label='Скрыть меню входа в аккаунт.']")).click();
        driver.findElement(By.xpath("//*[@name='ss']")).sendKeys("Париж");
        driver.findElement(By.xpath("//*[@data-testid='autocomplete-result']/div/div[text()='Париж']")).click();
        driver.findElement(By.xpath("//*[@data-date='2023-04-29']")).click();
        driver.findElement(By.xpath("//*[@data-date='2023-04-30']")).click();
        driver.findElement(By.xpath("//*[@data-testid='occupancy-config']")).click();
        driver.findElement(By.xpath("//*[@type='submit']")).click();
        WebElement element = driver.findElement(By.xpath("//div[@data-testid='property-card'][10]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.backgroundColor = 'green'", element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.color = 'red'", driver.findElement(By.xpath("//*[@data-testid='property-card'][10]//descendant:: div[@data-testid='title']")));
        Assert.assertEquals("The text color isn't red", "color: red;", driver.findElement(By.xpath("//*[@data-testid='property-card'][10]//div[@data-testid='title']")).getAttribute("style"));
    }

    @After
    public void finished() {
        driver.quit();
    }

}

