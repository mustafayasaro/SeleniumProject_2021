package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01 {
    public static void main(String[] args) {
        /*
        8 tane locators vardir

        1) id
        2) name
        3) className
        4) tagName
        5) linkText
        6) partialLinkText
        7) xpath
        8) cssSelector
         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amazon.com/");

        // findElement() istedigimiz WebElement'ini bize doner
        // daha sonra biz de o WebElementi kullanmak icin bir objeye assign ederiz
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));


        // herhangi bir WebElementine istedigimiz bir kelime gondermek istersek

        aramaKutusu.sendKeys("Nutella", Keys.ENTER);


        // link elementinin HTML tag'i a'dir

    }
}
