package shadowDOMElement;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MultiNestedShadowDom {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://dev.automationtesting.in/shadow-dom");
		
		SearchContext parentShadowRoot = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
		SearchContext childShadowRoot = parentShadowRoot.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
		SearchContext grandChildShadowRoot = childShadowRoot.findElement(By.cssSelector("#nested-shadow-dom")).getShadowRoot();
		
		String shadowElement = grandChildShadowRoot.findElement(By.id("multi-nested-shadow-element")).getText();
		System.out.println(shadowElement);
		driver.quit();	

	}

}
