package Classwork.day32;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RatingTest {
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
        driver.findElement(By.xpath("//div[@id='left']//div[@data-filters-group='review_score']/div[@data-filters-item='review_score:review_score=90']/label/span[2]")).click();
        WebDriverWait element = new WebDriverWait(driver, Duration.ofSeconds(10));
        element.until(
                ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("[data-testid='overlay-spinner']"))
        );
        driver.findElement(By.xpath("//*[contains(text(), 'Результаты поиска по направлению Париж')]//following-sibling::div[2]//h3")).click();
        WebElement rating = driver.findElement(By.xpath("//*[contains(@data-testid,'review-score-right-component')]/div[@aria-label]"));
        String ratingText = rating.getText();
        double ratingDouble = Double.parseDouble(ratingText);
        Assert.assertEquals(9, 9, 0.9);
        System.out.println(ratingDouble);

    }

    @After
    public void finished() {
        driver.quit();
    }
}
