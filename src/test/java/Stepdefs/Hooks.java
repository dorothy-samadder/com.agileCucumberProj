package Stepdefs;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.ConfigReader;
import utils.DriverFactory;

public class Hooks {

	@Before
	public void setUp() {
		
		//String env = System.getProperty("env", "qa"); // for different environment default = qa
	   // ConfigReader.loadConfig(env);
	    
        WebDriver driver = DriverFactory.getDriver();
        driver.manage().window().maximize();

        //Read base URL from config file
        driver.get(ConfigReader.getProperty("baseUrl"));
    }
    @After
    public void tearDown() {
        DriverFactory.quitDriver(); // closes driver
    }
	
	
	
	
}
