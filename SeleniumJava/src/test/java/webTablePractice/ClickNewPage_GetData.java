package webTablePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ClickNewPage_GetData {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("//ul[@class='pagination']/li[3]")).click();
		
		int rows = driver.findElements(By.xpath("//table[@id='productTable']//tr")).size();
		System.out.println(rows);
		
		int cols = driver.findElements(By.xpath("//table[@id='productTable']//th")).size();
		System.out.println(cols);
		
		for(int i=1; i<=cols;i++)
		{
			String header = driver.findElement(By.xpath("//table[@id='productTable']//tr/th["+i+"]")).getText();
			System.out.print(header + " ");
		}
		
		System.out.println();
		for(int row=1; row<rows; row++)	
		{
			for(int col=1; col<=cols; col++)
			{
				
				String value = driver.findElement(
						By.xpath("//table[@id='productTable']//tr["+row+"]/td["+col+"]")).getText();
				System.out.print(value + " ");
			
			}
			System.out.println(" ");
		}

		driver.quit();
	}

}
