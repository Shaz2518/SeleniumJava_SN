package shadowDOMElement;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NestedShadowDom {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://dev.automationtesting.in/shadow-dom");
		
		SearchContext parentShadowRoot = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
		SearchContext childShadowRoot = parentShadowRoot.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
		
		String shadowElement = childShadowRoot.findElement(By.id("nested-shadow-element")).getText();
		
		System.out.println(shadowElement);
		driver.quit();	

	}

}
