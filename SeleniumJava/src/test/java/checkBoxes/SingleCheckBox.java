package checkBoxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SingleCheckBox {

	public static void main(String arg[]) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://swaroopnadella.blogspot.com/");
		
		WebElement checkBox = driver.findElement(By.xpath("//input[@value='Automation']"));
		checkBox.click();
		System.out.println(checkBox.isSelected());
		
		driver.quit();
	}
}
