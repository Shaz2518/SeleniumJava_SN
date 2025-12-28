package screenShotCapture;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FullWebPage_SS {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");

		// Reference obj variable for TakesScreenshot interface
		TakesScreenshot ss = (TakesScreenshot) driver;

		// Source File-- Screenshot
		File sourceFile = ss.getScreenshotAs(OutputType.FILE);

		// Target File-- Screenshot Stored
		// Approach 1
		// File targetFile = new
		// File("C:\\Users\\localadminuser\\Documents\\SeleniumJava_SN\\SeleniumJava\\Screenshots\\FullWebPage.png");

		// Approach 2
		File targetFile = new File(System.getProperty("user.dir"), "Screenshots\\FullWebPageNew.png");

		// Link source and target
		sourceFile.renameTo(targetFile);
	}

}
