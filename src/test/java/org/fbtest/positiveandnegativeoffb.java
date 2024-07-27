package org.fbtest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class positiveandnegativeoffb extends BaseClassCopy{
	
	FbloginPojo f; 
	
	@Given("To Launch the browser and maximise window")
	public void to_Launch_the_browser_and_maximise_window() {
		launchBrowser();
		windowMaximize();
	   
	}

	@When("To launch the url of the facebook application")
	public void to_launch_the_url_of_the_facebook_application() {
		launchUrl("https://en-gb.facebook.com/");
	   
	}

	@When("To pass the valid user name in email field")
	public void to_pass_the_valid_user_name_in_email_field() {
		f = new FbloginPojo();
		passtext("softwareTesting@gmail.com", f.getEmail());
	    
	}

	@When("To pass the invalid password in password field")
	public void to_pass_the_invalid_password_in_password_field() {
		f = new FbloginPojo();
		passtext("password@123", f.getPassword());
	    
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
		f = new FbloginPojo();
		clickBtn(f.getLogin());
	    
	}

	@When("To check wheather navigate to home page or not")
	public void to_check_wheather_navigate_to_home_page_or_not() {
		System.out.println("All passed");
	    
	}

	@Then("To close the Browser")
	public void to_close_the_Browser() {
	    closeEntireBrowser();
	}

}
