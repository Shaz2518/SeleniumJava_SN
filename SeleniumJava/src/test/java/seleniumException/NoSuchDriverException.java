package seleniumException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoSuchDriverException {

	public static void main(String[] args) {
		
		//NoSuchDriverException - Incorrect driver path
		System.setProperty("webdriver.chrome.driver", "//Hello//driver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
		driver.close();

	}

}
