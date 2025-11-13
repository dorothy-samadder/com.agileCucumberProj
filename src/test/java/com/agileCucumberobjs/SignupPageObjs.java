package com.agileCucumberobjs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Stepdefs.BasePage;

public class SignupPageObjs extends BasePage {

	
	private static By txtEmailby = By.xpath("//input[@name='email']");
	private static  By  txtpassworby = By.xpath("//input[@name='password']");
	private static By buttonloginby = By.xpath("//button[@type='submit']");
	private static By errorMSGby = By.xpath("//div[@role='alert']");
	
	public SignupPageObjs(WebDriver driver) {
        super(driver);
	}

	public WebElement txtEmail() {
		return driver.findElement(txtEmailby);
	}
	

	public WebElement password() {
		return driver.findElement(txtpassworby);
	}
	
	public WebElement buttonLogin() {
		return driver.findElement(buttonloginby);
		
	}
	
	public WebElement errorMSGDisplay() {
		return driver.findElement(errorMSGby);
		
	}
}
