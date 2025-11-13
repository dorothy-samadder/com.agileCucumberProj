package Stepdefs;

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
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	// ✅ Utility: Click with wait
	public void waitClick(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	}

	// ✅ Utility: Insert text
	public void insertData(WebElement element, String text) {
		wait.until(ExpectedConditions.visibilityOf(element));
		element.clear();
		element.sendKeys(text);
	}

	// ✅ Utility: Get page title
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

	public static void selectCheckbox(WebElement f) {
		if (!f.isSelected()) {
			f.click();
		}
	}

	public static void selectDropdown(WebElement e, int index) {
		Select sel = new Select(e);
		sel.selectByIndex(index);
	}

	public static void SelectCheckbox(WebElement f) {
		if (!f.isSelected()) {
			f.click();
		}
	}
}
