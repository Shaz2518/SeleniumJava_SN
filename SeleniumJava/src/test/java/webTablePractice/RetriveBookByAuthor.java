package webTablePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class RetriveBookByAuthor {

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

		// Retreive all authors
		for (int a = 2; a <= tableRow; a++) {
			String author = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + a + "]/td[2]")).getText();
			// System.out.println("Author Name: " + author);

			if (author.equals("Mukesh")) {
				String book = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + a + "]/td[1]")).getText();
				System.out.println("Book Names by: " + author);
				System.out.println(book);
			}
		}
		driver.quit();
	}

}
