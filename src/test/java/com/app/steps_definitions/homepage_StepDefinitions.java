package com.app.steps_definitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.app.pages.Homepage;
import com.app.utilities.BrowserUtils;
import com.app.utilities.ConfigurationReader;
import com.app.utilities.Driver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class homepage_StepDefinitions {

	Homepage homepage = new Homepage();
	@When("^I open homepage of Google and open the creating gmail page$")
	public void i_open_homepage_of_Google_and_open_the_creating_gmail_page() {
		Driver.getDriver().get(ConfigurationReader.getProperty("url"));
		homepage.gmail.click();
		homepage.createAnAccount.click();	
		BrowserUtils.switchToWindow("Create your Google Account");
	}
	@Then("^I filed Up firstname \"([^\"]*)\" and lastName \"([^\"]*)\"$")
	public void i_filed_Up_firstname_and_lastName(String FirstName,String LastName) {
	}
	@Then("^I generate a user name$")
	public void i_generate_a_user_name() {
	}
	@Then("^I generate a  \"([^\"]*)\"  after then same as confimation$")
	public void i_generate_a_after_then_same_as_confimation(String Password) {
	}
	@Then("^I Click the Next$")
	public void i_Click_the_Next() {
	}
	@Then("^I send a email \"([^\"]*)\"$")
	public void i_send_a_email(String Password) {
	}
}
