package mouseActions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.myntra.com/");
		
		//Define locator for element to hover
		WebElement eleHover = driver.findElement(By.xpath("//div[@class='desktop-navContent']//a[@data-group='women']"));
		
		//Define action class object to hover on element
		Actions mouseHover = new Actions(driver);
		mouseHover.moveToElement(eleHover).perform();
		
		//Click on any option from the hovered element
		WebElement option = driver.findElement(By.xpath("//div[@data-group='women']//a[text()='Jumpsuits']"));
		option.click();
		
		//Get All products displayed
		List<WebElement> products = driver.findElements(
				By.xpath("//div[@class='product-productMetaInfo']/h3"));
		
		System.out.println(products.size());
		
		for(WebElement ele: products)
		{
			String prodName = ele.getText();
			System.out.println(prodName);
		}
		driver.quit();
	}

}
