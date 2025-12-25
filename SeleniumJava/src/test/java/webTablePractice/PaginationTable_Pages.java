package webTablePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class PaginationTable_Pages {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");
		
		//Count number of pages.
		int pageSize = driver.findElements(By.xpath("//ul[@class='pagination']/li")).size();
		//System.out.println(pageSize);
		for(int i=1; i<=pageSize; i++)
		{
//			//Get number of pages.
//			String str = driver.findElement(By.xpath("//ul[@class='pagination']/li["+i+"]")).getText();
//			System.out.println(str);
//			System.out.println("Page Number: " + str);
			
			//Click on all pages
			WebElement pages = driver.findElement(
					By.xpath("//ul[@class='pagination']/li["+i+"]"));
			Thread.sleep(2000);
			pages.click();
		
		}
		
		driver.quit();
		

	}

}
