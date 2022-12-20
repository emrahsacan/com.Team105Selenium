package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethodlari {
    public static void main(String[] args) throws InterruptedException {

        // Biz browser'lari olusturduğumuz driver sayesinde otomate edebiliyoruz
        // bunun için her testin basinda mutlaka driver objesi olusturacagiz
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        // acilan sayfanın başlığının amazon içerdiğini test edin

        String expectedKelime= "amazon";
        String actualResult= driver.getTitle();
        if(actualResult.contains(expectedKelime)){
            System.out.println("Title testi passed");
        } else {
            System.out.println("Title amazon içermiyor, test FAILED");
            System.out.println(driver.getTitle());
        }

        // gittiğimiz sayfanin URL'nin https://www.amazon.com/ olduğunu test edin

        String expectedUrl="https://www.amazon.com/";
        String actualUrl= driver.getCurrentUrl();

       // if(expectedUrl)

        Thread.sleep(5000);
        driver.close();

    }
}
