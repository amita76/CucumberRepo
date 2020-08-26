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
public class Hooks_single_scenario {

	@Before
	public void beforeScenario() {
		System.out.println("This will run before the Scenario");
	}

	@After
	public void afterScenario() {
		System.out.println("This will run after the Scenario");
	}

	@Given("^this is the first step$")
	public void this_is_the_first_step() throws Throwable {
		System.out.println("First Step!");
	}

	@When("^this is the second step$")
	public void this_is_the_second_step() throws Throwable {
		System.out.println("Second Step!");
	}

	@Then("^this is the third step$")
	public void this_is_the_third_step() throws Throwable {
		System.out.println("Third Step!");
	}

}
