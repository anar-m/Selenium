package tests.day01_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkClass {
    public static void main(String[] args) {

        /*
         test için her class olusturdugumuzda
         ilk yapmamız gereken web driver objesi olusturmaktır
         WebDriveer objesi istediğimiz browser'ın bir
         kopyasını olusturup istediğimiz web islemlerini yapacak

         her browser'ın dosyası farklı oldğundan
         prpjemizde kullanmak istediğimiz her browse'ın driver'ini
         seleniom.dev deki browser bolumunden indirip projemize kopyalıyoruz

         */

        // her class'da o class'da kullanacağımız browser'ı tanıtmalıyız
        System.setProperty("webdriver.chrome.driver","kurulum dosyaları/chromedriver-win64/chromedriver-win64/chromedriver.exe");

        // WebDriver objesi oluşturalım
        WebDriver driver = new ChromeDriver();

        // artık bu driver objesi ile istenen otomasyonları yapabiliriz
        driver.get("https://www.amazon.com");
    }
}
