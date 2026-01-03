package svgElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SVGElementPractice {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement circle = driver.findElement(By.xpath("//*[local-name()='circle']"));
		WebElement rect = driver.findElement(By.xpath("//*[local-name()='rect']"));
		WebElement polygon = driver.findElement(By.xpath("//*[local-name()='polygon']"));
		
		String circleAtt = circle.getDomAttribute("stroke");
		System.out.println("Stroke Value: " + circleAtt);
		
		String rectAtt = rect.getDomAttribute("fill");
		System.out.println("Fill Value: " + rectAtt);
		
		String polygonAtt = polygon.getDomAttribute("points");
		System.out.println("Points Value: " + polygonAtt);
		
		driver.quit();

	}

}
