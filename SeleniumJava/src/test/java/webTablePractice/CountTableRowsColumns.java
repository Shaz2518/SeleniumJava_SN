package webTablePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CountTableRowsColumns {

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

		// Retrieve specific data
		String value1 = driver.findElement(By.xpath("//table[@name='BookTable']//tr[4]/td[3]")).getText();
		System.out.println("TR-4 TD-3: " + value1);

		driver.quit();
	}

}
