package seleniumException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidSelectorException {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://academy.swaroopnadella.com/");
		
		//InvalidSelectorException - Incorrect Xpath/CSS Selector
		//driver.findElement(By.cssSelector("div..display"));
		driver.findElement(By.xpath("//div[@class='display]"));
		driver.quit();
		

	}

}
