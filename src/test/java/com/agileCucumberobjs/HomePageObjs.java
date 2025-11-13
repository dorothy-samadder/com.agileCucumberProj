package com.agileCucumberobjs;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Stepdefs.BasePage;

public class HomePageObjs extends BasePage{
	
	//locator
	private By lnkEnrollby = By.xpath("//*[@id=\"navbarCollapse\"]/a[2]");
	private By lnkSignupby = By.xpath("//a[contains(text(),'Sign In')]");
	
	
	// Constructor: pass driver to BasePage
    public HomePageObjs(WebDriver driver) {
        super(driver);
    }
    



	public WebElement Enroll() {
		return driver.findElement(lnkEnrollby);

	}

	public void clickEnroll() {
		Enroll().click();

	}

	public WebElement SignIn() {
		return driver.findElement(lnkSignupby);

	}

	
	public void clickSignin() { 
		SignIn().click(); 
		
	}

}