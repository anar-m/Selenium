package tests.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.ByteArrayInputStream;
import java.time.Duration;

public class P05 {
    /*
        1-Driver oluşturalim
        2-Java class'imiza chnomedriver. exetyi tanitalim
        3-Driver'in tum ekranı kaplamasini sagu ayalim
        4-Driverla sayfanın yuklenmesini 10.809 milisaniye (10 saniye) boyunca beklesini söyleyelim.
         Eger oncesinde sqyfa Yüklenirse, beklemeyi bıraksın.
        5-Navigate to http://www.babayigit.net/murat/testpage.html
        6-first name, surname, age, Your Job, Birth Palace, Last graduated school, Number of Children
          alanlarına gerekli bilgileri yazsın
        7-Submit tuşuna bassın.
        8- All information was entered correctly.. yazısının göründüğünü test etsin
        9- Clear butonu ile tüm butonları temizlesin
        10- Manuel olarak temizlendiğini görecek kadar beklesin
        11- Sayfayı kapatsın
        10-8. maddededeki Test sonucunu yazdırsın
    */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","kurulum dosyaları/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10809));

        // 5-Navigate to http://www.babayigit.net/murat/testpage.html
        driver.get("http://www.babayigit.net/murat/testpage.html");

        // 6-first name, surname, age, Your Job, Birth Palace, Last graduated school,
        // Number of Children alanlarına gerekli bilgileri yazsın
        // firstname textbox= //input[@type='text'][1] -- //input[@id='ad'] -- //input[@name='ad']
        driver.findElement(By.id("ad")).sendKeys("Mustafa");
        driver.findElement(By.id("soyad")).sendKeys("ANAR");
        driver.findElement(By.id("yas")).sendKeys("42");
        driver.findElement(By.id("meslek")).sendKeys("Insructor");
        driver.findElement(By.name("dogum_yeri")).sendKeys("Ordu");
        driver.findElement(By.id("mezun_okul")).sendKeys("Karadeniz Tecnical University");
        driver.findElement(By.id("cocuk_sayisi")).sendKeys("2");
        driver.findElement(By.xpath("//input[@value='Submit']")).click();

        String expectedResult = "All information was entered correctly..";
        String actualResult = driver.findElement(By.xpath("//p[text()='All information was entered correctly..']")).getText();

        if (expectedResult.equals(actualResult)){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }
        driver.findElement(By.xpath("//input[@value='Clear']")).click();

        Thread.sleep(5000);
        driver.close();
    }
}
