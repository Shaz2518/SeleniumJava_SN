package cdpProtocolSelenium4;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v141.log.Log;
import org.openqa.selenium.devtools.v141.log.model.LogEntry;

public class ConsoleLogData {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		//DevTools Obj and Create Session
		DevTools dev = driver.getDevTools();
		dev.createSession();
		
		//Establish Console Log connection (Console domain deprecated- Runtime, Log)
		dev.send(Log.enable());
		
		//Add Listener  (Accept 2 parameters, event and consumer--)
		dev.addListener(Log.entryAdded(), (LogEntry entry) -> {
			System.out.println("Text: " + entry.getText());
			System.out.println("URL: " + entry.getUrl());
			System.out.println("Level: " + entry.getLevel());
			System.out.println("=============");
			});
		
		//Launch website
		driver.get("https://the-internet.herokuapp.com/broken_images");
		driver.quit();
	}

}
