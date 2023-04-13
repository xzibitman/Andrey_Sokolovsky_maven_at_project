package homework.day31;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class SpartakTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1920,1080));
        driver.get("https://spartak.by");
        driver.findElement(By.xpath("//*[contains(@alt, 'логотип Спартак')]"));
        driver.findElement(By.xpath("//*[@class='header__logo']"));

        driver.findElement(By.xpath("//*[@href='/partners/']"));
        driver.findElement(By.xpath("//*[contains(text(),'Информация для партнеров')]"));

        driver.findElement(By.xpath("//*[@class='search fa search-btn lupa']"));
        driver.findElement(By.xpath("//*[contains(@class, 'search fa search-btn lupa')]"));

        driver.findElement(By.xpath("//*[@class='header__eye']"));
        driver.findElement(By.xpath("//*[@href='/?special_version=Y']"));

        driver.findElement(By.xpath("//*[@class='header__lang']/a[1]"));
        driver.findElement(By.xpath("//*[@class='header__lang__item header__lang__item_ru active']"));

        driver.findElement(By.xpath("//*[@class='header__lang']/a[4]"));
        driver.findElement(By.xpath("//*[contains(@class, 'header__lang__item header__lang__item_eng')][3]"));

        driver.findElement(By.xpath("//*[@class='download-catalog']"));
        driver.findElement(By.xpath("//*[contains(text(),'Скачать каталог')]"));

        Thread.sleep(4000);
        Actions action = new Actions(driver);
        WebElement elem = driver.findElement(By.xpath("//*[contains(text(), 'Каталог продукции')]"));
        action.moveToElement(elem);
        action.perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@href='/products/Impresso/']"));

        Thread.sleep(4000);
        Actions action2 = new Actions(driver);
        WebElement elem2 = driver.findElement(By.xpath("//*[@href= '/products/']"));
        action2.moveToElement(elem2);
        action2.perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(text(),'Импрессо')]"));

        driver.findElement(By.xpath("//*[@class= 'flex-control-nav flex-control-paging']/li[2]"));
        driver.findElement(By.xpath("//*[contains(@class, 'flex-control-nav flex-control-paging')]/li[2]"));

        driver.findElement(By.xpath("//*[@id='header']/div[2]/ul/li[2]"));
        driver.findElement(By.xpath("//*[contains(@id,'header')]/div[2]/ul/li[2]"));

        driver.findElement(By.xpath("//*[@id='header']/div[2]/ul/li[6]"));
        driver.findElement(By.xpath("//*[contains(@id,'header')]/div[2]/ul/li[6]"));

        driver.findElement(By.xpath("//*[@class='flex-next']"));
        driver.findElement(By.xpath("//*[@class='flexslider']/ul/li[2]"));

        driver.close();
        driver.quit();
    }
}
