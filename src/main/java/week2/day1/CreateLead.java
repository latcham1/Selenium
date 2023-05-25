package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {
	public static void main(String[] args) {

		ChromeDriver driver =  new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("latchaminc");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Latcham");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("appasamy");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("local latcham");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Dept Latcham");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("description enter by latcham");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("a@b.com");
		WebElement stateSelection = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select state = new Select(stateSelection);
		state.selectByVisibleText("New York");
		String companyName = driver.findElement(By.id("createLeadForm_companyName")).getText();
		driver.findElement(By.className("smallSubmit")).click();
		String leadid = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (leadid.contains(companyName))
			System.out.println(leadid + "created successfully");
		else
			System.out.println("Not able to create lead");
		driver.close();
	}
}