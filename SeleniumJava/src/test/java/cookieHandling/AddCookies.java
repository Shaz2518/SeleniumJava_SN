package cookieHandling;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddCookies {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		//Create Cookie Object 
		Cookie cookie1 = new Cookie("Cookie1", "ThisIsTestCookie_1");
		Cookie cookie2 = new Cookie ("Cookie2", "ThisIsTestCookie_2");
		
		//Add Cookie to browser
		driver.manage().addCookie(cookie1);
		driver.manage().addCookie(cookie2);
		
		Set<Cookie> newCookie = driver.manage().getCookies();
		for(Cookie cook : newCookie)
		{
			System.out.println(cook);
		}
		
		driver.quit();
		

	}

}
