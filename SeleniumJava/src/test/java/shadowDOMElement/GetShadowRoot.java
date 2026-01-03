package shadowDOMElement;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetShadowRoot {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://dev.automationtesting.in/shadow-dom");
		
		SearchContext shadowRoot = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
		String shadowElement = shadowRoot.findElement(By.id("shadow-element")).getText();
		
		System.out.println(shadowElement);
		driver.quit();	
	}

}
