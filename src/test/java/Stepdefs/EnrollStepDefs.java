package Stepdefs;

import org.openqa.selenium.WebDriver;

import com.agileCucumberobjs.EnrollPageObjs;
import com.agileCucumberobjs.HomePageObjs;
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

	@Then("I verify the page title is {string}")
	public void i_verify_the_page_title_is(String string) {
		enroll.validpagetitle("Sign Up- Agile1Tech");
		enroll.PrintTitleofPage();
	}

	@Then("the Course Enrollment Form is displayed")
	public void the_course_enrollment_form_is_displayed() {
		enroll.isDisplayed(enroll.formTitle());
	}

	@Given("I am on Enroll page")
	public void i_am_on_enroll_page() {

	}

	
	
	  @When("I enter FirstName") public void i_enter_first_name() {
	  
	  }
	  
	  @When("I enter LastName") public void i_enter_last_name() {
	  
	  }
	  
	  @When("I enter PhoneNumber") public void i_enter_phone_number() {
	  
	  }
	  
	  @When("I enter StreetAddress") public void i_enter_street_address() {
	  
	  }
	  
	  @When("I enter City") public void i_enter_city() {
	  
	  }
	  
	  @When("I enter State") public void i_enter_state() {
	  
	  }
	  
	  @When("I enter PostalCode") public void i_enter_postal_code() {
	  
	  }
	  
	  @When("I select Country") public void i_select_country() {
	  
	  
	  }
	  
	  @When("I enter enrollemail") public void i_enter_enrollemail() {
	  
	  }
	  
	  @When("I enter enrollpassword") public void i_enter_enrollpassword() {
	  
	  }
	  
	  @When("I enter confirmpassword") public void i_enter_confirmpassword() {
	  
	  }
	  
	  @When("I select Course") public void i_select_course() {
	  enroll.selectCourse(4);
	  
	  }
	 

	

	@When("I enter {string} as First Name")
	public void i_enter_as_first_name(String FirstName) {
		enroll.enterFirstName(FirstName);

	}

	@When("I enter {string} as Last Name")
	public void i_enter_as_last_name(String LastName) {
		enroll.enterLasttName(LastName);

	}

	@When("I enter {string} as Phone Number")
	public void i_enter_as_phone_number(String PhoneNumber) {
		enroll.enterPhone(PhoneNumber);

	}

	@When("I enter {string} as Street Address")
	public void i_enter_as_street_address(String StreetAddress) {
		enroll.enterStreet(StreetAddress);

	}

	@When("I enter {string} as City")
	public void i_enter_as_city(String City) {
		enroll.enterCity(City);

	}

	@When("I enter {string} as State")
	public void i_enter_as_state(String State) {
		enroll.enterState(State);

	}

	@When("I enter {string} as Postal Code")
	public void i_enter_as_postal_code(String PostalCode) {
		enroll.enterPostalCd(PostalCode);

	}

	@When("I select country at index {int}")
	public void i_select_country_by_index(int CountryIndex) {
	    enroll.selectCounty(CountryIndex);
	}



	@When("I enter {string} as Email")
	public void i_enter_as_email(String enrollemail) {
		enroll.enteremail(enrollemail);

	}

	@When("I enter {string} as Password")
	public void i_enter_as_password(String enrollpassword) {
		enroll.enterpassword(enrollpassword);

	}

	@When("I enter {string} as Confirm Password")
	public void i_enter_as_confirm_password(String confirmpassword) {
		enroll.enterConPassword(confirmpassword);
		

	}
	
	@When("I select Course at index {int}")
	public void i_select_course_by_index(int CourseIndex) {
	    enroll.selectCourse(CourseIndex);
	}
	
	@When("I select Terms & Conditions checkbox")
	public void i_select_terms_conditions_checkbox() {
          enroll.selecttermCheckbox();
         
	}

	@When("I click on Enroll Now button")
	public void i_click_on_enroll_now_button() {
		enroll.EnrollNow().click();

	}

}
