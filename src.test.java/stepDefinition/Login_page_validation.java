package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageActions.Checkboxes;
import reusableComponents.BrowserInitiation;

public class Login_page_validation {
	
	
	
	@Given("^Open the url$")
	public void open_the_url() throws Throwable {
		BrowserInitiation.open_browser();
	}

	@Given("^Provide User name$")
	public void provide_User_name() throws Throwable {
		Checkboxes.checkbox_validation();
		BrowserInitiation.close_browser();
	}
	
}
