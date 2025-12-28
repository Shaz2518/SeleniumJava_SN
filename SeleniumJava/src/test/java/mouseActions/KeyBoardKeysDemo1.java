package mouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardKeysDemo1 {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://text-compare.com/");
		
		WebElement text = driver.findElement(By.id("inputText1"));
		text.sendKeys("Welcome to Selenium Training");
		
		//Create Actions class object
		Actions actKeys = new Actions(driver);
		
		//Select All Text
		actKeys.keyDown(Keys.CONTROL).sendKeys("A")
		.keyUp(Keys.CONTROL).perform();
		
		//Copy text
		actKeys.keyDown(Keys.CONTROL).sendKeys("C")
		.keyUp(Keys.CONTROL).perform();
		
		//Go to nxt text area- TAB
		actKeys.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		
		//Paste copied text
		actKeys.keyDown(Keys.CONTROL).sendKeys("V")
		.keyUp(Keys.CONTROL).perform();
		
		
		
		

	}

}
