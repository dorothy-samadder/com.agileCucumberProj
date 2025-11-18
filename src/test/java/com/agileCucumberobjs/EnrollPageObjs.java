package com.agileCucumberobjs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Stepdefs.BasePage;

public class EnrollPageObjs extends BasePage{
	

	private static By FormTitleby= By.xpath("//h2[text()='Course Enrollment Form']");
	private static By InsertFirstNameby = (By.xpath("//input[@id='first_name']"));
	private static By InsertLastNameby = (By.xpath("//input[@id='last_name']"));
	private static By InsertPhoneby = (By.xpath("//input[@id='phone']"));
	private static By InsertStreetby = (By.xpath("//input[@id='street']"));
	private static By InsertCityby = (By.xpath("//input[@id='city']"));
	private static By InsertStateby = (By.xpath("//input[@id='state']"));
	private static By InsertPostalcodeby = (By.xpath("//input[@id='postalCode']"));
	private static By InsertCountryby = (By.xpath("//select[@id='country']"));
	private static By InsertEmailby = (By.xpath("//input[@name='email']"));
	private static By InsertPasswordby = (By.xpath("//input[@id='password']"));
	private static By InsertConPaswordby = (By.xpath("//input[@id='confirm_password']\r\n"));
	private static By InsertCourseby = (By.xpath("//select[@id='role']\r\n"));
	private static By termsCheckboxby = (By.id("t&c"));
	private static By EnroolButtonby= By.xpath("//button[@class='btn btn-primary' and text()='Enroll Now']");
	
	public EnrollPageObjs(WebDriver driver) {
        super(driver);
	}
	
	
	//Insertdata methode from baseobject class
	
	public WebElement formTitle() {
		return driver.findElement(FormTitleby);
	
	}

	public void FirstName() {
		WebElement FirstName = driver.findElement(InsertFirstNameby);// use locator
		insertData(FirstName, "john");
	}

	public void LastName() {
		WebElement LastName = driver.findElement(InsertLastNameby);// use locator
		insertData(LastName, "Smith");//Insertdata methode from baseobject class
		
	}

	public void Phone() {

		WebElement phone = driver.findElement(InsertPhoneby);
		insertData(phone, "9977777777");//Insertdata methode from baseobject class
	}

	public void Street() {
		WebElement street = driver.findElement(InsertStreetby);
		insertData(street, "333 test street");//Insertdata methode from baseobject class

	}
	
	//Or use Webelement.sendKeys methode to Insert data.

	public void City() {
		WebElement city = driver.findElement(InsertCityby);
		city.sendKeys("Alexandria");//Or use Webelement.sendKeys methode to Insert data.

	}

	public void State() {
		WebElement state = driver.findElement(InsertStateby);
		state.sendKeys("VA");
	}

	public void PostalCode() {
		WebElement postalcode = driver.findElement(InsertPostalcodeby);
		postalcode.sendKeys("55555");

	}

	public WebElement County() {
		return driver.findElement(InsertCountryby);
		
	}
	
	public void selectCounty() { 
		selectDropdown(County(), 3);
	}
	
	public WebElement Course() {
		WebElement course = driver.findElement(InsertCourseby);// use this select methode to use dropdown
		return course;
		
	}


	public void waitfew() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
	}

	public void Email() {
		WebElement email = driver.findElement(InsertEmailby);
		email.sendKeys("abc@efg.com");

	}

	public void Password() {
		WebElement password = driver.findElement(InsertPasswordby);
		password.clear();
		insertData(password,  "aaaaxxx");

	}

	public void ConPassword() {
		WebElement Conpassword = driver.findElement(InsertConPaswordby);
		Conpassword.clear();
		Conpassword.sendKeys("aaaaxxx");

	}

	
	public void selecttermsCheckbox() {
		WebElement checkbox = driver.findElement(termsCheckboxby);
		if (!checkbox.isSelected()) {
			checkbox.click();
		}
	}

	public WebElement EnrollNow(){
		return driver.findElement(EnroolButtonby);
	}

}
