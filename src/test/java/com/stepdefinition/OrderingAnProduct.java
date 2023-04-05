package com.stepdefinition;

import java.io.IOException;
import java.time.Duration;

import com.baseclass.BaseClass;
import com.helper.File_Reader;
import com.pom.POM_Cart;
import com.pom.POM_Home;
import com.pom.POM_ProductDescription;
import com.pom.POM_manager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderingAnProduct extends BaseClass {
	POM_manager pom = new POM_manager(driver);
	
	@Given("user enters the url")
	public void user_enters_the_url() throws IOException {
	   URL(File_Reader.getinstance().geturl());
	}

	@When("user clicks on signup button")
	public void user_clicks_on_signup_button() {
	   pom.getPOM_Home().getSignup().click();
	}

	@When("Enters his username and password")
	public void enters_his_and() throws IOException {
	   pom.getPOM_Home().getUsername().sendKeys(File_Reader.getinstance().getvalidusername());
	   pom.getPOM_Home().getPassword().sendKeys(File_Reader.getinstance().getvalidpassword());
	  
	}

	@When("clicks on signup")
	public void clicks_on_signup() throws InterruptedException {
		Thread.sleep(333);
		pom.getPOM_Home().getSIGNUPafterenteringdetails().click();
	   
	}

	@Then("an alert window opens mentioning signup successful")
	public void an_alert_window_opens_mentioning_signup_successful() throws InterruptedException {
		Thread.sleep(2222);
		confirm_alert();
		pom.getPOM_Home().getClose().click();
	 
	}

	

	@When("user enters his valid username and password")
	public void enters_his_valid_usrename_and_password() throws IOException {
	 pom.getPOM_Home().getLoginusernmae().sendKeys(File_Reader.getinstance().getvalidusername());
	 pom.getPOM_Home().getLoginpassword().sendKeys(File_Reader.getinstance().getvalidpassword());
	}

	@When("clicks on LOGIN button")
	public void clicks_on_login_button() {
		pom.getPOM_Home().getLOgin().click();
	}

	@Then("Welcome message with username is displayed")
	public void welcome_message_with_username_is_displayed() {
	    String text = pom.getPOM_Home().getWelcomeusername().getText();
	    boolean contains = text.toLowerCase().contains("welcome");
	    if(contains)
	    {
	    	System.out.println("Login success");
	    }
	    
	}

	@When("user clicks on NOkia lumia1520 phone")
	public void user_clicks_on_n_okia_lumia1520_phone() throws InterruptedException {
	  pom.getPOM_Home().getNokialumia1520().click();
	  Thread.sleep(4444);
	}

	@When("clicks on Addto cart button")
	public void clicks_on_addto_cart_button() {
	   pom.gePOM_ProductDescription().getAddtocart().click();
	    
	}

	@Then("product added alert pops up")
	public void product_added_alert_pops_up() {
	   confirm_alert();
	}

	@When("user cliks on cart icon")
	public void user_cliks_on_cart_icon() {
	  pom.getPOM_Home().getCart().click();
	}

	@When("verifies the products he added")
	public void verifies_the_products_he_added() {
	   String text = pom.gePOM_ProductDescription().getVerifytext().getText();
	   boolean contains = text.toLowerCase().contains("nokia");
	   if(contains)
	   {
		   System.out.println("yes the nokia phone i selected is in cart");
	   }
	}

	@When("clicks on placeorder")
	public void clicks_on_placeorder() {
	    pom.getPOM_Cart().getPlaceorder().click();
	}

	@When("user enters the {string} {string} {string} {string} {string} {string}")
	public void user_enters_the(String string, String string2, String string3, String string4, String string5, String string6) {
	    pom.getPOM_Cart().getName().sendKeys(string);
	    pom.getPOM_Cart().getCountry().sendKeys(string2);
	    pom.getPOM_Cart().getCity().sendKeys(string3);
	    pom.getPOM_Cart().getCreditcard().sendKeys(string4);
	    pom.getPOM_Cart().getMonth().sendKeys(string5);
	    pom.getPOM_Cart().getYear().sendKeys(string6);
	}

	@When("clicks on Purchase button")
	public void clicks_on_purchase_button() {
	  pom.getPOM_Cart().getPurchase().click();
	}

	@Then("Thank you for your purchase message is displayed")
	public void thank_you_for_your_purchase_message_is_displayed() {
	    boolean contains = pom.getPOM_Cart().getVerifytext().getText().toLowerCase().contains("thank you");
	    if(contains)
	    System.out.println("order successfully submitted");
	}

}
