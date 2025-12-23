package framesPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FrameDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		//Switch to Frame1 and Enter text
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		
		WebElement textBox = driver.findElement(By.name("mytext1"));
		textBox.sendKeys("Hello");
		
		//Switch to Main WebPage
		driver.switchTo().defaultContent();
		
		//Switch to Frame 2
		WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		
		WebElement textBox1 = driver.findElement(By.name("mytext2"));
		textBox1.sendKeys("World");

	}

}
