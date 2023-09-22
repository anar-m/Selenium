package tests.day02_driverMethodlari_locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_IlkOtomasyonTesti {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "kurulum dosyaları/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2. Yeni bir class olusturalim : C03_GetMethods
        // 3. Amazon sayfasina gidelim. https://www.amazon.com/

        driver.get("https://www.amazon.com");

        // 4. Sayfa basligini(title) yazdirin
        System.out.println("Sayfanin başlığı: "+ driver.getTitle());

        // 5. Sayfa basliginin “Amazon” icerdigini test edin
        String expectedIcerik = "Amazon";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedIcerik)){
            System.out.println("Title testi PASSED");
        }else{
            System.out.println("Title testi FAILED");
            System.out.println("Sayfadaki actulaTitle: "+actualTitle);
        }
        System.out.println("Actual sayfa URL'i: "+ driver.getCurrentUrl());
        String expectedUrlIcerik = "amazon";

        // 6. Sayfa adresini(url) yazdirin
        String actualUrl = driver.getCurrentUrl();

        // 7. Sayfa url’inin “amazon” icerdigini test edin.
        if (actualUrl.contains(expectedUrlIcerik)){
            System.out.println("Url test PASSED");
        }else {
            System.out.println("Title testi FAILED");
        }

        // 8. Sayfa handle degerini yazdirin
        System.out.println("Sayfanın handle değeri:" +driver.getWindowHandle());

        // 9. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin
        String expectedSayfaIcerigi = "alisveris";
        String actualSayfaAKaynakKodlari = driver.getPageSource();

        if (actualSayfaAKaynakKodlari.contains(expectedSayfaIcerigi)){
            System.out.println("Sayfa kaynağı testi PASSED");
        }else {
            System.out.println("Sayfa kaynağı testi FAILED");
            System.out.println("Sayfa Kaynak kodları ' "+ expectedSayfaIcerigi + " ' kelimesi içermiyor");
        }

        // 10. Sayfayi kapatin.
        Thread.sleep(3000);
        driver.close();
    }

}
