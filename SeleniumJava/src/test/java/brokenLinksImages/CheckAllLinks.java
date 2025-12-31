package brokenLinksImages;

import java.net.URI;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckAllLinks {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://academy.swaroopnadella.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));

		for (WebElement link : links) {
			checkBrokenLinks(link, driver);
		}

		driver.quit();

	}

	public static void checkBrokenLinks(WebElement link, WebDriver driver) {
		try {
			String hrefAttribute = link.getDomAttribute("href");
			if (hrefAttribute == null || hrefAttribute.isEmpty() || hrefAttribute.contains("javascript:void"))
				return;

			String baseURL = driver.getCurrentUrl();
			URI baseURI = new URI(baseURL);
			URI relativeURL = new URI(hrefAttribute);
			URI absoluteURI = baseURI.resolve(relativeURL);
			URL finalURL = absoluteURI.toURL();
			System.out.println(finalURL);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
