package mouseActions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo2 {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://ui.vision/demo/webtest/dragdrop/");

		WebElement destination = driver.findElement(By.id("bin"));

		Actions dragDrop = new Actions(driver);

		List<WebElement> options = driver.findElements(By.xpath("//a[@draggable='true']"));
		for (WebElement op : options) {
			dragDrop.dragAndDrop(op, destination).perform();
		}
	}
}
