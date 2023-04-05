package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Cart {
public POM_Cart(WebDriver driver) {
	PageFactory.initElements( driver,this);
		
	}
	
	

	@FindBy(xpath = "//button[@data-toggle='modal']")
	private WebElement Placeorder;
	
	@FindBy(xpath = "//input[@id='name']")
	private WebElement name;
	
	@FindBy(xpath = "//input[@id='country']")
	private WebElement country;
	
	@FindBy(xpath = "//input[@id='city']")
	private WebElement City; 
	
	@FindBy(xpath = "//input[@id='card']")
	private WebElement creditcard;
	
	@FindBy(xpath = "//input[@id='month']")
	private WebElement month;
	
	@FindBy(xpath = "//input[@id='year']")
	private WebElement year;
	
	@FindBy(xpath = "//button[text()='Purchase']")
	private WebElement purchase;
	
	
	@FindBy(xpath = "//button[@tabindex='1']")
	private WebElement OKafterpurchaseconfirm;
	
	
	@FindBy(xpath = "//a[@id='logout2']")
	private WebElement Logout;
	@FindBy(xpath = "//div[@class='sweet-alert  showSweetAlert visible' ]/h2")
	private WebElement verifytext;

	public WebElement getVerifytext() {
		return verifytext;
	}

	


	public WebElement getPlaceorder() {
		return Placeorder;
	}


	public WebElement getName() {
		return name;
	}


	public WebElement getCountry() {
		return country;
	}


	public WebElement getCity() {
		return City;
	}


	public WebElement getCreditcard() {
		return creditcard;
	}


	public WebElement getMonth() {
		return month;
	}


	public WebElement getYear() {
		return year;
	}


	public WebElement getPurchase() {
		return purchase;
	}


	public WebElement getOKafterpurchaseconfirm() {
		return OKafterpurchaseconfirm;
	}


	public WebElement getLogout() {
		return Logout;
	}
}
