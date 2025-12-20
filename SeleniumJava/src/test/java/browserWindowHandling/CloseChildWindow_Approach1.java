package browserWindowHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class CloseChildWindow_Approach1 {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent Window: " + driver.getTitle());

		// Open new Window
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.youtube.com");
		System.out.println("New Window: " + driver.getTitle());

		driver.close();
		driver.switchTo().window(parentWindow);
		System.out.println("Access back: " + driver.getTitle());
		
	}

}
