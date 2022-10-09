package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_Locators {
    public static void main(String[] args) {
        /*
        1- http://a.testaddressbook.com adresine gidiniz
        2- Sign butonuna basiniz
        3- email textboz, password textbox, and sign button webelementlerini locate ediniz
        4- Kullanici ve sifreyi assagidaki gibi giriniz ve sign butonuna basiniz
           a- Username : testtechproed@gmail.com
           b- Password : Test1234!
        5- Expected user id'nin testtechproed@gmail.com oldugunu dogrulayin
        6- "Address" ve "Sign Out" textlerinin goruntulendigini dogrulayin
        7- Sayfada kactane link oldugunu bulun
         */



        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //1- http://a.testaddressbook.com adresine gidiniz
        driver.get("http://a.testaddressbook.com");


        //2- Sign butonuna basiniz
        WebElement signIn = driver.findElement(By.id("sign-in"));
        signIn.click();


        //3- email textbox, password textbox, and sign button webelementlerini locate ediniz
        WebElement emailTextBox = driver.findElement(By.id("session_email"));
        WebElement passwordTextBox = driver.findElement(By.id("session_password"));
        WebElement signButton = driver.findElement(By.name("commit"));

        //4- Kullanici ve sifreyi assagidaki gibi giriniz ve sign butonuna basiniz
        //a- Username : testtechproed@gmail.com
        //b- Password : Test1234!
        emailTextBox.sendKeys("testtechproed@gmail.com");
        passwordTextBox.sendKeys("Test1234!");
        signButton.click();


        //5- Expected user id'nin testtechproed@gmail.com oldugunu dogrulayin
        WebElement actualKullaniciAdi = driver.findElement(By.className("navbar-text"));
        System.out.println(actualKullaniciAdi.getText()); // testtechproed@gmail.com
        //bir webelementi uzerinde ne yazdigini gormek istiyorsak
        // webElementIsmi.getText(); methodunu kullaniriz

        String expectedKullaniciAdi = "testtechproed@gmail.com";
        if (actualKullaniciAdi.equals(expectedKullaniciAdi)){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }


        //6- "Address" ve "Sign Out" textlerinin goruntulendigini dogrulayin
        WebElement addressText = driver.findElement(By.linkText("Addresses"));
        WebElement signOutTex = driver.findElement(By.linkText("Sign out"));
        if (addressText.isSelected()){
            System.out.println("Address test PASSED");
        }else {
            System.out.println("Address test FAILED");
        }

        if (addressText.isSelected()){
            System.out.println("Sign out test PASSED");
        }else {
            System.out.println("Sign out test FAILED");
        }


        //7- Sayfada kac tane link oldugunu bulun
        List<WebElement> linklerinListesi = driver.findElements(By.tagName("a"));
        System.out.println("sayfadaki linklerin sayisi : " + linklerinListesi.size());


        //sayfayi kapatiniz
        driver.close();
    }
}
