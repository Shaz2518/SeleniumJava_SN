package seleniumJavaPractice;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserLaunch {

	public static void main(String[] args) {
		System.out.println("Enter Browser name:" + "\nChrome" + "\nEdge" + "\nFirefox");
		Scanner scr = new Scanner(System.in);
		String browser = scr.nextLine();

		WebDriver driver;

		switch (browser) {

		case "Chrome":
			driver = new ChromeDriver();
			break;

		case "Edge":
			driver = new EdgeDriver();
			break;

		case "Firefox":
			driver = new FirefoxDriver();
			break;

		default:
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println("Browser name: " + browser);
		System.out.println("Title: " + title);

		scr.close();
		driver.close();

	}

}
