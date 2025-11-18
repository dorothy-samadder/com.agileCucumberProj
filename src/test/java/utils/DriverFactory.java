package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	//This class manages the lifecycle of your driver.
	
	private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            // You can parameterize browser choice here
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
	
	

    public static void safeQuit() {
        try {
            if (driver != null) {
                driver.quit();
                driver = null; // Reset for next test run
            }
        } catch (Exception e) {
            System.out.println("Driver quit failed: " + e.getMessage());
        }
    }


	
	
	
	
	
	
	
	
	
	
	

}
