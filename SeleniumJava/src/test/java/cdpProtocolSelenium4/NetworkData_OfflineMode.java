package cdpProtocolSelenium4;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v143.network.Network;

public class NetworkData_OfflineMode {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// Launch Chrome
		ChromeDriver driver = new ChromeDriver();

		// Create DevTools Object and create session
		DevTools dev = driver.getDevTools();
		dev.createSession();

		// Send Connection -- Accept 3 prameter--
		// pass Optional.empty() for default Chrome Setting (Network.enable());
		dev.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(),
				Optional.empty()));

		// Network Emulate Condition
		dev.send(Network.emulateNetworkConditions(true, 0, 0, 0, Optional.empty(), Optional.empty(), Optional.empty(),
				Optional.empty()));

		// Add listener
		
		dev.addListener(Network.loadingFailed(), load -> {
			System.out.println("Request ID: " + load.getRequestId());
			System.out.println("Error Text: " + load.getErrorText());
			System.out.println("Error Type: " + load.getType());
			System.out.println("===========");

			
		});
		
		try {
			driver.get("https://www.google.com");
		}

		catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}

		finally {
			driver.quit();
		}

	}

}
