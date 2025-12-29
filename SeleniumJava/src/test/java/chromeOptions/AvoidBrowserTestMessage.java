package chromeOptions;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AvoidBrowserTestMessage {

	public static void main(String[] args) {
		
		String arr[] = {"enable-automation"};
		ChromeOptions option = new ChromeOptions();
		//option.setExperimentalOption("excludeSwitches", arr);
		//option.setExperimentalOption("excludeSwitches", Collections.singleton("enable-automation"));
		//option.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		option.setExperimentalOption("excludeSwitches", Arrays.asList(arr));
		
		
		
		
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.google.com/");
		
		System.out.println(driver.getTitle());

	}

}
