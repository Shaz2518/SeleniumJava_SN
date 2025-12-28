package privateBrowserLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IncognitoMode_Chrome {

	public static void main(String[] args) {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.google.com");

	}

}
