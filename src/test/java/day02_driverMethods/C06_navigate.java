package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_navigate {
    public static void main(String[] args) throws InterruptedException {

        /*
        Eger testimiz sirasinda birden fazla sayfyaya arasinda ileri geri
        hareket edeceksek. driver.ge() yerine driver.navigate().to() methodunu
        kullaniriz. Daha sonra forward() back()eya refresh() method'larini kullanabiliriz
         */


        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //https://www.amazon.com/ adresine gidelim
        driver.navigate().to("https://www.amazon.com/");
        Thread.sleep(2000);


        //https://www.facebook.com/ adresine gidelim
        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(2000);

        //amazon sayfasina geri donelim
        driver.navigate().back();
        Thread.sleep(2000);

        // facebook sayfasina geri donelim
        driver.navigate().forward();
        Thread.sleep(2000);

        //sayfayi yenileyim
        driver.navigate().refresh();
        Thread.sleep(2000);

        // sayfayi kapatalim
        driver.close();

    }
}
