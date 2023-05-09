package week2.day1;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLeafWithMandatoryInfo {
	public static void main(String[] args) {

		ChromeDriver driver =  new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("latchaminc");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Latcham");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("appasamy");
		String companyName = driver.findElement(By.id("createLeadForm_companyName")).getText();
		driver.findElement(By.className("smallSubmit")).click();
		String leadid = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (leadid.contains(companyName))
			System.out.println(leadid + "created successfully");
		else
			System.out.println("Not able to create lead");
		driver.quit();	
	}
}
