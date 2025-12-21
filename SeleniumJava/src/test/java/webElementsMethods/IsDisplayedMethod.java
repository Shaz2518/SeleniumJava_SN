package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class IsDisplayedMethod {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://academy.swaroopnadella.com/");
		
		WebElement logo = driver.findElement(By.xpath("//*[@alt='logo']"));
		boolean logoValue =logo.isDisplayed();
		System.out.println(logoValue);
		
		WebElement name = driver.findElement(By.xpath("//h1[text()='Learn with Swaroop Nadella']"));
		boolean nameValue = name.isDisplayed();
		System.out.println(nameValue);
		
		driver.close();
		

	}

}
