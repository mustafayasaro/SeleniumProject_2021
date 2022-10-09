package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_GetWindowHandle {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com/");

        System.out.println(driver.getWindowHandle());
        //CDwindow-8A0E9A6D93144AB220AC5A277ADA8962
        //benzersiz olarak acilan window'a ait hashcodunu verir

    }
}
