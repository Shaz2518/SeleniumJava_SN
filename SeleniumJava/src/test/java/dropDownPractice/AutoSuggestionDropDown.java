package dropDownPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AutoSuggestionDropDown {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("selenium Java");
		
		List<WebElement> options = driver.findElements(By.xpath("//ul[@role='listbox']/li//div[@role='option']"));
		for(WebElement op : options)
		{
			String str =op.getText().toLowerCase();
			if(str.equals("selenium Java"));
			{op.click();}
			//System.out.println(op.getText());
		}
		
		//driver.quit();

	}

}
