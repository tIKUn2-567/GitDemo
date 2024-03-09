package stepDefination;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {
	
	
	@Given("^user is on landing page$")
	public void  user_is_on_Netbanking_page() {
		//Code  to navigate to login url
		System.out.println("welcome to netbanking app");
	}
	@When("User login into application with username and password")
	public void User_login_into_application_with_username_and_password() {
		//code to login
		System.out.println("üser login to the application using username and password");
	}
	@Then("home page is populated")
	public void Home_page_is_populated() {
		//homepage validation
		System.out.println("welcome to homepage");
	}
	@And("cards are displayed")
	public void Cards_are_populated() {
		//validating the cards
		System.out.println("no of cards are populated");
	}

}
