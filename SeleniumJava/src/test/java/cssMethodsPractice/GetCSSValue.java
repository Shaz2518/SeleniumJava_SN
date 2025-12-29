package cssMethodsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCSSValue {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://academy.swaroopnadella.com/");

		WebElement button = driver.findElement(By.linkText("Join my community"));
		String bgColor = button.getCssValue("background-color");
		System.out.println(bgColor);
		

		driver.quit();
	}

}
