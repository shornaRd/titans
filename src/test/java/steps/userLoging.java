package steps;

import org.testng.Assert;

import common.amazonBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.amazonHomepage;

public class userLoging extends amazonBase{
	
	amazonHomepage ap;
	

	@Given("i am on the amazon home page")
	public void i_am_on_the_amazon_home_page() {
		
		launchBrowser();

	}

	@When("i click on the sign in button in the homepage")
	public void i_click_on_the_sign_in_button_in_the_homepage() {
		ap = new amazonHomepage(driver);
		ap.clickOnsignButtonInHomepage();
	  
	}

	@When("i enter {string} in the email input bar")
	public void i_enter_in_the_email_input_bar(String string) {
		ap = new amazonHomepage(driver);
		ap.clickOnReturnOrders();
		
	
	}

	@When("i click on the continue button")
	public void i_click_on_the_continue_button() {
		ap = new amazonHomepage(driver);
		ap.Cart();
	  
	}

	@When("i enterd the {string}  in the password input bar")
	public void i_enterd_the_in_the_password_input_bar(String string) {
		ap = new amazonHomepage(driver);
		ap.AmazonBasics();
	
	}

	@When("i click on the sign in button")
	public void i_click_on_the_sign_in_button() {
		ap = new amazonHomepage(driver);
		ap.CustomerService();
	   
	}

	@Then("i loggin in to my account successfully")
	public void i_loggin_in_to_my_account_successfully() {
		
		
	
		Assert.assertTrue(ap.verifySearchResults());
			
			
			closeAll(); //class will be close the current browser
			quit(); // quit will close all the browser that has been open
		}

	private void quit() {
		// TODO Auto-generated method stub
		
	}

	}
	  
