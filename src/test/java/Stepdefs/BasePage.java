package Stepdefs;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public abstract class BasePage {
	protected WebDriver driver;
	private WebDriverWait wait;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}

	
	public void waitClick(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	}


	public String getPageTitle() {
		return driver.getTitle();

	}
	public void PrintTitleofPage() {
		String getTitle = driver.getTitle();
		System.out.println(getTitle);
	}

	public void validpagetitle(String pagetitle) {
		String ExpectedTitle = pagetitle;
		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		PrintTitleofPage();

	}
	
	public void insertData(WebElement element, String text) {
		wait.until(ExpectedConditions.visibilityOf(element));
		element.clear();
		element.sendKeys(text);
	}

	
	// ✅ Utility: Check element visibility
	public boolean isDisplayed(WebElement element) {
		try {
			return wait.until(ExpectedConditions.visibilityOf(element)).isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	public static void clearfields(WebElement e) {
		e.clear();
	}

	

	public static void selectDropdown(WebElement e, int index) {
		Select sel = new Select(e);
		sel.selectByIndex(index);
	}

	public void SelectCheckbox(WebElement f) {
		wait.until(ExpectedConditions.elementToBeClickable(f));
		if (!f.isSelected()) {
			f.click();
		}
	}
	public void waitAndClick(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	
}
