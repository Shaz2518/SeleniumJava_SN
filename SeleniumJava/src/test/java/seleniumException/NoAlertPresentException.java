package seleniumException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoAlertPresentException {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://academy.swaroopnadella.com/");
		
		//NoAlertPresentException -- No Alert Present on the Webpage
		driver.switchTo().alert().accept();
		driver.quit();

	}

}
