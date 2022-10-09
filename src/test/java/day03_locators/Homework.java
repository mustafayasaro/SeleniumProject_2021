package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Homework {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // https://www.amazon.com/ sitesine gidiniz
        // arama kutusunda "city bike" kelimesini arayiniz
        // Sonuclarin sayisini yazdiriniz
        // "Shopping"'e tiklayiniz
        // Daha sonra karsiniza cikan ilk resme tiklayiniz

        // https://www.amazon.com/ sitesine gidiniz
        driver.get("https://www.amazon.com/");

        // arama kutusunda "city bike" kelimesini arayiniz
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike", Keys.ENTER);

        // Sonuclarin sayisini yazdiriniz
        WebElement sonuclar = driver.findElement(By.linkText("1-16 of 123 results for"));
        String[] sonucArr = sonuclar.getText().split(" ");
        System.out.println("Sonuc sayisi : "  + sonucArr[2]);



        // Daha sonra karsiniza cikan ilk resme tiklayiniz
        driver.findElement(By.xpath("(//*[@class='s-image'])[1]")).click();




    }
}
