package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import commons.DriverManager;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Home;
import pages.LoggedDashBoard;

public class Demos {
	
	private Home home;
	private LoggedDashBoard loggedDashBoard;
	public Demos(DriverManager driverManager) {
		this.home = new Home(driverManager.getDriver());
		this.loggedDashBoard = new LoggedDashBoard(driverManager.getDriver());
	}
	@Given("The User is on the homepage")
	public void the_user_is_on_the_homepage() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		home.openUrl("https://tutorialsninja.com/demo/index.php?route=common/home");
		home.getNavDetails();
	}

	@When("The User attempts to click MyAccount Drop menu")
	public void the_user_attempts_to_click_my_account_drop_menu() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		home.click_specific_tab_within_navbar("My Account");
	}

	@When("The User attempts to click Register")
	public void the_user_attempts_to_click_register() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		home.click_specific_sub_tab("Register");
	}

	@When("The User enters {string} in the firstname input field")
	public void the_user_enters_in_the_firstname_input_field(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		home.setFirstName(string);
	}

	@When("The User enters {string} in the lastname input field")
	public void the_user_enters_in_the_lastname_input_field(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		home.setLastName(string);
	}

	@When("The User enters {string} in the email input field")
	public void the_user_enters_in_the_email_input_field(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		home.setEmail(string);
	}

	@When("The User enters {string} in the telephone input field")
	public void the_user_enters_in_the_telephone_input_field(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucum/ber.java.PendingException();
		home.setTelephone(string);
	}

	@When("The User enters {string} in the password input field")
	public void the_user_enters_in_the_password_input_field(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		home.setPassword(string);
	}

	@When("The User enters {string} in the confirm password input field")
	public void the_user_enters_in_the_confirm_password_input_field(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		home.setConfirmPassword(string);
	}

	@When("The User select Privacy Policy checkbox on the form")
	public void the_user_select_privacy_policy_checkbox_on_the_form() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		home.setPolicyCheck();
	}

	@When("The User attempts to clicks Continue Button")
	public void the_user_attempts_to_clicks_continue_button() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		home.clickSubmitButton();
	}

	@Then("The account should be created successfully")
	public void the_account_should_be_created_successfully() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumb/er.java.PendingException();
		loggedDashBoard.assertText("Your Account Has Been Created!");
	}

	@Then("The User should  see a success message containing {string}")
	public void the_user_should_see_a_success_message_containing(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		loggedDashBoard.assertText(string);
	}



}
