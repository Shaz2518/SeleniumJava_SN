package framesPractice;

import java.util.List;

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
		driver.findElement(By.name("mytext1")).sendKeys("Hello");
		
		//Switch to Main WebPage
		driver.switchTo().defaultContent();
		
		//Switch to Frame 2
		WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.name("mytext2")).sendKeys("World");
		
		//Switch to Main WebPage
		driver.switchTo().defaultContent();
		
		//Switch to frame 3
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		WebElement text = driver.findElement(By.name("mytext3"));
		text.sendKeys("Java Practice");
		//Switch to nested frame in Frame3
		WebElement iframeElement = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(iframeElement);
		
		driver.findElement(By.xpath("//span[text()='I am a human']")).click();
		driver.findElement(By.xpath("//span[text()='Web Testing']")).click();
		
		driver.switchTo().parentFrame();
		
		//driver.switchTo().frame(frame3);
		text.clear();
		text.sendKeys("Selenium");
	}

}
