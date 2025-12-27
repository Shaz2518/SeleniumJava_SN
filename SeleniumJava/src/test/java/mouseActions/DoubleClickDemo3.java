package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickDemo3 {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick");

		//Switch to frame
		WebElement webFrame = driver.findElement(By.cssSelector("#iframeResult"));
		driver.switchTo().frame(webFrame);
		
		WebElement btn = driver.findElement(By.tagName("button"));
		
		Actions doubleClick = new Actions(driver);
		doubleClick.doubleClick(btn).perform();
		
		String result = driver.findElement(By.id("demo")).getText();
		System.out.println(result);
	}

}
