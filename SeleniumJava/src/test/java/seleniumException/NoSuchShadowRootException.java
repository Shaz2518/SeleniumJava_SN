package seleniumException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoSuchShadowRootException {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://academy.swaroopnadella.com/");
		
		//NoSuchShadowRootException --No Shadow Root available
		driver.findElement(By.className("display")).getShadowRoot();
		driver.quit();

	}

}
