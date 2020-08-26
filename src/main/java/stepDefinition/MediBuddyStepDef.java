package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class MediBuddyStepDef {
	WebDriver driver;

@Given("^user is on Medi login page$")
public void user_is_on_login_page() throws Throwable {
	System.setProperty("webdriver.gecko.driver", "C:\\SeleniumSW\\geckodriver-v0.25.0-win64\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get("https://portal.medibuddy.in/Home.aspx");
}

@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_enters_and(String user, String pass)  {
driver.findElement(By.id("username")).sendKeys(user);
driver.findElement(By.id("password")).sendKeys(pass);
}

@Then("^user clicks on Medi Sign In button$")
public void user_clicks_on_Sign_In_button() {
	driver.findElement(By.id("signinBtn")).click();
}

@Then("^user verifies the title of the Medi page$")
public void user_verifies_the_title_of_the_page(){
String title = driver.getTitle();
Assert.assertEquals(title, "MediBuddy Your e-gateway to Medi Assist services");
}



}
