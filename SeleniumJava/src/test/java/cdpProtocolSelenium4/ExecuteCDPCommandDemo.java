package cdpProtocolSelenium4;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteCDPCommandDemo {

	public static void main(String[] args) {
		//Driver obj
		ChromeDriver driver = new ChromeDriver();
		
		//Create a map with SecurityCommand and boolean value
		Map<String,Object> map = new HashMap<>();
		map.put("ignore", true);
		
		//Execute Command
		driver.executeCdpCommand("Security.setIgnoreCertificateErrors", map);
		
		//Launch Browser
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());

	}

}
