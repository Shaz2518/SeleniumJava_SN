package webTablePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class RetrieveAllTableData {

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

		// Get header details
		for (int col = 1; col <= tableCol; col++) {
			String str = driver.findElement(By.xpath("//table[@name='BookTable']//tr[1]/th[" + col + "]")).getText();
			System.out.print(str + " ");
		}
		System.out.println(" ");

		// Retrieve Table Data
		for (int row = 2; row <= tableRow; row++) {
			for (int col = 1; col <= tableCol; col++) {
				String str = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + row + "]/td[" + col + "]"))
						.getText();

				System.out.print(str + " ");
			}
			System.out.println(" ");
		}

		driver.quit();

	}

}
