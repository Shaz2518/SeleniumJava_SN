package seleniumJavaPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NavigateVsGet {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		
		//Open a Website
//		driver.get("https://www.google.com");
//		driver.close();

		//Open a Website and navigate ti different website in same tab
		driver.navigate().to("https://www.google.com");
		driver.navigate().to("https://www.amazon.co.uk");
		driver.navigate().to("https://www.bing.com");
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		System.out.println("Program Ran Succesfully");
		driver.close();
	
	}

}
