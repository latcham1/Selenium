package marathon1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Testcase1RedBusoldapp {
	public static void main(String[] args) {	
		ChromeOptions options = new ChromeOptions();       
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);        
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Chennai");
		WebElement koyeEle = driver.findElement(By.xpath("//li[contains(text(),'Koyambedu, Chennai')]"));		
		driver.executeScript("arguments[0].click();", koyeEle);  // click intercepted exception
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Bangalore");
		WebElement madiwalaEle = driver.findElement(By.xpath("//li[contains(text(),'Madiwala, Bangalore')]"));		
		driver.executeScript("arguments[0].click();", madiwalaEle);  // click intercepted exception
		driver.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']")).click();
		driver.findElement(By.xpath("//td[@class='current day']")).click();
		driver.findElement(By.xpath("//button[contains (text(),'SEARCH BUSES')]")).click();
		String busFound= driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println("number of bus found " + busFound);
		driver.findElement(By.xpath("//label[contains(text(),'SLEEPER')]")).click();
		String secondNameResultingBus = driver.findElement(By.xpath("(//div[@class='travels lh-24 f-bold d-color'])[2]")).getText();
		System.out.println("Second bus Name in the result set" + secondNameResultingBus);
		String title = driver.getTitle();
		System.out.println("title of the page is " +title);
		driver.close();
	}
}
