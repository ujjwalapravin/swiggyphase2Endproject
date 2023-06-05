package stepdefss;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hookss {
	public static WebDriver driver;
	
	@Before
	public void SetUp() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		Thread.sleep(3000);
driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
driver.manage().window().maximize();
	}
	
	@After
	public void TearDown() {
		
		driver.quit();
		
	}

}




