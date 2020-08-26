package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GitHubStepDefinition {
	
	WebDriver driver;
	

	@Given("^user is on GitHub login page$")
	public void user_is_on_GitHub_login_page() throws Throwable {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumSW\\geckodriver-v0.25.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		Thread.sleep(3000);
	}

//	@When("^user enters username and password$")
//	public void user_enters_username_and_password() throws Throwable {
//		driver.findElement(By.id("login_field")).sendKeys("amita76");
//		driver.findElement(By.id("password")).sendKeys("Amitsa@123");
//	}

	@When("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and(String username, String password) throws Throwable {
		driver.findElement(By.id("login_field")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
	}
	
	@When("^user clicks on Signin button$")
	public void user_clicks_on_Signin_button() throws Throwable {
		driver.findElement(By.name("commit")).click();
	}

	@Then("^user lands on homepage$")
	public void user_lands_on_homepage() throws Throwable {
		String ExpectedTitle="GitHub";
		String Actualtitle = driver.getTitle();
		Assert.assertEquals(Actualtitle, ExpectedTitle);
		System.out.println("User successfully loged in");
	}


	}


