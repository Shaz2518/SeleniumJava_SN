package alertsHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NormalAlertDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Alert jsAlert = driver.switchTo().alert();
		System.out.println("Alert Message: " + jsAlert.getText());
		
		jsAlert.accept();
		String str =driver.findElement(By.id("result")).getText();
		System.out.println("After Accept: " + str);
		
		driver.quit();

	}

}
