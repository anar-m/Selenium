package tests.day02_driverMethodlari_locators;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_driver_ManageMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","kurulum dosyaları/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            // görev odaklı çalışır, 15 saniye max bekleme süresidir.
            // görev daha önce tamamlanırsa yoluna devam eder.
            // 15 saniye içinde görev tamamlanmazsa  hata verir
            // görev : sayfanın açılması ve kullanılacak web-elementlerin bulunmasıdır

        System.out.println("Maximize size: "+ driver.manage().window().getSize()); // (1552, 832) pixel
        System.out.println("Maximize konum: " + driver.manage().window().getPosition()); // (-8, -8) pixel

        // window'u fullscreen yapın
        driver.manage().window().fullscreen();
        System.out.println("Fullscreen size: "+ driver.manage().window().getSize());
        System.out.println("Fullscreen konum: " + driver.manage().window().getPosition());

        // window'un başlangıç konumunu(200, 300) ve boyutunu (500, 500) yapın

        driver.manage().window().setSize(new Dimension(500,500));
        driver.manage().window().setPosition(new Point(200,300));


        System.out.println("Custumize size: "+ driver.manage().window().getSize()); // (516, 503)
        System.out.println("Custumize konum: " + driver.manage().window().getPosition()); // (200, 300)


        Thread.sleep(3000);   // Java'dan gelir ve kodları bekletir
        driver.close();
    }
}
