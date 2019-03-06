
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class BidnRun {
  @Test
   public void bednyagkaTest() {


    WebDriver driver = new ChromeDriver();
    //відкрити Бідняжка сайт
    driver.get("https://tcb.com.ua/trips/");
    //клікнути на Квітучий Амстердам 2

      driver.findElement(By.xpath("/html/body/div[4]/div[3]/div[46]/div[5]/a")).click();

    //клікнути на замовити місце

      driver.findElement(By.xpath("//*[@id='orderthead']/tbody/tr/td[6]/a/div")).click();

    //Очікуваний рультат: Вікно входу в кабінет або вікно реєстрації, якщо користувач вже авторизований


    driver.quit();
     Assert.assertTrue();
}
