package day01_seleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_FirstClass {

    public static void main(String[] args) throws InterruptedException {
        /*
        In order to automate in its most primitive form,
        we need to show our Class where the webdriver is required for automation.
        For this, we use the System.setProperty() method in the java library.
         */

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazzon.com");
        Thread.sleep(3000);
        driver.close();


    }
}
