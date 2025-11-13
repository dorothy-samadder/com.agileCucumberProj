package com.agileCucumberobjs;

import java.security.PublicKey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class BaseObjects { // not used in this project 

	WebDriver driver;

	public static void Insertdata(WebElement e, String data) { // in place of WebElement lastor firstname use e,
		// for locator use by, and inseted entering
		// "data" use data
		e.clear();// use locator
		e.sendKeys(data);

	}

	public static void selectCheckbox(WebElement f, By locator) {
		if (!f.isSelected()) {
			f.click();
		}
	}

	public static void Dropdown(WebElement e, int index) {
		Select sel = new Select(e);
		sel.selectByIndex(index);
	}
	
	
	

}
