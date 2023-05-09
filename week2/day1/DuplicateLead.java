package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead {
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
		String title = driver.getTitle();
		System.out.println(title  + "- is title of the page");
		driver.findElement(By.partialLinkText("Duplicate")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("latchaminc duplicate lead");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Latcham updated");
		String companyNamedup = driver.findElement(By.id("createLeadForm_companyName")).getText();
		driver.findElement(By.className("smallSubmit")).click();
		String leadidclone = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (leadidclone.contains(companyNamedup))
			System.out.println(leadidclone +" - created successfully by cloneing the lead - " +leadid);
		else
			System.out.println("Not able to create lead");
		String titleUpdate = driver.getTitle();
		System.out.println(titleUpdate  + "- is title of the page");
		driver.quit();
	}
}
