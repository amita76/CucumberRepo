/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Register {
	
	WebDriver driver;
	
	@Given("^when user is register page$")
	public void when_user_is_register_page() throws InterruptedException  {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumSW\\geckodriver-v0.25.0-win64\\geckodriver.exe");
		WebDriver  driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		Thread.sleep(3000);
//		driver.findElement(By.name("userName")).sendKeys("mercury");
//		driver.findElement(By.name("password")).sendKeys("admin");
	
	}

//	@Then("^user clicks on REGISTER$")
//	public void user_clicks_on_REGISTER()  {
//		driver.findElement(By.xpath("//a[@href='mercuryregister.php'][contains(.,'REGISTER')]")).click();
//	}

	@Then("^user enters contact information \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_contact_information_and_and_and(String first, String last, String ph, String email) {
		driver.findElement(By.name("firstName")).sendKeys(first);
		driver.findElement(By.name("lastName")).sendKeys(last);
		driver.findElement(By.name("phone")).sendKeys(ph);
		driver.findElement(By.name("userName")).sendKeys(email);
	}

	@Then("^user enters mailing information \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and select country$")
	public void user_enters_mailing_information_and_and_and_and_select_country(String address, String city, String state, String postalCode)  {
		driver.findElement(By.name("address1")).sendKeys(address);
		driver.findElement(By.name("city")).sendKeys(city);
		driver.findElement(By.name("state")).sendKeys(state);
		driver.findElement(By.name("postalCode")).sendKeys(postalCode);
		Select cnty = new Select(driver.findElement(By.name("country")));
		cnty.deselectByVisibleText("INDIA ");
	}

	@Then("^user enters user information \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_user_information_and_and(String username, String password, String confirmPassword)  {
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("confirmPassword")).sendKeys(confirmPassword);
	}

	@Then("^user clicks on submit button$")
	public void user_clicks_on_submit_button() {
		driver.findElement(By.name("register")).click();
	}



}
*/