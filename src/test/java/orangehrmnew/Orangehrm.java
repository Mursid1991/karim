package orangehrmnew;

import java.time.Duration;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import orangeBase.Orange_base;

public class Orangehrm extends Orange_base {
	
	@Given("User verifies the url.")
	public void user_verifies_the_url() {
		getBrowser("chrome");
		//getUrl("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	}
}
	//private void getUrl(String string) {
		// TODO Auto-generated method stub
		
	//}

	//private void getBrowser(String string) {
		// TODO Auto-generated method stub
		
//	}
/*
	@When("User enters valid credintials")
	public void user_enters_valid_credintials() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("User need to enter the appropiate credentials")
	public void user_need_to_enter_the_appropiate_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User enteres the valid username in username field")
	public void user_enteres_the_valid_username_in_username_field() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Password in password field")
	public void password_in_password_field() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User clicks on login")
	public void user_clicks_on_login() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("User clicks on previous page mark")
	public void user_clicks_on_previous_page_mark() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on next page mark")
	public void user_clicks_on_next_page_mark() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User lands on to the request page")
	public void user_lands_on_to_the_request_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("User clickes on add employee button")
	public void user_clickes_on_add_employee_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on add employee button")
	public void user_clicks_on_add_employee_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User lands on to the request add employee page")
	public void user_lands_on_to_the_request_add_employee_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("User try to fill the employee name")
	public void user_try_to_fill_the_employee_name() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User enters the employee full name that is first name fully")
	public void user_enters_the_employee_full_name_that_is_first_name_fully() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Middle name")
	public void middle_name() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Last name fully in the prescribed name field")
	public void last_name_fully_in_the_prescribed_name_field() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("User enter the employee id in the given field")
	public void user_enter_the_employee_id_in_the_given_field() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User enteres the employee id")
	public void user_enteres_the_employee_id() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Application allows to enter the same")
	public void application_allows_to_enter_the_same() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("User clicks the create login Details tick box")
	public void user_clicks_the_create_login_details_tick_box() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User enters the valid username as mandatory field")
	public void user_enters_the_valid_username_as_mandatory_field() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User enters the valid passward and confirm passpord in the password field as mandatory field")
	public void user_enters_the_valid_passward_and_confirm_passpord_in_the_password_field_as_mandatory_field() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User select the status of employee")
	public void user_select_the_status_of_employee() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("User needs to click on save button")
	public void user_needs_to_click_on_save_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on save")
	public void user_clicks_on_save() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Employee details save succesfully")
	public void employee_details_save_succesfully() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
	*/