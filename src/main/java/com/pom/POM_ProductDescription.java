package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_ProductDescription {
	
	@FindBy(xpath = "//a[@onclick='addToCart(2)']")
	private WebElement Addtocart;

	public POM_ProductDescription(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}

	public WebElement getAddtocart() {
		return Addtocart;
	}
	
	
	

	@FindBy(xpath = "//*[@id=\"tbodyid\"]/tr/td[2]")
	private WebElement Verifytext;

	public WebElement getVerifytext() {
		return Verifytext;
	}
}
