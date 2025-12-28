package privateBrowserLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class InPrivateMode_Edge {

	public static void main(String[] args) {
		
		EdgeOptions option = new EdgeOptions();
		option.addArguments("--inprivate");
		
		WebDriver driver = new EdgeDriver(option);
		driver.get("https://www.google.com");

	}

}
