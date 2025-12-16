package seleniumJavaPractice;

import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_GetMethods {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		//Open a Webpage
		driver.get("https://www.google.com");
		
		//Get Title of webpage
		String title = driver.getTitle();
		System.out.println(title);
		
		//Get URL of webpage
		String webURL = driver.getCurrentUrl();
		System.out.println(webURL);
		
		//Get page Info (HTML Source Code)
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		//Close browser
		driver.close();

	}

}
