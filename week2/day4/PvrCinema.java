package Handsontraining;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PvrCinema {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Chennai']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[@class='cinemas-inactive']")).click();
		driver.findElement(By.id("cinema")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement sc = driver.findElement(By.xpath("//span[text()='Select Cinema']"));
		driver.findElement(By.xpath("//span[text()='INOX The Marina Mall, OMR, Chennai']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement sd = driver.findElement(By.xpath("//span[text()='Select Date']"));
		driver.findElement(By.xpath("//span[text()='Tomorrow']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//movie
		WebElement mov = driver.findElement(By.xpath("//div[@id='movie']"));
		driver.findElement(By.xpath("//li[@class='p-dropdown-item']//child::span[text()='PARADISE']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//time
		WebElement time = driver.findElement(By.xpath("//span[text()='Select Timing']"));
		driver.findElement(By.xpath("//li[@class='p-dropdown-item']//child::span[text()='04:10 PM']")).click();
		//submit
		driver.findElement(By.xpath("//button[@aria-label='Submit']")).click();
		//alert msg
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		//seat selection
		driver.findElement(By.xpath("//*[@class='seats-col'][5]")).click();
		//proceed
		//driver.findElement(By.linkText("Proceed")).click();
		//driver.findElement(By.linkText("//div[@class='register-btn']//child::button[text()='Proceed']")).click();
		//bookingsummary
		String summary = driver.findElement(By.xpath("//div[@class='book-head']//child::h3")).getText();
		System.out.println("Booking Summary: "+summary);
		String seatinfo = driver.findElement(By.xpath("//div[@class='seat-info']")).getText();
		System.out.println("Seat Info:"+seatinfo);
		String ticketvalu = driver.findElement(By.xpath("//div[@class='ticket-value']")).getText();
		System.out.println("Ticket Value: "+ticketvalu);
		String seatno = driver.findElement(By.xpath("//div[@class='seat-number']")).getText();
		System.out.println("Seat no; "+seatno);
		String grandtotal = driver.findElement(By.xpath("//div[@class='grand-prices']")).getText();
		System.out.println("Grand Total: "+grandtotal);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//proceed
		driver.findElement(By.xpath("//button[contains(.,'Proceed')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("mobileInput")).sendKeys("8526283229");
		String title = driver.getTitle();
		System.out.println("Title of the page: "+title);
		Thread.sleep(3000);
		driver.close();
		
	}

	private static char[] getText() {
		// TODO Auto-generated method stub
		return null;
	}
}
