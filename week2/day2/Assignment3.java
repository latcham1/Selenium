package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
	public static void main(String[] args) {

		ChromeDriver driver =  new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys( "leaf@12");
		driver.findElement(By.xpath("//button[@class = 'btn btn-primary']")).click();
		String title = driver.getTitle();
		System.out.println("title = " + title);
		driver.findElement(By.xpath("//a[text()=\"Log Out\"]")).click();		
		driver.quit();
	}
}
