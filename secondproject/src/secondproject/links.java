package secondproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class links {
	public class count{
		public static void main(String[]args) {
			System.setProperty("Webdriver.chrome.driver", "C:\\Users\\unnimaya\\OneDrive\\Desktop\\salenium\\chromedriver-win64");
			WebDriver driver = new ChromeDriver();
			String homepage=("https://www.facebook.com/");
			driver.get(homepage);
			System.out.println("total link count" +driver.findElements(By.tagName(homepage)).size());
			@SuppressWarnings("unused")
			WebElement head=driver.findElement(By.id(homepage));
			System.out.println("total link in head"+driver.findElements(By.tagName("homepage")).size());
			@SuppressWarnings("unused")
			WebElement foot=driver.findElement(By.id("PageFooter"));
			System.out.println("total link in footer" +driver.findElements(By.tagName(homepage)).size());
		}
	}

}
