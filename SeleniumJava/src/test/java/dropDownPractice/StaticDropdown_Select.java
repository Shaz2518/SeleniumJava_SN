package dropDownPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown_Select {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
				
		WebElement day = driver.findElement(By.id("day"));
		Select dropDownDay = new Select(day);
		//dropDownDay.selectByIndex(24); //25
		//dropDownDay.selectByVisibleText("25");
		dropDownDay.selectByValue("25");
		
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select dropDownMonth = new Select(month);
		//dropDownMonth.selectByIndex(1); //Feb
		//dropDownMonth.selectByVisibleText("Feb");
		dropDownMonth.selectByValue("2");
		
		WebElement year = driver.findElement(By.xpath("//select[@title='Year']"));
		Select dropDownYear = new Select(year);
		//dropDownYear.selectByIndex(28); //1997
		//dropDownYear.selectByVisibleText("1997");
		dropDownYear.selectByValue("1997");
		
				
	}

}
