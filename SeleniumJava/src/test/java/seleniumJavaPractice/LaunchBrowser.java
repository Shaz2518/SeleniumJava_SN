package seleniumJavaPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");

		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("Site Title: " + title);
	}

}
