package browserWindowHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CurrentWindowHandle {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");

		String currentWindow = driver.getWindowHandle();
		System.out.println(currentWindow);
		driver.close();
	}

}
