package mouseActions;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickDemo2 {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");

		//Switch to frame
		WebElement webFrame = driver.findElement(By.cssSelector("#iframeResult"));
		driver.switchTo().frame(webFrame);
		
		WebElement text = driver.findElement(By.id("demo"));
		
		Actions textClick = new Actions(driver);
		textClick.doubleClick(text).perform();
		
		String str = text.getText();
		System.out.println(str);

	}

}
