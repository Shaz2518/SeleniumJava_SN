package webTablePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SumofAllBooksPrice {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");

		// Count number of rows in table
		int tableRow = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("Table Row: " + tableRow);

		// Count number of columns
		int tableCol = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("Table Columns: " + tableCol);
		
		//Retreive all book price
		int price = 0;
		for(int row = 2; row<=tableRow;row++)
		{
			String str = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+row+"]/td[4]")).getText();
			//Add Total Book price.
			price = price + Integer.parseInt(str);
			
		}
		System.out.println("Total Price of the books are: " + price);
		
		driver.quit();
		

	}

}
