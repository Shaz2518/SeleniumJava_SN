package javaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ScollingWebpage_JSExec {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
				
		//Case 1 --> Scroll with cordinates
		//js.executeScript("window.scrollBy(0,1000)", " ");
		
		//Case 2 --> Scroll till WebELEMENT
		//WebElement textBox = driver.findElement(By.xpath("//input[@id='comboBox']"));
		//js.executeScript("arguments[0].scrollIntoView()", textBox);
		
		//Case 3 --> Scroll to bottom/top of the webpage
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");

	}

}
