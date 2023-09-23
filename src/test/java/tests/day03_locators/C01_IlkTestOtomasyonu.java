package tests.day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_IlkTestOtomasyonu {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdrivwr.chrome.driver","kurulum dosyaları/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // amazon anasayfaya gidin
        driver.get("https://www.amazon.com");

        // arama kutusuna "Nutella" yazdirip aratin
        //önce arama kutusunu findElement() ve Locator ile driver'e tanıtıp
        // o webElementi bu claas'da kullanabileceğim sekilde kaydetmeliyim
        WebElement aramaKutusu  = driver.findElement(By.id("twotabsearchtextbox"));

        /*
        aramaKutusu.sendKeys("Nutella");
        aramaKutusu.submit();
        bu işlemi iki satırda yapmak yerine isterseniz aşağıdaki gibi de yapabilirsiniz
         */
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
        // arama sonuclarinin "Nutella" icerdigini test edin
        // By.className loactor'ı class attribute'nün değeri boşluk içerdiğinde
        // sağlıklı ÇALIŞMAZ
        // çoğunlukla class ismi aynı özellliklerdeki webelementleri gruplandırmak için kullanılır
        // biz de class değeri arattığımızda 73 tane webelement buldu

        //WebElement aramaSonucElementi = driver.findElement(By.className("sg-col-inner"));
        List<WebElement> elementlerListesi = driver.findElements(By.className("sg-col-inner"));
        String actualAramaSonucu = elementlerListesi.get(0).getText();
        String expectedIcerik = "Nutella";

        if (actualAramaSonucu.contains("Nutella")){
            System.out.println("Ilk otomasyon testi PASSED");
        }else{
            System.out.println("Ilk otomasyon testi FAILED");
        }


        driver.close();
    }
}
