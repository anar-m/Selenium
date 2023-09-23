package tests.day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_ByClassNameLocator {
    public static void main(String[] args) throws InterruptedException {
       // 1- Bir test class’i olusturun ilgili ayarlari yapin
        System.setProperty("webdriver.chrome.driver","kurulum dosyaları/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

       // 2- https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com/");

        //3- Category bolumundeki elementleri locate edin
        List<WebElement> catagoryList = driver.findElements(By.className("panel-title"));

       // 4- Category bolumunde 3 element oldugunu test edin
        int expectedCatagorySayisi = 3;
        int actualCatagorySayisi =catagoryList.size();
        if (expectedCatagorySayisi==actualCatagorySayisi){
            System.out.println("Category Sayısı Testi PASSED");
        }else {
            System.out.println("Category Sayısı Testi FAILED");
        }

       // 5- Category isimlerini yazdirin
        //System.out.println(catagoryList);
        // webelementlerden oluşan bir lsteyi direct yazdıramayız
        // elemetler üzerindeki yazıları yazdırmak istersek
        // for-each-loop ile her wweb elementi ele alıp
        // üzerindeki yazıyı yazdırabilriz
        for (WebElement each: catagoryList
             ) {
            System.out.println(each.getText());
        }
       // 6- Sayfayi kapatin
      Thread.sleep(5000);
        driver.close();
    }
}
