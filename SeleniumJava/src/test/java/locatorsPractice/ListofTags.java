package locatorsPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ListofTags {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		
		List<WebElement> elements = driver.findElements(By.xpath("//meta"));
		System.out.println(elements.size());
		Thread.sleep(5000);
		for(WebElement ele : elements)
		{
			
			System.out.println(ele.getText());
		}
		
		driver.close();
		
	}

}
