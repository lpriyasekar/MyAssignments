package week2.day4;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Search AJIO']"));
		searchBox.sendKeys("bags");
		searchBox.sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//label[@for='Men']//parent::div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Men - Fashion Bags']//following-sibling::label")).click();
		
		String itemsfound = driver.findElement(By.xpath("//div[@class=' filter-container']//div[@class='length']")).getText();
		System.out.println("Items found : "+itemsfound);
		// Get the list of brand of the products displayed in the page and print the
				// list.
		List<WebElement> brandlist = driver.findElements(By.xpath("//div[@class='brand']"));
		Set<WebElement> brandname = new HashSet<WebElement>(brandlist);
		System.out.println("Available Brand List");
		for (WebElement bn : brandname) {
			System.out.println(bn.getText());
			
		}
		
		// list. - Get the list of names of the bags and print it
		
		List<WebElement> bagname = driver.findElements(By.xpath("//div[@class='nameCls']"));
		for (WebElement bagNames : bagname) {
				System.out.println("Bagnames:");
				System.out.println(bagNames.getText());
		}
		
		
		
	}
	
	
	}

	

