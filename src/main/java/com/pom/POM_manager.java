package com.pom;

import org.openqa.selenium.WebDriver;

public class POM_manager {

	 public static WebDriver driver;
	 
	 private  POM_Home phome;
	 
	 private POM_ProductDescription productDesc;
	 private POM_Cart pcart;
	 
	 public POM_manager(WebDriver driver2) {
			this.driver = driver2;
		}
	 
	public POM_Home getPOM_Home() {
		 phome= new  POM_Home(driver);
		 return phome;
	}
	public POM_ProductDescription gePOM_ProductDescription() {
		productDesc= new POM_ProductDescription(driver);
		return productDesc;
	}
	public POM_Cart getPOM_Cart() {
		pcart= new POM_Cart(driver);
		return pcart;
	}
	
}
