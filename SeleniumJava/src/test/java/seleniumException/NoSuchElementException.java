package seleniumException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoSuchElementException {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://academy.swaroopnadella.com/");
		
		//NoSuchElementException - Invalid locator 
		String text = driver.findElement(By.tagName("display")).getText();
		System.out.println(text);
		
		driver.quit();
		

	}

}
