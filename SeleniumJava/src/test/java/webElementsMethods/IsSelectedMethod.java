package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class IsSelectedMethod {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://swaroopnadella.blogspot.com/");
		
		WebElement checkBox = driver.findElement(By.xpath("//input[@value='Coding']"));
			
		System.out.println("Checkbox Selected: " + checkBox.isSelected());
		checkBox.click();
		System.out.println("Checkbox Selected: " + checkBox.isSelected());
		
		driver.close();

	}

}
