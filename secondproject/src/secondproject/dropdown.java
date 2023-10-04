package secondproject;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

@SuppressWarnings("unused")
public class dropdown {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\unnimaya\\\\OneDrive\\\\Desktop\\\\salenium\\\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	WebElement from1 = driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
	WebElement To1 = driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
	WebElement from2 = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
	WebElement To2 = driver.findElement(By.xpath("//*[@id=\"amt7\"]"));
	Actions act = new Actions(driver);
	act.dragAndDrop(from1, To1).build().perform();
	act.dragAndDrop(from2, To2).build().perform();
	
	}

}
