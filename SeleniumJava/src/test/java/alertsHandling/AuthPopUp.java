package alertsHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AuthPopUp {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		String authText = driver.findElement(By.xpath("//div[@class='example']")).getText();
		System.out.println(authText);
		
		driver.quit();
	}

}
