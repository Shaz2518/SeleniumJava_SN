package pseudoElementHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PseudoElementDemo_after {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://play1.automationcamp.ir/advanced");

		WebElement ele = driver.findElement(By.className("star-rating"));

		// Script for getting Pseudo Element
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String pseudoElement = "return window.getComputedStyle(arguments[0],'::after').getPropertyValue('content')";

		String content = js.executeScript(pseudoElement, ele).toString();
		System.out.println(content);

		String input = content.replaceAll("\"", "");
		WebElement textBox = driver.findElement(By.id("txt_rating"));

		textBox.sendKeys(input);
		WebElement btn = driver.findElement(By.id("check_rating"));
		btn.click();

		String finalValue = driver.findElement(By.id("validate_rating")).getText();
		System.out.println(finalValue);

		driver.quit();

	}

}
