package Stepdefs;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.ConfigReader;
import utils.DriverFactory;
import utils.ScreenshotUtil;

public class Hooks {
	private WebDriver driver;

    @Before
    public void setUp() {
        driver = DriverFactory.getDriver();
        driver.manage().window().maximize();
        driver.get(ConfigReader.getProperty("baseUrl"));
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            ScreenshotUtil.takeScreenshot(driver, scenario.getName().replaceAll(" ", "_"));
        }
        DriverFactory.safeQuit();
    }


	}


	
	
	
	

