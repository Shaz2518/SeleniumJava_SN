package locatorsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelLoc_near {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		WebElement bestSeller = driver.findElement(By.linkText("Bestsellers"));
		
		//Click on drop down menu near bestseller
		driver.findElement(RelativeLocator.with(By.tagName("select")).near(bestSeller)).click();
		

	}

}
