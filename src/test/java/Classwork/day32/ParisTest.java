package Classwork.day32;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ParisTest {
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
    public void testParis() {
        driver.get("https://booking.com/");
        driver.findElement(By.xpath("//*[@aria-label='Скрыть меню входа в аккаунт.']")).click();
        driver.findElement(By.xpath("//*[@name='ss']")).sendKeys("Париж");
        driver.findElement(By.xpath("//*[@data-testid='autocomplete-result']/div/div[text()='Париж']")).click();
        driver.findElement(By.xpath("//*[@data-date='2023-05-15']")).click();
        driver.findElement(By.xpath("//*[@data-date='2023-05-22']")).click();
        driver.findElement(By.xpath("//*[@data-testid='occupancy-config']")).click();
        driver.findElement(By.xpath("//*[@type='submit']")).click();

        driver.findElement(By.xpath("//div[@data-component='arp-left-column']//div[@data-testid='filters-group']/div[2]//div[@data-filters-item='pri:pri=5']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        new WebDriverWait(driver,Duration.ofSeconds(10)).until(
                ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@data-testid='overlay-card']"))
        );
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.findElement(By.xpath("//*[@data-testid='sorters-dropdown-trigger']")).click();
        driver.findElement(By.xpath("//*[@data-id='price']")).click();
        WebElement priceElement = driver.findElement(By.xpath("//span[@data-testid='price-and-discounted-price'][1]"));
        String priceHotel = priceElement.getText();
        String numbers = priceHotel.replaceAll("[^0-9]", "");
        WebElement priceElement2 = driver.findElement(By.xpath("//div[@data-component='arp-left-column']//div[@data-testid='filters-group']//div[2]/div[9]//div[@data-testid='filters-group-label-content']"));
        String priceNight = priceElement2.getText();
        String numbers2 = priceNight.replaceAll("[^0-9]", "");
        double hotelPrice = Double.parseDouble(numbers);
        double hotelPrice2 = Double.parseDouble(numbers2);
        Assert.assertTrue("The price of a night more than price", hotelPrice / 7 >= hotelPrice2);
    }

    @After
    public void finished() {
        driver.quit();
    }
}



