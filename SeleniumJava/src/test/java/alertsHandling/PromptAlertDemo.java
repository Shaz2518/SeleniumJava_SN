package alertsHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PromptAlertDemo {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		// Add Text in TextBox and Accept the Alert Box
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();

		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.sendKeys("Hello World!");
		alert.accept();      //Accept Alert
		//alert.dismiss();	 //Cancel Alert
		String result = driver.findElement(By.id("result")).getText();
		System.out.println(result);

			
		driver.quit();

	}

}
