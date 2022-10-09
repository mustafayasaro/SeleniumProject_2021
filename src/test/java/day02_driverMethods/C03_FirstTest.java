package day02_driverMethods;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_FirstTest {

    // 1-) https://amazon.com adresine gidin
    //2) Basligin Amazon kelimesini icerdigini test edin
    // 3) URL'nin https://amazon.com oldugunu test ediniz
    // 4) sayfayi kapatin

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        // 1-) https://amazon.com adresine gidin
        driver.get("https://amazon.com");

        // 2) Basligin Amazon kelimesini icerdigini test edin
        String arananKelime = "Amazon";
        String actualTitle = driver.getTitle();
        if(actualTitle.contains(arananKelime)){
            System.out.println("Title testi PASSED");
        }else {
            System.out.println("Title testi FAILED");
        }

        // 3) URL'nin https://amazon.com/ oldugunu test ediniz
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://amazon.com/";
        if(actualURL.contains(expectedURL)){
            System.out.println("URL testi PASSED");
        }else {
            System.out.println("URL testi FAILED");
        }

        // 4) sayfayi kapatin
        driver.close();
    }

}
