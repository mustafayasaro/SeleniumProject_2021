package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Overview {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // Bir obje olusturma
        // WebDriver bir interface oldugu icin ondan obje olusturamayiz

        driver.get("https://www.techproeducation.com");


    }
}
