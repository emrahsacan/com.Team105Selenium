package Tekrar_11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C10 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.automationexercise.com/");

       List<WebElement> categoryList =driver.findElements(By.className("panel-title"));

       if(categoryList.size()==3){
           System.out.println("category test passed");
       }else{
           System.out.println("category test failed");
       }

       for (WebElement each:categoryList){
           System.out.println(each.getText());
       }
       driver.close();
    }

}
