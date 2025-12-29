package chromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class InPrivateWindow {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito","--start-maximized");

		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.google.com");
		
		System.out.println(driver.getTitle());

	}

}
