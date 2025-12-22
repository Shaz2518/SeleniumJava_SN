package dropDownPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetDropdownOptions {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?entry_point=login");

		WebElement month = driver.findElement(By.name("birthday_month"));
		Select dropDownMonth = new Select(month);

		List<WebElement> dropdownList = dropDownMonth.getOptions();
		System.out.println(dropdownList.size());
		for (WebElement ele : dropdownList) {
			System.out.print(ele.getText() + " ");
		}
		driver.quit();
	}
}
