package svgElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SVGElementDemo {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/localadminuser/Desktop/Shaziya.html");
		
		WebElement rect = driver.findElement(By.xpath("//*[local-name()='rect']"));
		WebElement circle = driver.findElement(By.xpath("//*[local-name()='circle']"));
		WebElement text = driver.findElement(By.xpath("//*[local-name()='text']"));
		
		String elementText = text.getText();
		System.out.println(elementText);
		
		String circleColor = circle.getDomAttribute("fill");
		System.out.println(circleColor);
		
		String rectColor = rect.getDomAttribute("fill");
		System.out.println(rectColor);
		
		driver.quit();

	}

}
