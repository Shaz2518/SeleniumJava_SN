package dropDownPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetSelectedOptions {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
				
		WebElement day = driver.findElement(By.id("day"));
		Select dropDownDay = new Select(day);
		WebElement dayDown = dropDownDay.getFirstSelectedOption();
		System.out.println("Day: " + dayDown.getText());
		
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select dropDownMonth = new Select(month);
		WebElement monthDrop = dropDownMonth.getFirstSelectedOption();
		System.out.println("Month: " + monthDrop.getText());
		
		WebElement year = driver.findElement(By.xpath("//select[@title='Year']"));
		Select dropDownYear = new Select(year);
		WebElement yearDrop = dropDownYear.getFirstSelectedOption();
		System.out.println("Year: " + yearDrop.getText());
		

	}

}
