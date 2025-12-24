package locatorsPractice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BasicLocator_LinkText {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		
//		List<WebElement> element = driver.findElements(By.className("navFooterVerticalRow"));
//		for(WebElement e : element)
//			{
//			System.out.println(e.getText());
//			}
//		
		//Through tag name
//		List<WebElement> tagElements = driver.findElements(By.tagName("div"));
//		for(WebElement x : tagElements)
//		{
//			System.out.println(x.getText());
//		}
		
		//Link Text
		driver.findElement(By.linkText("Today's Deals")).click();

	}
}


