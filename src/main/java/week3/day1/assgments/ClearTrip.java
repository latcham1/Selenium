package week3.day1.assgments;

import java.text.DateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

import org.apache.poi.ss.formula.functions.Now;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ClearTrip {
	public static void main(String[] args) {


		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/"); 
		driver.manage().window().maximize(); 
		driver.findElement(By.xpath("//div[@class='px-1   flex flex-middle nmx-1 pb-1']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
		driver.findElement(By.xpath("//span[contains(text(),'One way')]")).click();	 
		driver.findElement(By.xpath("//span[contains(text(),'Round trip')]")).click();
		driver.findElement(By.xpath("//input[@class='w-100p fs-4 fw-500 c-neutral-500']")).sendKeys("Chennai", Keys.TAB);
		driver.findElement(By.xpath("(//input[@class='w-100p fs-4 fw-500 c-neutral-500'])[2]")).sendKeys("New York", Keys.TAB);
		//		driver.findElement(By.xpath("//div[@class='fs-4 fw-500 c-inherit flex flex-nowrap ml-4']")).click();
		driver.findElement(By.xpath("//div[@class='fs-4 fw-500 c-inherit flex flex-nowrap ml-6']")).click();
		driver.findElement(By.xpath("//div[text()='20']")).click();
		driver.findElement(By.xpath("//span[text()='1 Adult, Economy']")).click();
		
	}
}
