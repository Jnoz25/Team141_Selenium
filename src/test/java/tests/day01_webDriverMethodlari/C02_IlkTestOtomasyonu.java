package tests.day01_webDriverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_IlkTestOtomasyonu {

    public static void main(String[] args) {

        //gerekli ayarlari yapip
        System.setProperty("Webdriver.chrome.driver","kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // testotomasyonu anasayfaya gidin
        driver.get("https://www.testotomasyonu.com");
        // testotomasyonu anasayfanin acildigini test edin

        String expectedUrl = "https://www.testotomasyonu.com/";
        String actualUrl = driver.getCurrentUrl();

        if (expectedUrl.equals(actualUrl)){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
            System.out.println("Expected url : " +expectedUrl);
            System.out.println("Actual url : " + actualUrl);
        }

        // sayfayi kapatin
        driver.quit();



    }
}
