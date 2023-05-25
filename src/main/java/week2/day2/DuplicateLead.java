package week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class DuplicateLead {
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
		driver.findElement(By.xpath("//span[contains(text(),'Email')]")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("@c.com");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(3000);
		String firstLeadid = driver.findElement(By.xpath("//td/div/a[@class='linktext']")).getText();
		String textLeadid = driver.findElement(By.xpath("(//td/div/a[@class='linktext'])[3]")).getText();
		driver.findElement(By.xpath("(//td/div/a[@class='linktext'])[3]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Duplicate Lead')]")).click();
		Thread.sleep(3000);
		String pageHeader = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		if (pageHeader.equalsIgnoreCase("Duplicate Lead"))
			System.out.println("Page Header is display "+pageHeader+" as expected");
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(3000);
		String viewLead_firstName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if (viewLead_firstName.equalsIgnoreCase(textLeadid))
			System.out.println((driver.findElement(By.id("viewLead_companyName_sp")).getText())+ "Duplicate Lead Created Successfully by clonig of "+firstLeadid );
		driver.close();
	}
}
