package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C08_manageMetholari02 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        // maxime iken boyut ve konum
        System.out.println("Maximixe konum"+driver.manage().window().getPosition());
        System.out.println("Maximixe boyut"+driver.manage().window().getSize());


        driver.manage().window().fullscreen();
        // maxime iken boyut ve konum
        System.out.println("fullscreen konum"+driver.manage().window().getPosition());
        System.out.println("fullscreen boyut"+driver.manage().window().getSize());
        driver.close();
    }
}
