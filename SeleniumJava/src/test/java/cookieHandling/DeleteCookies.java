package cookieHandling;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteCookies {

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
		System.out.println(newCookie.size());
		for(Cookie cook : newCookie)
		{
			System.out.println(cook);
		}
		System.out.println("=================");
		
		//Delete Cookie by Object
		driver.manage().deleteCookie(cookie2);
		Set<Cookie> deleteCookie = driver.manage().getCookies();
		System.out.println(deleteCookie.size());
		for(Cookie co : deleteCookie)
		{
			
			System.out.println(co);
		}
		System.out.println("=================");
		
		//Delete cookie by Name
		driver.manage().deleteCookieNamed("NID");
		Set<Cookie> deleteCookieNamed = driver.manage().getCookies();
		System.out.println(deleteCookieNamed.size());
		for(Cookie co : deleteCookieNamed)
		{
			
			System.out.println(co);
		}
		System.out.println("=================");
		
		//Delete All Cookies
		driver.manage().deleteAllCookies();
		Set<Cookie> deleteAllCookie = driver.manage().getCookies();
		System.out.println(deleteAllCookie.size());
		for(Cookie co : deleteAllCookie)
		{
			
			System.out.println(co);
		}
		
		
		driver.quit();

	}

}
