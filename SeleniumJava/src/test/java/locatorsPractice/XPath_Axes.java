package locatorsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XPath_Axes {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.xpath("//input[@id='user-name']/parent::div")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']/ancestor::div[1]")).sendKeys("secret_sauce");
		
		driver.findElement(By.xpath("//*[@value='Login']")).click();

	}

}
