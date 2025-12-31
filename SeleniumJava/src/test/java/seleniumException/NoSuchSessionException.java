package seleniumException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoSuchSessionException {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://academy.swaroopnadella.com/");
		
		//NoSuchWindowException --No Window available
		driver.switchTo().newWindow(WindowType.TAB);
		driver.quit();
		driver.getTitle();

	}

}
