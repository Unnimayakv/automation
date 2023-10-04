package secondproject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplewindows {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\unnimaya\\OneDrive\\Desktop\\salenium\\chromedriver-win64");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("//*[@id=\"u_0_2_O5\"]/div[3]/a")).click();
		Set<String>a=driver.getWindowHandles();
		Iterator<String>it=a.iterator();
		while(it.hasNext())
		{
			String childwindowString=it.next();
			driver.switchTo().window(childwindowString);
		}
	}

}
