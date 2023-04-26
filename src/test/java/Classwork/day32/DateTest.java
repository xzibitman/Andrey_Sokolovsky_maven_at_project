package Classwork.day32;

import org.junit.After;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;

public class DateTest {
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
    public void currency() {
        driver.get("https://booking.com");
        driver.findElement(By.xpath("//*[@aria-label='Скрыть меню входа в аккаунт.']")).click();
        driver.findElement(By.xpath("//*[@name='ss']")).sendKeys("Париж");
        driver.findElement(By.xpath("//*[@data-testid='autocomplete-result']/div/div[text()='Париж']")).click();
        driver.findElement(By.xpath("//*[@data-date='2023-04-29']")).click();
        driver.findElement(By.xpath("//*[@data-date='2023-04-30']")).click();
        driver.findElement(By.xpath("//*[@data-testid='occupancy-config']")).click();
        driver.findElement(By.xpath("//*[@type='submit']")).click();
        WebElement element = driver.findElement(By.xpath("//*[@data-capla-component='b-search-web-searchresults/HeaderDesktop']//h1[contains(text(), 'Париж')]"));
        String textElement = element.getText();
        assert textElement.contains("Париж:") : "There is no any dates a list";


    }

    @After
    public void finished() {
        driver.quit();
    }
}