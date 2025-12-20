package browserWindowHandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHandle_SetToList {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		Thread.sleep(3000);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Set<String> multipleWindow = driver.getWindowHandles();
		String current = driver.getTitle();
		System.out.println("Before Tab Switch: " + current);
		List<String> windowList = new ArrayList<>(multipleWindow);
		for(String str : windowList)
		{
			System.out.println(str);
		}
		driver.switchTo().window(windowList.get(1));
		String afterSwitch = driver.getTitle();
		System.out.println("After Tab Switch: " + afterSwitch);
		driver.quit();

	}

}
