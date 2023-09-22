package tests.day02_driverMethodlari_locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class C03_driverNavigateMethodlari {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver =  new FirefoxDriver(); // Seleniım'un kendi webdriver'ını kullanır.
        driver.manage().window().maximize();

        // amazon anasayfaya gidin
        driver.get("https://www.amazon.com");

        // sayfa başlığının "smile more" içerdiğiniz test edin
        String expectedTitleIcerik = "smile more";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitleIcerik)){
            System.out.println("Amazon title testi PASSED");
        } else {
            System.out.println("Amazon title testi FAILED");
        }

        // youtube anasayfaya gidin
        driver.navigate().to("https://www.youtube.com");
        //Url'in "youtube" içerdiğini test edin
        String expectedUrlIcerik = "youtube";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrlIcerik)){
            System.out.println("Youtube Url testi PASSED");
        }else {
            System.out.println("Youtube Url testi FAILED");
        }
        // tekrar amazon anasayfaya dönün
        driver.navigate().back();

        // ve Url'in "ramazon" içermediğini test edin
        String unexpectedUrlIcerik = "ramazon";
        actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(unexpectedUrlIcerik)){
            System.out.println("Amazon Url testi FAILED");
        }else {
            System.out.println("Amazon Url testi PASSED");
        }

        // tekrar "youtebe" anasayfaya gidin
        driver.navigate().forward();

        // sayfa kaynak kodlarında "music" geçtiğini test edin
        String expectedSayfaIcerik = "music";
        String actualKaynakKodlari = driver.getPageSource();
        if (actualKaynakKodlari.contains(expectedSayfaIcerik)){
            System.out.println("youtube kaynak kodları PASSED");
        }else {
            System.out.println("youtube kaynak kodları FAILED");
        }

         // ve sayfayı kapatın

        Thread.sleep(3000);
        driver.close();
    }
}
