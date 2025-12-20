package locatorsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocator_abovebelow {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/");

		WebElement username= driver.findElement(By.id("user-name"));
		WebElement password= driver.findElement(By.id("password"));
		
		//Give username using relative locator of password(above()) method
		driver.findElement(RelativeLocator.with(By.tagName("input")).above(password))
						.sendKeys("standard_user");
		
		//Give password using relative locator of username(below()) method
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(username))
		.sendKeys("secret_sauce");
		
		//Click on login button using password
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(password)).click();

		System.out.println(driver.getTitle());
		driver.close();
	}

}
