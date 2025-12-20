package browserWindowHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class New_Tab_Window {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");
		System.out.println("Parent Window: " + driver.getTitle());

		// Open a new Tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.in");
		System.out.println("New Tab: " + driver.getTitle());

		// Open new Window
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.youtube.com");
		System.out.println("New Window: " + driver.getTitle());

		driver.quit();

	}

}
