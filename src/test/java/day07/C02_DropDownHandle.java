package day07;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_DropDownHandle {
     /*
     www.amazon.com adresine gidiniz
     TEST1
     Arama kutusunun yanındaki kategori menüsündeki kategori sayısının
     28 olduğunu test edin
     TEST2
     1.Kategori kutusundaki Books seçeneğini seçin
     2.Arama kutusuna Java yazdırın ve aratın
     3.Bulunan sonuç sayısını yazdırın
     4.Sonucun Java kelimesini içerdiğini test edin
      */

    WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");
    }

    @After
    public void tearDown(){
        //driver.close();

    }
    @Test
    public void test1(){

    List<WebElement> drops= driver.findElements(By.xpath("//*[@class='nav-search-scope nav-sprite']"));
    }

}
