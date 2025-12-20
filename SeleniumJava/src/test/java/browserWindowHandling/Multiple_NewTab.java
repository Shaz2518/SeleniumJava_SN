package browserWindowHandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Multiple_NewTab {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/");
		
		for(int i=0; i<5; i++) {
			driver.findElement(By.linkText("Click Here")).click();
		}
		
		driver.close();
		//System.out.println(driver.getWindowHandle());
		Set<String> windowList = driver.getWindowHandles();
		List<String> getWindows = new ArrayList<>(windowList);
		
		for(String window : getWindows)
		{
			driver.switchTo().window(window);
			System.out.println(driver.getTitle());
		}
		
		driver.quit();
		
		
		
		
		
		
		

	}

}
