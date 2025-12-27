package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDragDrop {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");

		// Get Locator for min and max Slider
		WebElement minSlide = driver.findElement(By.xpath("//div[@id='slider-range']/span[1]"));
		WebElement maxSlide = driver.findElement(By.xpath("//div[@id='slider-range']/span[2]"));

		// Get Cordinates
		System.out.println(minSlide.getLocation());
		System.out.println(maxSlide.getLocation());

		// Drag the slider
		Actions act = new Actions(driver);
		act.dragAndDropBy(minSlide, 85, 0).perform();
		act.dragAndDropBy(maxSlide, -100, 0).perform();

		// Final Selection
		// Get Cordinates
		System.out.println(minSlide.getLocation());
		System.out.println(maxSlide.getLocation());
		WebElement result = driver.findElement(By.id("searchResults"));
		System.out.println(result.getText());

	}

}
