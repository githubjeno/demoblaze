package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Home {
	public POM_Home(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@id='signin2']")
	private WebElement signup;

	@FindBy(xpath = "//a[@id='login2']")
	private WebElement Login;

	@FindBy(xpath = "//button[@onclick='logIn()']")
	private WebElement LOgin;

	public WebElement getLOgin() {
		return LOgin;
	}

	@FindBy(xpath = "//input[@id='loginusername']")
	private WebElement loginusernmae;

	@FindBy(xpath = "//input[@id='loginpassword']")
	private WebElement loginpassword;

	public WebElement getLoginusernmae() {
		return loginusernmae;
	}

	public WebElement getLoginpassword() {
		return loginpassword;
	}

	@FindBy(xpath = "//a[@id='nameofuser']")
	private WebElement welcomeusername;

	public WebElement getWelcomeusername() {
		return welcomeusername;
	}

	@FindBy(xpath = "//a[@id='cartur']")
	private WebElement cart;

	@FindBy(xpath = "//a[text()='Nokia lumia 1520']")
	private WebElement Nokialumia1520;

	@FindBy(xpath = "//input[@id='sign-username']")
	private WebElement username;

	@FindBy(xpath = "//input[@id=\"sign-password\"]")
	private WebElement password;

	@FindBy(xpath = "(//button[text()='Close'])[2]")
	private WebElement close;

	public WebElement getClose() {
		return close;
	}

	

	@FindBy(xpath = "//button[text()='Sign up']")
	private WebElement SIGNUPafterenteringdetails;

	public WebElement getUsername() {
		return username;
	}

	public void setUsername(WebElement username) {
		this.username = username;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getSIGNUPafterenteringdetails() {
		return SIGNUPafterenteringdetails;
	}

	public WebElement getSignup() {
		return signup;
	}

	public WebElement getLogin() {
		return Login;
	}

	public WebElement getCart() {
		return cart;
	}

	public WebElement getNokialumia1520() {
		return Nokialumia1520;
	}

}
