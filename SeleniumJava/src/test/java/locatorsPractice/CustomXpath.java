package locatorsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CustomXpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.myvi.in/prepaid/online-mobile-recharge");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='349']/parent::span/following-sibling::div/button")).click();
	}

}
