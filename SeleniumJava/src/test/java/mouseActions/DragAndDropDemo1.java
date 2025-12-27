package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo1 {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");

		//Switch to frame
		WebElement webFrame = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(webFrame);
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement destination = driver.findElement(By.id("droppable"));
		
		Actions dragDrop = new Actions(driver);
		dragDrop.dragAndDrop(source, destination).perform();
		
		String result = destination.getText();
		System.out.println(result);
		
		driver.quit();
	}

}
