package checkBoxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class MultipleCheckBox {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		
		List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(WebElement chk : checkBoxes)
		{
			if(!chk.isSelected())
			chk.click();
			System.out.println(chk.isSelected());
			chk.click();
			System.out.println(chk.isSelected());
		}
		driver.quit();
		
		

	}

}
