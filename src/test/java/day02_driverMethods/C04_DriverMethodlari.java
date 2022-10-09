package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverMethodlari {
    public static void main(String[] args) {
        // amazon sayfasina gidip Kaynak kodlarinin "spend less" icedigini test ediniz

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amazon.com");

        String aranaKelime = "amazon";
        String sayfaKaynakKodlari = driver.getPageSource();

        if (sayfaKaynakKodlari.contains(aranaKelime)){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }

    }
}
