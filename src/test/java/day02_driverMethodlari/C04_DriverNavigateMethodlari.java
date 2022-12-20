package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverNavigateMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.amazon.com");
        // get ile aynı  işlevi yapar


        Thread.sleep(3000);

        driver.get("https://www.wisequarter.com");

        Thread.sleep(3000);
        // yeniden amazon'a dönelim

        driver.navigate().back();

        Thread.sleep(3000);
        //tekrar wisequarter


        Thread.sleep(3000);
        driver.quit();
    }
}
