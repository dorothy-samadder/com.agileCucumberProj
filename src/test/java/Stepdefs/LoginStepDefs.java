package Stepdefs;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.agileCucumberobjs.HomePageObjs;
import com.agileCucumberobjs.SignupPageObjs;

import io.cucumber.java.AfterAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.DriverFactory;

public class LoginStepDefs {

	private SignupPageObjs signin;
	private HomePageObjs home;

	public LoginStepDefs() {
		WebDriver driver = DriverFactory.getDriver();
		signin = new SignupPageObjs(driver);
		home = new HomePageObjs(driver);
	}

	// HomePageObjs home= new HomePageObjs(driver);
	// SignupPageObjs signin =new SignupPageObjs(driver);

	@Given("I am on Home page")
	public void i_am_on_Home_page() {
		home.PrintTitleofPage();
		home.clickSignin();

	}

	@When("I insert valid email")
	public void i_insert_valid_email() {

	}

	@When("I inset valid password")
	public void i_inset_valid_password() {

	}

	@When("I insert valid {string}")
	public void i_insert_valid(String email) {
		// signin = new SignupPageObjs(driver);
		signin.insertData(signin.txtEmail(), email);
	}

	@When("I inset valid {string}")
	public void i_inset_valid(String password) {// coming from data provider of login.feature
		signin.insertData(signin.password(), password);

	}

	@When("I click on login button")
	public void i_click_on_login_button() {
		signin.waitClick(signin.buttonLogin());

	}

	@Then("I should be navigated to the Login page.")
	public void i_should_be_navigated_to_the_login_page() {
		Assert.assertFalse(signin.errorMSGDisplay().isDisplayed());// error message is displayed should be false when
																	// valid user id password are entered.

	}


}
