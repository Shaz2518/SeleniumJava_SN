package mouseActions;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class HyperLinkNewTab_KeyBoard {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://academy.swaroopnadella.com/");

		WebElement webinars = driver.findElement(By.linkText("Webinars"));
		
		//Open Link in new Tab
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).click(webinars).keyUp(Keys.CONTROL).perform();
		
		//Get Window Handles
		Set<String> windows = driver.getWindowHandles();
		ArrayList<String> wind = new ArrayList<>(windows);
		
		//Webinar Window-Child Window
		driver.switchTo().window(wind.get(1));
		
		String text = driver.findElement(By.xpath("//div[@class='empty-state-container']/p")).getText();
		System.out.println(text);
		
		driver.quit();
		
		
		

	}

}
