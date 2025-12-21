package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class IsEnabledMethod {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		WebElement loginBtn = driver.findElement(By.id("user-name"));
		boolean login = loginBtn.isEnabled();
		System.out.println(login);
		
		driver.close();
		

	}

}
