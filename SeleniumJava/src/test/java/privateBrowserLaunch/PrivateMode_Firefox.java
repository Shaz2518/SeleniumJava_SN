package privateBrowserLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class PrivateMode_Firefox {

	public static void main(String[] args) {
		FirefoxOptions option = new FirefoxOptions();
		option.addArguments("--private");
		
		WebDriver driver = new FirefoxDriver(option);
		driver.get("https://www.google.com");

	}

}
