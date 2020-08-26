/**
 * 
 */
package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author ASaraf
 *
 */
public class Tagged_Hooks {

	@Before
	public void beforeScenario() {
		System.out.println("This will run before the every Scenario");
	}

	@After
	public void afterScenario() {
		System.out.println("This will run after the every Scenario");
	}

	@Before("@First")
	public void beforeFirst() {
		System.out.println("This will run only before the First Scenario");
	}

	@Before("@Second")
	public void beforeSecond() {
		System.out.println("This will run only before the Second Scenario");
	}

	@Before("@Third")
	public void beforeThird() {
		System.out.println("This will run only before the Third Scenario");
	}

	@After("@First")
	public void afterFirst() {
		System.out.println("This will run only after the First Scenario");
	}

	@After("@Second")
	public void afterSecond() {
		System.out.println("This will run only after the Second Scenario");
	}

	@After("@Third")
	public void afterThird() {
		System.out.println("This will run only after the Third Scenario");
	}

	@Given("^user is the first step$")
	public void user_is_the_first_step() throws Throwable {
		System.out.println("This is the first step");
	}

	@When("^user is the second step$")
	public void user_is_the_second_step() throws Throwable {
		System.out.println("This is the second step");
	}

	@Then("^user is the third step$")
	public void user_is_the_third_step() throws Throwable {
		System.out.println("This is the third step");
	}

}
