package tests.day01_driverMethodlari;

public class C04_SeleniumKodlar {
    /*
      /*
     1. Her classda kullanacağın browserı tanıt.
     System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver.exe");
     2. WebDriver objesi oluştur. Çalıştırınca boş sayfa(obje) açar.
     WebDriver driver = new ChromeDriver();
     3. Siteye git. (www yazmasakta gider ancak https:// olmazsa gidemez.)
     driver.get("https://www.amazon.com");
     driver.navigate().to("https://www.amazon.com");
     4. Tam sayfa yap.
     driver.manage().window().maximize();
     5. ...sn sayfanın açılmasını ve kodların çalışması için max.bekleme süresi
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(...))
     ...milisaniye kodları beklet.
     Thread.sleep(...);
     6. Driver ı kapat.
     driver.close();
        Açılan pencerelerin tümünü kapat.
     driver.quit();
     7. Sayfa başlığını getir.
     driver.getTitle()
     8. Sayfa URL ini getir.
     driver.getCurrentUrl()
     9. Sayfa kaynak kodlarını getir.
     driver.getPageSource()
     10. Webdriverın her pencereye atadığı ve unique olan window handle değerini getirir.
     driver.getWindowHandle()
     11. Bir ÖNCEKİ SAYFAya gider.
     driver.navigate().back();
     12. Bir SONRAKİ SAYFAya gider.
     driver.navigate().forward();
     13.  Sayfayı yeniler.
     driver.navigate().refresh();
     14. URL in ... içerdğini TEST ET.
     String expectedUrlIcerik = "...";
     String actualUrl = driver.getCurrentUrl();
     if (actualUrl.contains(expectedUrlIcerik)){
         System.out.println("Youtube url testi PASSED");
     }else {
         System.out.println("Youtube url testi FAILED");
     }
     15. Pencerenin başlangıç boyutunu ayarla , getir
     driver.manage().window().setSize(new Dimension(width sayı1, height sayı2));
     driver.manage().window().getSize());
     16. Pencerenin başlangıç konumunu ayarla, getir
     driver.manage().window().setPosition(new Point(x,y));
     driver.manage().window().getPosition());
     17. Arama kutusu ELEMENTini BULMA, içerisine METİN YAZMA  ve aratma.
      WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        1. aramaKutusu.sendKeys("yazılacak metin");
           aramaKutusu.submit();
        2. aramaKutusu.sendKeys("yazılacak metin" + Keys.ENTER);
     18. Bulunan birden fazla elementi kaydedip, içinden element alma ve yazdırma
     List<WebElement> elementlerListesi = driver.findElements(By.className(""));
     String actualAramaSonucu = elementlerListesi.get(i).getText();
     Yazdırma: 1.  for (WebElement each:elementlerListesi) {
                         System.out.println(each.getText());
                     }
                2.  for (int i = 0; i < elementlerListesi.size() ; i++) {
                        System.out.println(i +"-" + elementlerListesi.get(i).getText());
                    }
     19. 'Gift Cards' webelementinin LİNKine TIKLAMA
        1. driver.findElement(By.linkText("Gift Cards")).click();
        2. driver.findElement(By.partialLinkText("Gift")).click();
     20. LOCATORS:
            1. By.id("uniqueId")
            2. By.name("uniqueName")
            3. By.classname("uniqueClassValue")
            4. By.tagname("tagValue")
            5. By.linkTest("link yazısının tamamı")
            6. By.partialLinkText("link yazısının bir bölümü")
             7. By.xpath("//tagName[@attributeIsmi=‘attributeValue']")
             8. By.cssSelector("tagName[attributeIsmi=‘attributeValue'])
     21. Web element erişilebilir mi?
     webElement.isEnabled();
     22. Web element görünüyor mu?
     webElement.isDisplayed();
     23. Web element seçili mi?
     webElement.isSelected();
     24. berlinElementini nycElementine göre relative locator ile locate edin.
     WebElement nycElementi = driver.findElement(By.id("pid3_thumb"));
     WebElement berlinElementi = driver.findElement(RelativeLocator.with(By.tagName("img"))
        .below/toRightOf/toLeftOf/above (nycElementi));
     25. Relative locator’ın dogru calistigini test edin.
        if (berlinElementi.getAttribute("id").equals("pid7_thumb")){
            System.out.println("Berlin testi PASSED");
        }else{
            System.out.println("Berlin testi FAILED");
        }
       */

}
