package fileUploads;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class MultipleFileUpload {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");
		
		String file1= "C:\\Users\\localadminuser\\Desktop\\Hello.txt";
		String file2= "C:\\Users\\localadminuser\\Desktop\\World.txt";
		
		WebElement fileUpload = driver.findElement(By.id("multipleFilesInput"));
		fileUpload.sendKeys(file1 + "\n" + file2);

	}

}
