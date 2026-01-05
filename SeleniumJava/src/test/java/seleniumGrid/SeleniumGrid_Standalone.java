package seleniumGrid;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGrid_Standalone {

	public static void main(String[] args) throws URISyntaxException, MalformedURLException {
		
		//Create URL for Selenium Grid Server
		URI gridURI = new URI("http://localhost:4444/");
		URL gridURL = gridURI.toURL();
		
		//Create respective browser Option
		ChromeOptions option = new ChromeOptions();
		
		//Create driver object and pass URL and browser option as a parameter
		WebDriver driver = new RemoteWebDriver(gridURL,option);
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		driver.quit();
		
		

	}

}
