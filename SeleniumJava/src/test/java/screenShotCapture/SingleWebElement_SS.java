package screenShotCapture;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SingleWebElement_SS {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement text = driver.findElement(By.xpath("//h1[@class='title']"));
		
		File source = text.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir"), "Screenshots\\text.jpeg");
		
		source.renameTo(target);
		driver.quit();

	}

}
