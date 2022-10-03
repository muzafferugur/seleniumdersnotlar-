package day07;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Assertions {
    /*
    bir class oluşturalım YanlisEmailTesti
    https://automationpractice.com/index.php sayfasına gidelim
    Sign in Butonuna basalım
    Email kutusuna @işareti olmayan bi mail yazıp Enter a bastığımızda "invalid email adress" uyarısı çıktığını görelim

     */
    WebDriver driver;

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


    }

    @After
    public void tearDown(){
        //driver.close();
    }
    @Test
    public void test1(){
        //https://automationpractice.com/index.php sayfasına gidelim
        driver.get("https://automationpractice.com/index.php");

        //Sign in butonuna basalım
        driver.findElement(By.xpath("//*[@class='login']")).click();

        //Email kutusuna @işareti olmayan bi mail adresi yazalım
        WebElement emailKutusu= driver.findElement(By.xpath("//*[@id='email_create']"));
        emailKutusu.sendKeys("muzaffer.gmail.com");
        driver.findElement(By.xpath("//*[@class='icon-user left']")).click();
        //Enter a bastığımızda "invalid email adress" uyarısı çıktığını görelim
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Invalid email address.']")).isDisplayed());

    }


}
