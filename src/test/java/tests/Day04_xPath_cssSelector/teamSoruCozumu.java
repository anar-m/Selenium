package tests.day04_xPath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class teamSoruCozumu {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","kurulum dosyaları/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        // 1- https://www.trendyol.com adresine gidin
        driver.get("https://www.trendyol.com");
        // 2- Sayfa basşlığını yazdırın
        System.out.println(driver.getTitle());
        // 3- Sayfayi “refresh” yapin
        driver.navigate().refresh();
        // 4- Sayfa basliginin "Trend Ürünler" ifadesi icerdigini test edin
        String expectedIcerik = "Trend Ürünler";
        String actualIcerik = driver.getTitle();
        if (actualIcerik.contains(expectedIcerik)){
            System.out.println("Title testi PASSED");
        }else {
            System.out.println("Title testi FAİLED");
        }
        // 5- Elektronik sekmesine basin
        driver.findElement(By.linkText("Elektronik")).click();
        // 6- Ev Aletleri butonuna basin
        driver.findElement(By.linkText("Ev Aletleri")).click();
        // 7- ilk urunu tiklayin
        driver.findElement(By.xpath("(//div[@class='image-overlay-body'])[1]")).click();

        // 8- Urun ucretinin 199 oldugunu test edin--(//div[@class='prc-box-dscntd'])[1]
        WebElement urunUcret = driver.findElement(By.xpath("(//div[@class='prc-box-dscntd'])[1]"));
        String expectedUrunUcret = "199 TL";
        String actualUrunUcret = urunUcret.getText();
        if (actualUrunUcret.equals(expectedUrunUcret)){
            System.out.println("PASSED");

        }else {
            System.out.println("FAILED");
        }

        // 9- Sayfayi kapatin
        driver.quit();

    }
}