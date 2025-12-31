package seleniumException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoSuchFrameException {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://academy.swaroopnadella.com/");
		
		//NoSuchFrameException -- No Frame/Invalid Frame Present on the Webpage
		driver.switchTo().frame("Hello");
		driver.quit();


	}

}
