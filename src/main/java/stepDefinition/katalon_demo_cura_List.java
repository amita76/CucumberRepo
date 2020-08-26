/**
 * 
 */
package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author ASaraf
 * 
 * This is example of Data Table without header and single row data
 */
public class katalon_demo_cura_List {
	
	WebDriver driver;
	//Katalon Login page using Data table
	
	@Given("^user loads katalon application$")
	public void user_loads_katalon_application() throws InterruptedException  {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumSW\\geckodriver-v0.25.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://katalon-demo-cura.herokuapp.com/profile.php#login");
		Thread.sleep(3000);
	}
	
	@When("^user is on Home page$")
	public void user_is_on_Home_page()  {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("CURA Healthcare Service",title);
	}

	@Then("^user enter credentials to katalon login page$")
	public void user_enter_credentials_to_katalon_login_page(DataTable dt)  {
	 List<List<String>> cred = dt.raw();
//	 new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.name("username"))).sendKeys(cred.get(0).get(0));
	 driver.findElement(By.id("txt-username")).sendKeys(cred.get(0).get(0));
//	 new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.name("passwd"))).sendKeys(cred.get(0).get(1));
	 driver.findElement(By.id("txt-password")).sendKeys(cred.get(0).get(1));
	}

	@Then("^user clicks  on Login$")
	public void user_clicks_on_Login() {
		driver.findElement(By.id("btn-login")).click();
	}


}
