package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C09_manageMethodlari03 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com/");

        driver.close();
        // ileride wais konusunu daha genis ele alacagiz

        /*
        Bir sayfa acilirken, ilk basta sayfanin icerisinde bulunan
        elementlere gore bir yuklmenme suresine ihtiyaac vardir
        veya bir webelementinin zamana ihtiyac vardir
        implicitlyWait bie sayfain yuklenmesi ve sayfadaki elementlere
        ulasim icin beklenecek MAXIMUM sureyi belirleme olanagi tanir
         */

    }
}
