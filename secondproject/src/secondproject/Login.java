package secondproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver","C:\\Users\\unnimaya\\OneDrive\\Desktop\\salenium\\chromedriver-win64");
       WebDriver driver= new ChromeDriver();
       driver.get("https://www.facebook.com/login/");
       driver.findElement(By.id("email")).sendKeys("paaru@123");
       driver.findElement(By.id("pass")).sendKeys("123");
       driver.findElement(By.name("login")).click();
       
	}

}
