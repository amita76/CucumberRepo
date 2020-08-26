/**
 * 
 */
package stepDefinition;

import java.util.List;
import java.util.Map;

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
 */
public class katalon_demo_cura_Map {

	WebDriver driver;

	@Given("^user loads Katalon-Cura application$")
	public void user_loads_Katalon_Cura_application() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumSW\\geckodriver-v0.25.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://katalon-demo-cura.herokuapp.com/profile.php#login");
		Thread.sleep(3000);
	}

	@When("^user is on Katalon-Cura Home page$")
	public void user_is_on_Katalon_Cura_Home_page() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("CURA Healthcare Service", title);
	}

	@Then("^user enter credentials to Katalon-Cura login page$")
	public void user_enter_credentials_to_Katalon_Cura_login_page(DataTable credentials) {
		for (Map<String, String> data : credentials.asMaps(String.class, String.class)) {
			driver.findElement(By.id("txt-username")).sendKeys(data.get("username"));
			driver.findElement(By.id("txt-password")).sendKeys(data.get("password"));
		}
//		List<Map<String,String>> list = credentials.asMaps(String.class ,String.class);
//		for ( int i=0; i<list.size(); i++) {
//			driver.findElement(By.id("txt-username")).sendKeys(list.get(i).get("username"));
//			driver.findElement(By.id("txt-password")).sendKeys(list.get(i).get("password"));
		
	}

	@Then("^user clicks on Login of Katalon-Cura$")
	public void user_clicks_on_Login_of_Katalon_Cura() {
		driver.findElement(By.id("btn-login")).click();
	}

}
