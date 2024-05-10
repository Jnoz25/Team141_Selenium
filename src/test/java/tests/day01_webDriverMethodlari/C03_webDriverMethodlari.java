package tests.day01_webDriverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_webDriverMethodlari {

    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver","kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.get("https://www.testotomasyonu.com");

        System.out.println(driver.getTitle());
        //System.out.println(driver.getPageSource());
        System.out.println(driver.getWindowHandle());
        System.out.println(driver.getWindowHandles());


        driver.quit();

    }
}
