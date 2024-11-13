package util;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ScreenshotUtil {

	public static void takeScreenshot(WebDriver driver, String screenshotName) {
		// Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot = (TakesScreenshot) driver;

		// Call getScreenshotAs method to create image file
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);

		// Ensure the screenshots directory exists
		File destDir = new File("screenshots");
		if (!destDir.exists()) {
			destDir.mkdirs();
		}

		// Move image file to new destination
		File destFile = new File(destDir, screenshotName + ".png");

		try {
			// Copy file at destination
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			System.err.println("Failed to save screenshot: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
