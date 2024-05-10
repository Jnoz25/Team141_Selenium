package tests.day01_webDriverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_WebDriverOlusturma {

    public static void main(String[] args) throws InterruptedException {

        //Biz web'de yapacagimiz tum testler icin webDriver objesine ihtiyac duyarız
        // Herseyimizi bunla yaparız

        System.setProperty("Webdriver.chrome.driver","kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // testotomasyonu ana sayfaya gidin
        driver.get("https://www.testotomasyonu.com");
        //5 saniye bekleyin
        Thread.sleep(5000);
        // sayfayi kapatin
        driver.quit();
    }
}
