package tests.day02_driverMethodlari_locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_driverGetMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","kurulum dosyaları/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");

        System.out.println("Title: " + driver.getTitle());
        System.out.println("URL : " + driver.getCurrentUrl());
        System.out.println("=================");
        System.out.println(driver.getPageSource());

        System.out.println("Window handle değeri: "+driver.getWindowHandle()); // A67F764F16298879E995241982820E2A
        System.out.println("Window handle değerleri seti : "+driver.getWindowHandles()); //  [A67F764F16298879E995241982820E2A]

        /*
        Webdriver her pencereye unique bir window handle değeri ataması yapar

        Bir test class'ı çalışmaya başladıktan sonra
        birden fazla pencere de açabilir.

        bu durumda tek bir window handle değeri değil
        açılan sayfa adedince window handle değerleri olur.
        birden fazla elemenr olunca Selenium onları set'e koymayı uygun görmüş.
         */

        Thread.sleep(13000);
        driver.close();


}   }
