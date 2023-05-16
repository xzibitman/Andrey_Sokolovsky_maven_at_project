package Classwork.day32;

import driver.Driver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class CurrencyTest {
    WebDriver driver = Driver.getWebDriver();
    @Test
    public void currency() {
        driver.get("https://booking.com");
        driver.findElement(By.xpath("//*[@aria-label='Скрыть меню входа в аккаунт.']")).click();
//        WebElement element = driver.findElement(By.xpath("//*[@data-testid='header-currency-picker-trigger']"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element);
//        actions.perform();
//        String hover =  driver.findElement(By.xpath("//*[@id=':R2cl:']")).getText();
//        Assert.assertEquals("There is no tooltip","Выберите валюту", hover);
//        WebElement element1 = driver.findElement(By.xpath("//*[@data-testid='header-language-picker-trigger']"));
//        Actions actions1 = new Actions(driver);
//        actions1.moveToElement(element1);
//        actions1.perform();
//        String hover1 = driver.findElement(By.xpath("//*[@id=':R2kl:']")).getText();
//        Assert.assertEquals("There is no tooltip","Выберите язык", hover1);
    }
    @After
    public void finished() {
        driver.quit();
    }
}
