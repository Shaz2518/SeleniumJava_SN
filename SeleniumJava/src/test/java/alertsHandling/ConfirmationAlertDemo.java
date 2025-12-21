package alertsHandling;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ConfirmationAlertDemo {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		// Cancel Confirmation Alert
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert Message: " + alert.getText());
		
		alert.accept();
		//alert.dismiss();
		String result = driver.findElement(By.id("result")).getText();
		System.out.println(result);

		
	}

}
