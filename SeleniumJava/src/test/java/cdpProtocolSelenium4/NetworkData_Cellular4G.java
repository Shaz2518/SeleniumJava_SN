package cdpProtocolSelenium4;

import java.util.Optional;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v143.network.Network;
import org.openqa.selenium.devtools.v143.network.model.ConnectionType;


public class NetworkData_Cellular4G {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		DevTools dev = driver.getDevTools();
		dev.createSession();
		
		//Network enable Parameters will be Optional.empty() -Default Chrome Network Setting
		dev.send(Network.enable(Optional.empty(), 
				Optional.empty(), 
				Optional.empty(),
				Optional.empty(), Optional.empty()));
		
		// Network Emulate Condition
				dev.send(Network.emulateNetworkConditions(
						false, //Connection Online
						10000, // Latency
						20000, //Downtime 
						20000, //Uptime
						Optional.of(ConnectionType.CELLULAR4G), 
						Optional.empty(), Optional.empty(),
								Optional.empty()));
		
		//Add Listner
		dev.addListener(Network.loadingFinished(), loadFinished -> {
			
			System.out.println("Request ID: " + loadFinished.getRequestId());
			System.out.println("TimeStamp: " + loadFinished.getTimestamp());
			System.out.println("=====================");
		});

		try {
			
			long currentTime = System.currentTimeMillis();
			System.out.println("Current Time: " + currentTime);
			driver.get("https://www.google.com");
			
			long stopTime = System.currentTimeMillis();
			System.out.println("Stop Time: " + stopTime);
			
			long totalTime = currentTime + stopTime;
			System.out.println(totalTime);
			System.out.println("=====================");
			
		}
		
		catch(Exception e) {
			System.out.println("Exception Message: " + e.getMessage());
		}
		finally {
			driver.quit();
		}
	}

}
