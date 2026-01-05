package seleniumGrid;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DifferentBrowserLaunch {

	public static void main(String[] args) throws URISyntaxException, MalformedURLException {

		System.out.println("Enter browser name: ");
		Scanner scr = new Scanner(System.in);
		String browser = scr.nextLine();

		switch (browser.toLowerCase()) {
		case "chrome":
			chromeBrowser();
			System.out.println("Browser Used: " + browser);
			break;

		case "edge":
			edgeBrowser();
			System.out.println("Browser Used: " + browser);
			break;

		case "firefox":
			firefoxBrowser();
			System.out.println("Browser Used: " + browser);
			break;

		default:
			chromeBrowser();
			System.out.println("Default Browser Used: Chrome" );
			break;

		}
		scr.close();

	}

	public static void chromeBrowser() throws URISyntaxException, MalformedURLException {
		// Create URL
		URI gridURI = new URI("http://localhost:4444/");
		URL gridURL = gridURI.toURL();

		ChromeOptions option = new ChromeOptions();
		WebDriver driver = new RemoteWebDriver(gridURL, option);
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());

	}

	public static void edgeBrowser() throws URISyntaxException, MalformedURLException {

		// Create URL
		URI gridURI = new URI("http://localhost:4444/");
		URL gridURL = gridURI.toURL();
		EdgeOptions option = new EdgeOptions();

		WebDriver driver = new RemoteWebDriver(gridURL, option);
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
	}

	public static void firefoxBrowser() throws URISyntaxException, MalformedURLException {
		// Create URL
		URI gridURI = new URI("http://localhost:4444/");
		URL gridURL = gridURI.toURL();
		FirefoxOptions option = new FirefoxOptions();
		WebDriver driver = new RemoteWebDriver(gridURL, option);
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
	}

}
