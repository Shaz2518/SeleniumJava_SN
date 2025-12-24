package locatorsPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocators_tagname {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		List<WebElement> list = driver.findElements(By.tagName("div"));
		for(WebElement x : list)
		{
			String divValue= x.getText();
			System.out.println(divValue);
			
		}
		driver.close();

		
	}

}
