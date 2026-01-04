package cdpProtocolSelenium4;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v141.security.Security;

public class InsecureSSLCertificate {

	public static void main(String[] args) {
		
		//Create ChromeDriver Object -- WebDriver obj will not have CDP Features
		ChromeDriver driver = new ChromeDriver();
		
		//Create DevTool Obj -- Driver obj will not have direct access to CDP Method
		DevTools dev = driver.getDevTools();
		
		//Create a session with DevTool Object
		dev.createSession();
		
		//Use ignoreCeritificateMethod to avoid SSL Error -- true-ignore/false-notIgnored
		dev.send(Security.setIgnoreCertificateErrors(true));
		
		//Perform browser activity
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());

	}

}
