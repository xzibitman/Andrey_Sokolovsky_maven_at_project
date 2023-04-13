package homework.day31;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MailTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1920, 1080));
        driver.get("https://mail.ru/");
        driver.findElement(By.xpath("//*[@href='//mail.ru']"));
        driver.findElement(By.xpath("//*/a[contains(@class,'logo__img')]"));

        driver.findElement(By.xpath("//*[@href='https://trk.mail.ru/c/ds8xq6?mt_sub1=mail.ru']"));
        driver.findElement(By.xpath("//*[contains(@class,'ph-container')]/div[1]/a[1]"));

        driver.findElement(By.xpath("//*/a[contains(text(),'Облако')]"));
        driver.findElement(By.xpath("//*[contains(@class,'ph-container')]/div[1]/a[3]"));

        driver.findElement(By.xpath("//*[contains(@class,'mailbox-services')]/a[1]"));
        driver.findElement(By.xpath("//*[@data-testid='logged-out-email']"));

        driver.findElement(By.xpath("//*[contains(@data-testid, 'enter-mail-primary')]"));
        driver.findElement(By.xpath("//*[@data-click-counter='84226411']"));

        driver.findElement(By.xpath("//*[@data-click-counter='84226414']"));
        driver.findElement(By.xpath("//*[contains(@data-testid,'mailbox-create-link')]"));

        driver.findElement(By.xpath("//*[contains(text(),'Войти')]"));
        driver.findElement(By.xpath("//*[contains(@class,'ph-auth')]/button"));

        driver.findElement(By.xpath("//*[contains(text(),'Регистрация')]"));
        driver.findElement(By.xpath("//*[contains(@class,'ph-auth')]/a"));

        driver.findElement(By.xpath("//*[contains(@class,'weather') and contains(@class,'weather__header-link')]"));
        driver.findElement(By.xpath("//*[contains(@href,'') and contains(@class,'weather__city')]"));

        driver.findElement(By.xpath("//*[contains(@class,'weather__header')]/a[3]"));
        driver.findElement(By.xpath("//*[@data-testid='weather-more']"));

        driver.findElement(By.xpath("//*[@class='search-arrow__placeholder']"));
        driver.findElement(By.xpath("//*[@class='search-arrow__border']/div[3]"));

        driver.findElement(By.xpath("//*[@class='search-arrow__border']/div[4]"));
        driver.findElement(By.xpath("//*[@class='search-arrow__button']"));

        driver.findElement(By.xpath("//*[@href='//lady.mail.ru/']"));
        driver.findElement(By.xpath("//*[@data-testid='news-tabs-tab-item-lady']"));

        driver.findElement(By.xpath("//*[contains(@class,'tabs-content')]/li[2]"));
        driver.findElement(By.xpath("//*[@data-testid='general-news-item-rb'][2]"));

    }
}
