package Stepdefs;

import org.openqa.selenium.WebDriver;

import com.agileCucumberobjs.EnrollPageObjs;
import com.agileCucumberobjs.HomePageObjs;
import com.agileCucumberobjs.SignupPageObjs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.DriverFactory;

public class EnrollStepDefs {

	private HomePageObjs home;
	private EnrollPageObjs enroll;

	public EnrollStepDefs() {
		WebDriver driver = DriverFactory.getDriver();
		home = new HomePageObjs(driver);
		enroll = new EnrollPageObjs(driver);
	}


@When("I click Enroll Now on Home page")
public void i_click_enroll_now_on_home_page() {
	home.clickEnroll();
    
}

@When("I navigate to Enroll page")
public void i_navigate_to_enroll_page() {
    enroll.PrintTitleofPage();
}

@Then("I verify the page title is {string}")
public void i_verify_the_page_title_is(String string) {
    enroll.validpagetitle("Sign Up- Agile1Tech");
}

@Then("the Course Enrollment Form is displayed")
public void the_course_enrollment_form_is_displayed() {
	enroll.isDisplayed(enroll.formTitle());
}

@Given("I am on Enroll page")
public void i_am_on_enroll_page() {
   
}

@When("I enter First Name")
public void i_enter_first_name() {
    enroll.FirstName();
}

@When("I enter Last Name")
public void i_enter_last_name() {
    enroll.LastName();
}

@When("I enter Phone Number")
public void i_enter_phone_number() {
    
}

@When("I enter Street Address")
public void i_enter_street_address() {
    enroll.Street();
}

@When("I enter City")
public void i_enter_city() {
	enroll.City();
    
}

@When("I enter State")
public void i_enter_state() {
	enroll.State();
    
}

@When("I enter Postal Code")
public void i_enter_postal_code() {
    enroll.PostalCode();
}

@When("I select Country")
public void i_select_country() {
    BasePage.selectDropdown(enroll.County(), 7);
}

@When("I enter Email")
public void i_enter_email() {
	enroll.Email();
   
}

@When("I enter Password")
public void i_enter_password() {
	enroll.Password();
    
}

@When("I enter Confirm Password")
public void i_enter_confirm_password() {
	enroll.ConPassword();
  
}

@When("I select Course")
public void i_select_course() {
	BasePage.selectDropdown(enroll.Course(), 2);
   
}

@When("I select Terms & Conditions checkbox")
public void i_select_terms_conditions_checkbox() {
	enroll.selecttermsCheckbox();
   
}

@When("I click on Enroll Now button")
public void i_click_on_enroll_now_button() {
    enroll.EnrollNow().click();
}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
