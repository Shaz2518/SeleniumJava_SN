package seleniumGrid;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HubAndNodeDemo {

	public static void main(String[] args) throws URISyntaxException, MalformedURLException {
		chromeBrowser();
		edgeBrowser();
		firefoxBrowser();

	}

	public static void chromeBrowser() throws URISyntaxException, MalformedURLException {
		// Create URL
		URI hubURI = new URI("http://localhost:4444/");
		URL hubURL = hubURI.toURL();

		ChromeOptions option = new ChromeOptions();
		WebDriver driver = new RemoteWebDriver(hubURL, option);
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());

	}

	public static void edgeBrowser() throws URISyntaxException, MalformedURLException {

		// Create URL
		URI hubURI = new URI("http://localhost:4444/");
		URL hubURL = hubURI.toURL();
		EdgeOptions option = new EdgeOptions();

		WebDriver driver = new RemoteWebDriver(hubURL, option);
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
	}

	public static void firefoxBrowser() throws URISyntaxException, MalformedURLException {
		// Create URL
		URI hubURI = new URI("http://localhost:4444/");
		URL hubURL = hubURI.toURL();
		FirefoxOptions option = new FirefoxOptions();
		WebDriver driver = new RemoteWebDriver(hubURL, option);
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
	}

}
