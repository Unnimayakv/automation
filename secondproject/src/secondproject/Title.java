package secondproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title {
	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\unnimaya\\OneDrive\\Desktop\\salenium\\chromedriver-win64");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toppr.com/guides/essays/nature-essay/");
		System.out.println("Title is"  +driver.getTitle());
		String expected="Nature Essay for Students and Children | 500+ Words Essay";
		String actual=driver.getTitle();
		if (expected.contentEquals(actual)) 
		{
			System.out.println("test case passed");
			
		}
		else {
			System.out.println("test case failed");
		}
	}
		
		
		
	} 


