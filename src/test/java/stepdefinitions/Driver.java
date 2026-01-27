package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Driver {
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("user is on login page");
	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("user enters valid username and password");
	}

	@Then("user should be logged in successfully")
	public void user_should_be_logged_in_successfully() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("user should be logged in successfully");
	}



}
