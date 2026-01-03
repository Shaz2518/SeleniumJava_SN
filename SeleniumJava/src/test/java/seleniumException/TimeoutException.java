package seleniumException;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TimeoutException {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
		driver.findElement(By.xpath("//button[text()='Add Element']")).click();
		Thread.sleep(1000);
		WebElement button = driver.findElement(By.xpath("//button[@class='added-manually']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(0));
		wait.until(ExpectedConditions.visibilityOf(button));
		button.click();
		
		
		//driver.quit();

	}

}
