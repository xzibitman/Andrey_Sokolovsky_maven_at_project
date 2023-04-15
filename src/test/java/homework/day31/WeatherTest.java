package homework.day31;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


public class WeatherTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH, 1);
        Date day = cal.getTime();
        SimpleDateFormat formatDate = new SimpleDateFormat("EEEE", Locale.forLanguageTag("ru"));
        String nextDay = formatDate.format(day);
        driver.get("http://google.com");
        driver.findElement(By.name("q")).sendKeys("погода Минск");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//ul[@role='listbox']/li[1]")).click();
        String text = driver.findElement(By.xpath("//*[contains(@aria-label, 'Celsius') and contains(@aria-label,'"+nextDay+" 12')][1]"))
                .getAttribute("aria-label");
        String[] texts = text.split(" ");
        System.out.print(texts[0]);
        driver.close();
        driver.quit();
    }
}
