package cookieHandling;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RetrieveAllCookies {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");

		// Get All Cookie
		Set<Cookie> allCookies = driver.manage().getCookies();
		for (Cookie co : allCookies) {
			System.out.println(co);
		}
		System.out.println("==================");
		
		//Get Cookie by Name
		Cookie cookieName = driver.manage().getCookieNamed("NID");
		System.out.println(cookieName);
		System.out.println("==================");
		
		//Get Cookie by Value
		Cookie cookieValue = driver.manage().getCookieNamed("NID");
		System.out.println(cookieValue.getValue());
		
		
		
		
		driver.quit();
	}

}
