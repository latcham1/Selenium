package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseageOfXpathinCRM {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElement(By.xpath("//input[@id= 'username']")).sendKeys("demoSalesManager");
		driver.findElement(By.xpath("//input[@id= 'password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class= 'decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
//		int[] a{1,3,64];
		driver.close();
		
	}
}
