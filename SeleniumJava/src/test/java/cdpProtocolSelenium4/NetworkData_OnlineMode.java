package cdpProtocolSelenium4;

import java.util.Optional;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v142.network.Network;

public class NetworkData_OnlineMode {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		//Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		
		//DevTools and session creation
		DevTools dev = driver.getDevTools();
		dev.createSession();
		
		//Send Message
		dev.send(Network.enable(Optional.empty(), Optional.empty(), 
				Optional.empty(), Optional.empty(), Optional.empty()));
		
		// Network Emulate Condition
		dev.send(Network.emulateNetworkConditions(false, 100, 0, 0, Optional.empty(), Optional.empty(), Optional.empty(),
						Optional.empty()));
		
		//Add Listener
		dev.addListener(Network.loadingFinished(), loadingFinished ->
		{
			System.out.println("Request ID: " + loadingFinished.getRequestId());
			System.out.println("TimeStamp: " + loadingFinished.getTimestamp());
			System.out.println("Data Length: " + loadingFinished.getEncodedDataLength());
			System.out.println("=============");
		});

		//Navigate to WebSite
		try
		{
			driver.get("https://www.google.com");
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally {
			driver.quit();
		}
		
	}

}
