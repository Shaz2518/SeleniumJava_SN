package mouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		//Perform Right Click
		WebElement button = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions rightClick = new Actions(driver);
		rightClick.contextClick(button).perform();
		
		//Click any option on context menu
		WebElement contextOpt = driver.findElement(By.xpath("//span[text()='Cut']"));
		contextOpt.click();
		
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		

	}

}
