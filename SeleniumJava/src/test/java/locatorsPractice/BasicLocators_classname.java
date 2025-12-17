package locatorsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocators_classname {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		String userName= driver.findElement(By.className("login_credentials")).getText();
		System.out.println(userName);
		
		System.out.println("=======");
		String passWord = driver.findElement(By.className("login_password")).getText();
		System.out.println(passWord);
	}

}
