package TC;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BC {
    public WebDriver driver;
    public ExtentReports report;
    public ExtentTest test;
	
    
    @BeforeTest
    
	public void ReportSetup() {
    	report = new ExtentReports("ExtentReport.html");
    }
    
    @BeforeMethod
    public void setUp(Method method) {
    	WebDriverManager.chromedriver().setup();
    	test = report.startTest(method.getName());
		test.log(LogStatus.INFO, "Test should be started", "test case started successfully");

        
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.swiggy.com/");
        
    }

    

	@AfterMethod
	public void TearDown() {
		
		report.endTest(test);
		driver.quit();
		
	}
	
	@AfterTest
	public void ReportClean() {
		
		report.flush();
		report.close();
		
	}

}
