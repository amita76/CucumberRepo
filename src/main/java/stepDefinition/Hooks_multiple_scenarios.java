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
public class Hooks_multiple_scenarios {
	
	@Before
	public void beforeScenario() {
		System.out.println("This will run before the Scenario");
	}

	@After
	public void afterScenario() {
		System.out.println("This will run after the Scenario");
	}
	
	@Given("^this is the first-step$")
	public void this_is_the_first_step() throws Throwable {
		System.out.println("1 step");
	}

	@When("^this is the second-step$")
	public void this_is_the_second_step() throws Throwable {
		System.out.println("2 step");
	}

	@Then("^this is the third-step$")
	public void this_is_the_third_step() throws Throwable {
		System.out.println("3 step");
	}

	@Given("^this is the fourth step$")
	public void this_is_the_fourth_step() throws Throwable {
		System.out.println("4 step");
	}

	@When("^this is the fifth step$")
	public void this_is_the_fifth_step() throws Throwable {
		System.out.println("5 step");
	}

	@Then("^this is the sixth step$")
	public void this_is_the_sixth_step() throws Throwable {
		System.out.println("6 step");
	}




}
