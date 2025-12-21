package synchronizationWaits;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ImplicitWaitDemo {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.findElement(By.linkText("OrangeHRM, Inc")).click();

		Set<String> multipleWindow = driver.getWindowHandles();
		System.out.println(multipleWindow);
		driver.close();

	}

}
