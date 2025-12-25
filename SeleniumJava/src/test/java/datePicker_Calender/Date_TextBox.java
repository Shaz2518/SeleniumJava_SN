package datePicker_Calender;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Date_TextBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/datepicker/");

		// Switch to Frame
		WebElement frame = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(frame);

		// Approach 1- SendKeys()
		// driver.findElement(By.id("datepicker")).sendKeys("02/25/2023");

		// Approach 2 - Select Month and Year
		WebElement textBox = driver.findElement(By.id("datepicker"));
		textBox.click();

		String expDate = "18";
		String expMonth = "November";
		String expYear = "2023";

		// Get Current Month and Year
		while (true) {
			String currentMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
			String currentYear = driver.findElement(By.className("ui-datepicker-year")).getText();

			// Compare if current is same as Expected
			if (currentMonth.equals(expMonth) && currentYear.equals(expYear))
				break;

			// Future Date
			//driver.findElement(By.xpath("//span[text()='Next']")).click();

			// Past Date
			 driver.findElement(By.xpath("//span[text()='Prev']")).click();

		}

		List<WebElement> dates = driver
				.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody/tr/td/a"));
		/*
		 * int dateSize = dates.size(); System.out.println(dateSize);
		 */
		for (WebElement date : dates) {
			String str = date.getText();
			if (str.equals(expDate))
			{
				date.click();
				break;
			}

		}
		Thread.sleep(3000);
		driver.quit();

	}
}
