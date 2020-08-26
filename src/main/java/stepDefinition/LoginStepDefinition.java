package stepDefinition;

import java.security.Key;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	
	WebDriver driver;
	
	@Given("^user is already on login page$")
	public void user_is_already_on_login_page() {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumSW\\geckodriver-v0.25.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	//	driver.get("http://demo.guru99.com/test/newtours/");
		driver.get("https://katalon-demo-cura.herokuapp.com/profile.php#login");
	}


//	1- Simple feature file  //Feature file takes variable and java file takes values as argument
	@Then("^user enter username and password$")
	public void user_enter_username_and_password()  {
		driver.findElement(By.id("txt-username")).sendKeys("John Doe");
		driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
	}

//	2 - Data driven without using Example //Feature file takes values directly and java file takes argumnets to call them
//	@Then("^user enter \"(.*)\" and \"(.*)\"$")     
//	public void user_enter_username_and_password(String username, String password)  {
//		driver.findElement(By.id("txt-username")).sendKeys(username);
//		driver.findElement(By.id("txt-password")).sendKeys(password);
//	}
// Change from "Then user enter username and password" to> Then user enter "John Doe" and "ThisIsNotAPasswordmin" in feature file	
// feature file will have Scenario only and not Scenario Outline
	
	
	
	
//	3 - Data driven with Examples Keyword
//	@Then("^user enter \"(.*)\" and \"(.*)\"$")     
//	public void user_enter_username_and_password(String username, String password)  {
//		driver.findElement(By.name("userName")).sendKeys(username);
//		driver.findElement(By.name("password")).sendKeys(password);
//	}
// In feature file - write Scenario Outline and add Examples keyword with columns in table 	
	
//// 4 - using Data table	
//	@Then("^user enter credentials to login page$")
//	public void user_enter_credentials_to_login_page(DataTable dt)  {
// //	using raw()
//		List<List<String>> data = dt.raw();
//		driver.findElement(By.name("userName")).sendKeys(data.get(0).get(0));
//		driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
//		WebElement webElement = driver.findElement(By.xpath(""));
//		webElement.sendKeys(Keys.ENTER);
		
//	//	using asList		
//		List<String> data = dt.asList(String.class);
//		driver.findElement(By.name("userName")).sendKeys(data.get(0));
//		driver.findElement(By.name("password")).sendKeys(data.get(1));
//	}
	
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		driver.findElement(By.id("btn-login")).click();
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page()  {
	String homeTitle = driver.getTitle();
	System.out.println(homeTitle);
	Assert.assertEquals("CURA Healthcare Service",homeTitle);
	}


//	@And("^title of the login page is CURAHealthcareService$")
//	public void title_of_the_login_page_is_CURA Healthcare_Service() {
//		String title = driver.getTitle();
//		System.out.println(title);
//		Assert.assertEquals("CURA Healthcare Service",title);
//	}
	

}
