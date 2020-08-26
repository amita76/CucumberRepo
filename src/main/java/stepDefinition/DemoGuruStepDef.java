package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoGuruStepDef {

	WebDriver driver;

	@When("^user is on Login page$")
	public void user_is_on_Login_page() throws Throwable {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumSW\\geckodriver-v0.25.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/V4/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}

// Simple I
//	@Then("^user enters username and password$")
//	public void user_enters_username_and_password() throws Throwable {
//		driver.findElement(By.name("uid")).sendKeys("mngr279630");
//		driver.findElement(By.name("password")).sendKeys("dEtuqYg");
//	}

// II - Hardcoding in StepDefinition 	
//	@Then("^user entering \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void user_entering_and(String arg1, String arg2) throws Throwable {
//		driver.findElement(By.name("uid")).sendKeys(arg1);
//		driver.findElement(By.name("password")).sendKeys(arg2);
//	}

// III - Scenario Outline with Example keyword	
//	@Then("^user put \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void user_put_and(String uname, String passwd) throws Throwable {
//		driver.findElement(By.name("uid")).sendKeys(uname);
//		driver.findElement(By.name("password")).sendKeys(passwd);
//	}

	@Then("^user enters credentials$")
	public void user_enters_credentials(DataTable dt) throws Throwable {
		List<List<String>> data = dt.raw();
		driver.findElement(By.name("uid")).sendKeys(data.get(0).get(0));
		driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
	}
	
		@Then("^user clicks on the Login button$")
	public void user_clicks_on_the_Login_button() throws Throwable {
		driver.findElement(By.name("btnLogin")).click();
	}

}
