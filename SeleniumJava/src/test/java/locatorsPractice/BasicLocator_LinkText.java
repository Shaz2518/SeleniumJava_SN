package locatorsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocator_LinkText {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		Thread.sleep(50000);
		driver.findElement(By.linkText("Cameras")).click();

	}

}
