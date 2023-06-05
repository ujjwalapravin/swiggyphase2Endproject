package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class commom {
	
	WebDriver driver;
	public commom(WebDriver driver) {
		this.driver =driver;
	}
	@FindBy(how=How.NAME,using = "_2CgXb")
	private WebElement txtbx_search;
	
	@FindBy(how=How.CLASS_NAME,using = "Search for restaurants and food")
	private WebElement btn_search;
	
	//Methods
	public void SetSearchTextBox(String arg) {
		txtbx_search.sendKeys("pizza");
	}
	public void SetSearchButton() {
		btn_search.click();
	}
}
