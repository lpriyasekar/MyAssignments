package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//WebElement emailid = driver.findElement(By.id("email"));
		driver.findElement(By.id("email")).sendKeys("lakshmipriya941993@gmailcom");
		//emailid.sendKeys("lakshmipriya941993@gmailcom");
		
		Thread.sleep(2000);
		//driver.close();
		
	}

	private static void sendKeys(String string) {
		// TODO Auto-generated method stub
		
	}

}
