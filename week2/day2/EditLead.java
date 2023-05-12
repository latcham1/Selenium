package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =  new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("latcham");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(3000);driver.findElement(By.xpath("//td/div/a[@class='linktext']")).click();
		Thread.sleep(3000);
		String pageHeader = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		if (pageHeader.equalsIgnoreCase("View Lead"))
			System.out.println("Page Header is displaying "+pageHeader+" as expected");
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("update");
		String companyName = driver.findElement(By.id("updateLeadForm_companyName")).getText();
		driver.findElement(By.className("smallSubmit")).click();
		String leadid = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (leadid.contains(companyName))
			System.out.println(leadid + "Lead updated successfully");
		else
			System.out.println("Not able to update lead");
		driver.close();
	}
}
