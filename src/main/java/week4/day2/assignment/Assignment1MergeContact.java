package week4.day2.assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1MergeContact {
	public static void main(String[] args) {
		ChromeDriver driver =  new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();		
		driver.findElement(By.linkText("Merge Contacts")).click();
		driver.findElement(By.xpath("//table//img")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String>  li = new ArrayList<String>(windowHandles);
		driver.switchTo().window(li.get(1));
		driver.findElement(By.xpath("//a[@class='linktext']")).click();
		driver.switchTo().window(li.get(0));
		driver.findElement(By.xpath("(//table//img)[2]")).click();
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String>  li1 = new ArrayList<String>(windowHandles1);
		driver.switchTo().window(li1.get(1));		
		driver.findElement(By.xpath("(//a[@class='linktext'])[5]")).click();
		driver.switchTo().window(li1.get(0));
		driver.findElement(By.linkText("Merge")).click();
		driver.switchTo().alert().accept();
		if (driver.getTitle().contains("View"))
			System.out.println("page title verified as "+driver.getTitle());
		driver.quit();

	}

}
