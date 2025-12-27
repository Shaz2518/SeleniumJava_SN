package mouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickDemo1 {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");

		//Switch to frame
		WebElement webFrame = driver.findElement(By.cssSelector("#iframeResult"));
		driver.switchTo().frame(webFrame);
		
		//Add text in field
		WebElement text1 = driver.findElement(By.cssSelector("#field1"));
		text1.clear();
		text1.sendKeys("Shaziya Shaikh");
		
		//WebElement text2 = driver.findElement(By.cssSelector("#field2"));
		WebElement btn = driver.findElement(By.tagName("button"));
		
		Actions doubleClick = new Actions(driver);
		doubleClick.doubleClick(btn).perform();
				
		driver.quit();
		
		
		
	}

}
