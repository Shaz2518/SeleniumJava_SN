package brokenLinksImages;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenImages {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/broken_images");
		List<WebElement> images = driver.findElements(By.tagName("img"));

		for (WebElement img : images) {
			checkBrokenLinks(img, driver);
		}

		driver.quit();

	}

	public static void checkBrokenLinks(WebElement img, WebDriver driver) {
		try {
			String hrefAttribute = img.getDomAttribute("src");
			if (hrefAttribute == null || hrefAttribute.isEmpty() || hrefAttribute.contains("javascript:void"))
				return;

			String baseURL = driver.getCurrentUrl();
			URI baseURI = new URI(baseURL);
			URI relativeURL = new URI(hrefAttribute);
			URI absoluteURI = baseURI.resolve(relativeURL);
			URL finalURL = absoluteURI.toURL();
			// System.out.println(finalURL);

			// Link Validation

			HttpURLConnection con = (HttpURLConnection) finalURL.openConnection();
			con.setRequestMethod("GET");
			con.setConnectTimeout(5000);
			con.connect();
			if (con.getResponseCode() >= 400) {
				String str = con.getResponseCode() + " " + con.getResponseMessage();
				System.out.println("Broken Image: " + str);
			}

			else {
				String str = con.getResponseCode() + " " + con.getResponseMessage();
				System.out.println("Working Image: " + str);
			}

		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
