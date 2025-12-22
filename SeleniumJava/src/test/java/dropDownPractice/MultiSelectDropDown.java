package dropDownPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDown {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='colors']"));
		Select options = new Select(dropDown);
		options.selectByIndex(1);
		options.selectByVisibleText("White");
		options.selectByValue("yellow");
		
		List<WebElement> optionList = options.getAllSelectedOptions();
		options.deselectAll();
		for(WebElement ele : optionList)
		{
			System.out.println(ele.getText());
		}
		driver.quit();
		
		
		

	}

}
