package cssMethodsPractice;

import java.awt.Color;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConvertColorToHexa {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://academy.swaroopnadella.com/");

		WebElement button = driver.findElement(By.linkText("Join my community"));
		String bgColor = button.getCssValue("background-color");
		System.out.println(bgColor);
		
		
		String newStr[] = bgColor.replace("rgba(", "").replace(")", "").split(",");
		System.out.println(Arrays.toString(newStr));
		
		Color color = new Color(Integer.parseInt(newStr[0].trim()),
								Integer.parseInt(newStr[1].trim()),
								Integer.parseInt(newStr[2].trim()));
		
		String value = Integer.toHexString(color.getRGB());
		System.out.println(value.substring(2));

		driver.quit();

	}

}
