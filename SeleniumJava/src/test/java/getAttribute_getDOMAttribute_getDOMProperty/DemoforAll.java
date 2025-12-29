package getAttribute_getDOMAttribute_getDOMProperty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoforAll {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement locator = driver.findElement(By.id("name"));
		
		//Attribute exists - Property null
		System.out.println(locator.getAttribute("class"));
		System.out.println(locator.getDomAttribute("class"));
		System.out.println(locator.getDomProperty("class"));
		System.out.println("=======");
		
		//Attribute null - Property exists
		System.out.println(locator.getAttribute("value"));
		System.out.println(locator.getDomAttribute("value"));
		System.out.println(locator.getDomProperty("value"));
		System.out.println("=======");
		
		//Add text both attribute and property exists
		locator.sendKeys("Happy");
		System.out.println(locator.getAttribute("value"));
		System.out.println(locator.getDomAttribute("value"));
		System.out.println(locator.getDomProperty("value"));
		
		driver.quit();
	}

}
