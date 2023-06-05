package stepdefss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SwiggyLoginStepDef {
	
	WebDriver driver = Hookss.driver;
	@Given("I am on the home screen")
	public void i_am_on_the_home_screen() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.get("https://www.swiggy.com/");
		Thread.sleep(3000);
	}
	@When("I click on location")
	public void i_click_on_location() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[@class='_1fiQt']")).click(); 
		Thread.sleep(3000);
	}
	@When("I click on search")
	public void i_click_on_search() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		Thread.sleep(3000);  
	}

	@When("I search for {string} in the search bar")
	public void i_search_for_in_the_search_bar(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.className("_2FkHZ")).sendKeys("burger");
		Thread.sleep(3000);
	}

	@When("I choose a Burger from the restaurant menu")
	public void i_choose_a_Burger_from_the_restaurant_menu() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//div[@class='RNzoC']")).click();
		Thread.sleep(3000); 
	}

	@When("I add the burger to my cart")
	public void i_add_the_burger_to_my_cart() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//div[@data-testid='resturant-card-name']")).click();
		Thread.sleep(3000);
	    }

	@When("I click on add to item")
	public void i_click_on_add_to_item() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//div[@class='_1RPOp']")).click();
		Thread.sleep(3000);
		}
	@When("I click on cart")
	public void i_click_on_cart() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.xpath("//span[text()='Cart']")).click();
	}



}