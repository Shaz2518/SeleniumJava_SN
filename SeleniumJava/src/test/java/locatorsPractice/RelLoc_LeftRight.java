package locatorsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelLoc_LeftRight {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		WebElement Mobile = driver.findElement(By.linkText("Mobiles"));
		
		
		//Click left element of fashion Locator (toLeftOf())
		//driver.findElement(RelativeLocator.with(By.tagName("a")).toLeftOf(Mobile)).click();
		
		//Click Right element of fashion locator (toRightOf())
		driver.findElement(RelativeLocator.with(By.tagName("a")).toRightOf(Mobile)).click();
		
		

	}

}
