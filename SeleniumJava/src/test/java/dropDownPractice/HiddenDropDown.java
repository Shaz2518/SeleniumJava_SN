package dropDownPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class HiddenDropDown {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Enter username and password
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("Admin");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//Click on PIM for dropdown options
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		
		//Click DropDown option in Job Title
		WebElement jobTitle = driver.findElement(By.xpath("//label[text()='Job Title']"));
		driver.findElement(RelativeLocator.with(By.tagName("div")).near(jobTitle)).click();
		
		//Retrieve all values
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='oxd-select-option']/span"));
		System.out.println(options.size());
		for(WebElement op : options)
		{
			System.out.println(op.getText());
		}
		//Select options
		//driver.findElement(By.xpath("//span[text()='QA Engineer']")).click();
		//driver.findElement(By.xpath("//span[text()='QA Lead']")).click();
		driver.findElement(By.xpath("//span[text()='Automaton Tester']")).click();
		
		driver.quit();
		
		

	}

}
