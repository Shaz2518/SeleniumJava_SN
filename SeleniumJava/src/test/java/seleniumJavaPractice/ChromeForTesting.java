package seleniumJavaPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeForTesting {

	public static void main(String[] args) {
		//Chrome Browser present in machine
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com");
//		
		//Chrome browser is present- but test on stable version
		ChromeOptions options = new ChromeOptions();
		options.setBrowserVersion("canary");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");

	}

}
