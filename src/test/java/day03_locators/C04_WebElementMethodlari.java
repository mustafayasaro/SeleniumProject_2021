package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_WebElementMethodlari {

    public static void main(String[] args) {
        // amazon.com'a gidip arama kutusunu locate ediniz
        // aramakutusunun tagName'imini input oldugunu test ediniz
        // arama kutusunun name attribute'unun  oldugunu test ediniz

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // amazon.com'a gidip arama kutusunu locate ediniz
        driver.get("https://www.amazon.com");
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));

        // aramakutusunun tagName'imini input oldugunu test ediniz
        String expectedTagName = "input";
        String actualTagName = aramaKutusu.getTagName();
        if (expectedTagName.equals(actualTagName)) {
            System.out.println("TagName testi PASSED");
        } else {
            System.out.println("TagName testi FAILED");
        }

        // arama kutusunun name attribute'unun degerini "field-keywords" oldugunu test ediniz
        String expectedName = "field-keywords";
        String actualTName = aramaKutusu.getAttribute("name");
        if (expectedName.equals(actualTName)) {
            System.out.println("name attribute testi PASSED");
        } else {
            System.out.println("name attribute testi FAILED");
        }


        System.out.println("webelementin yuksekligi : " + aramaKutusu.getSize().height);

        //sayfayi kapatiniz
        driver.close();



        /*
        webElement.getTagName();  >> daha once locate ettigimiz bir webelementin tagname'ni dondurur
        webElement.getAttribute(attrributeIsmi); >>  daha once locate ettigimiz bir webelementin
                                                     istedigimiz attribute'unun  degerini dondurur
         */
    }
}
