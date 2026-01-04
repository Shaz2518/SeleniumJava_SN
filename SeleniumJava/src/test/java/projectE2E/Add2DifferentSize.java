package projectE2E;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Add2DifferentSize {

	public static void main(String[] args) {
		//Launch Chrome
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
				driver.get("https://www.myntra.com/");
				
				//Hover to Women (Tshirts)
				Actions hover = new Actions (driver);
				WebElement womenMenu = driver.findElement(By.xpath("//div[@class='desktop-navLinks']//a[text()='Women']"));
				hover.moveToElement(womenMenu).perform();
				
				driver.findElement(By.xpath("//div[@class='desktop-paneContent']//a[text()='Tshirts']")).click();
				
				//Click on first Product
				List<WebElement> products = driver.findElements(By.xpath("//ul[@class='results-base']//li"));
				products.get(0).click();  //First Product Click
				
				//Switch to Product Tab
				Set<String> windows = driver.getWindowHandles();
				List<String> windowsHandles = new ArrayList<String>(windows);
				driver.switchTo().window(windowsHandles.get(1));
				
				//Retrieve text at product page
				WebElement text = driver.findElement(By.className("pdp-price-info"));
				System.out.println(text.getText());
				
				//Select Product Size as 'M'
				WebElement productSizeM = driver.findElement(By.xpath("//div[@class='size-buttons-size-buttons']//p[text()='M']"));
				productSizeM.click();
				driver.findElement(By.className("pdp-add-to-bag")).click();
				
				
				//Select Product Size as 'L'
				WebElement productSizeL = driver.findElement(By.xpath("//div[@class='size-buttons-size-buttons']//p[text()='L']"));
				productSizeL.click();
				driver.findElement(By.className("pdp-add-to-bag")).click();
				
				
				driver.findElement(By.linkText("GO TO BAG")).click();
				
				//Get Item name in Bag
				String bagProduct = driver.findElement(By.xpath("//div[@class='itemContainer-base-details']//div[1]")).getText();
				System.out.println(bagProduct);
				
				driver.quit();

	}

}
