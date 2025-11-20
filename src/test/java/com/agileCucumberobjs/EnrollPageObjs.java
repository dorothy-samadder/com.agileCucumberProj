package com.agileCucumberobjs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Stepdefs.BasePage;

public class EnrollPageObjs extends BasePage {

	private static By FormTitleby = By.xpath("//h2[text()='Course Enrollment Form']");
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
	private static By termsCheckboxby = By.xpath("//input[@id='t&c']\r\n");
	private static By EnroolButtonby = By.xpath("//button[@class='btn btn-primary' and text()='Enroll Now']");
	private WebDriverWait wait;

	public EnrollPageObjs(WebDriver driver) {
		super(driver);
	}

	// Insertdata methode from baseobject class

	public WebElement formTitle() {
		return driver.findElement(FormTitleby);

	}

	public WebElement FirstName() {
		return driver.findElement(InsertFirstNameby);// use locator
	}
	
	  public void enterFirstName(String value) {
	        FirstName().sendKeys(value);
	    }


	public WebElement LastName() {
		return driver.findElement(InsertLastNameby);// use locator
		
	}
	
	  public void enterLasttName(String value) {
	        LastName().sendKeys(value);
	    }


	public WebElement Phone() {

		return driver.findElement(InsertPhoneby);
		
	}
	
	  public void enterPhone(String value) {
	        Phone().sendKeys(value);
	    }



	public WebElement Street() {
		return driver.findElement(InsertStreetby);
		
	}

	public void enterStreet(String value) {
        Street().sendKeys(value);
    }

	public WebElement City() {
		return driver.findElement(InsertCityby);

	}
	
	public void enterCity(String value) {
        City().sendKeys(value);
    }

	public WebElement State() {
		return driver.findElement(InsertStateby);
		// state.sendKeys("VA");
	}
	
	public void enterState(String value) {
        State().sendKeys(value);
    }

	public WebElement PostalCode() {
		return driver.findElement(InsertPostalcodeby);
		// postalcode.sendKeys("55555");

	}
	
	public void enterPostalCd(String value) {
        PostalCode().sendKeys(value);
    }

	public WebElement County() {
		return driver.findElement(InsertCountryby);

	}

	public void selectCounty(int value) {
		selectDropdown(County(), value);
	}

	public WebElement Course() {
		WebElement course = driver.findElement(InsertCourseby);// use this select methode to use dropdown
		return course;

	}
	
	public void selectCourse(int value) {
		BasePage.selectDropdown(Course(), value);
	}

	public void waitfew() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
	}

	public WebElement Email() {
		return driver.findElement(InsertEmailby);
		// email.sendKeys("abc@efg.com");

	}
	
	public void enteremail(String value) {
        Email().sendKeys(value);
    }

	public WebElement Password() {
		return driver.findElement(InsertPasswordby);

	}
	
	public void enterpassword(String value) {
		Password().sendKeys(value);
	}

	public WebElement ConPassword() {
		return driver.findElement(InsertConPaswordby);


	}
	
	public void enterConPassword(String value) {
        ConPassword().sendKeys(value);
    }

	public WebElement termsCheckbox() {
		return driver.findElement(termsCheckboxby);
		
	}
	
	public void selecttermCheckbox() {
		waitAndClick(driver, termsCheckbox());
	}
	


	public WebElement EnrollNow() {
		return driver.findElement(EnroolButtonby);
	}

}
