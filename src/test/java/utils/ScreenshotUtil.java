package utils;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtil {

	public static void takeScreenshot(WebDriver driver, String fileName) {
        try {
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File dest = new File("screenshots/" + fileName + ".png");
            FileUtils.copyFile(src, dest);
            System.out.println("Screenshot saved: " + dest.getAbsolutePath());
        } catch (Exception e) {
            System.out.println("Failed to take screenshot: " + e.getMessage());
        }
    }


	
	
	
}
