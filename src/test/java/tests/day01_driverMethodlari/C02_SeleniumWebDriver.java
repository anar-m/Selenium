package tests.day01_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class C02_SeleniumWebDriver {
    public static void main(String[] args) {

         // ilk adımı atlayıp direk wwbeDRİVER OJESİ OLUŞTURUN
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");

        /*
        Selenium son versiyonlarından birinde kendi
        WebDriver  class'ını ekledi
        Böylece oncesinde driver.exe dosyasını tanıtmasak da istediğimiz
        browser'ı çalıştırır.

        sedece öncelikle bizden bir driver beklediği için
         birazcık geç çalışır

         şirketler açok kanyaklı driver kullanmayı tercih etmez
         genellikle satın aldıkları bir driver ı kullanmanızı isterler
         bu durumda size verdikleri driver ile ilk satırı yazmalısınız
         */
    }
}
