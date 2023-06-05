package TC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class TC_logintest extends BC {
 
   @Test
    public void orderProduct() throws InterruptedException {
        // Find the search input element
driver.findElement(By.xpath("//button[@class='_1fiQt']")).click(); 
Thread.sleep(3000);
driver.findElement(By.xpath("//span[text()='Search']")).click();
Thread.sleep(3000);
driver.findElement(By.className("_2FkHZ")).sendKeys("burger");
Thread.sleep(3000);
driver.findElement(By.xpath("//div[@class='RNzoC']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//div[@data-testid='resturant-card-name']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//div[@class='_1RPOp']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//span[text()='Cart']")).click();
    
    }
   
}

