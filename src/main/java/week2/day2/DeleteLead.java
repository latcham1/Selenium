package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class DeleteLead {
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
		driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(3000);
		String textLeadid = driver.findElement(By.xpath("//td/div/a[@class='linktext']")).getText();
		driver.findElement(By.xpath("//td/div/a[@class='linktext']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(textLeadid);
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(3000);
		String norecord = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		if(norecord.equalsIgnoreCase("No records to display"))
			System.out.println("No records found, So "+textLeadid+ " Lead id deleted successfully");
		else
			System.out.println("record not deleted");
		driver.close();
	
	}
}