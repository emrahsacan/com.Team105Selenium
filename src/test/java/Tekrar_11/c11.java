package Tekrar_11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class c11 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.automationexercise.com/");
        Thread.sleep(3000);

        List<WebElement> linkList = driver.findElements(By.tagName("a"));

        if (linkList.size()==147){
            System.out.println("link test passed");
        } else {
            System.out.println("Link test failed");
        }

        WebElement produckLink = driver.findElement(By.partialLinkText("Products"));
        produckLink.click();

        Thread.sleep(3000);
        WebElement specialOffer=driver.findElement(By.id("sale_image"));

        if(specialOffer.isDisplayed()){
            System.out.println("special Offer test passed");
        } else {
            System.out.println("special Offer test failed");
        }

        driver.close();



    }
}
