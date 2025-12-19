package locatorsPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class XPATH_Practice {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		
		//Single and Multi Attribute
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("problem_user");
		driver.findElement(By.xpath("//input[@type='password'][@name='password']")).sendKeys("secret_sauce");
	
		//Wild Card
		driver.findElement(By.xpath("//*[@value='Login']")).click();
//		String title = driver.getTitle();
//		System.out.println(title);
		
		//and/or operator
//		List<WebElement> cards = driver.findElements(By.xpath("//div[@class='inventory_item_description' and @data-test='inventory-item-description']"));
//		for(WebElement ele : cards)
//		{
//			System.out.println("=========");
//			String str = ele.getText();
//			System.out.println(str);
//		}
		
//		List<WebElement> cards = driver.findElements(By.xpath("//div[@class='inventory_item_description' or @data-test='inventory-item-description']"));
//		for(WebElement ele : cards)
//		{
//			System.out.println("=========");
//			String str = ele.getText();
//			System.out.println(str);
//		}
		
		//Method--> text(), contains(), starts-with()
		String str = driver.findElement(By.xpath("//div[text()='Swag Labs']")).getText();
		System.out.println(str);
		
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,'btn_secondary')]")).click();
		
		driver.findElement(By.xpath("//div[starts-with(@id,'shopping')]")).click();
		
		driver.close();
		
	}

}
