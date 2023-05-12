package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2CreateContact {
	public static void main(String[] args) {		
		ChromeDriver driver = new ChromeDriver();		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("Latcham");
		driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("Appasamy");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("local latcham");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("local latcham");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Dept Latcham");
		driver.findElement(By.id("createContactForm_description")).sendKeys("description enter by latcham");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("a@b.com");
		WebElement stateSelection = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select state = new Select(stateSelection);
		state.selectByVisibleText("New York");
		System.out.println("Title of the page is : "+ driver.getTitle());
		String companyName = driver.findElement(By.xpath("//input[@id='firstNameField']")).getText();
		driver.findElement(By.className("smallSubmit")).click();
		String leadid = driver.findElement(By.id("viewContact_fullName_sp")).getText();
		if (leadid.contains(companyName))
			System.out.println(leadid + "created successfully");
		else
			System.out.println("Not able to create lead");
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("impt note created by latcham");
		driver.findElement(By.xpath("(//input[@class = 'smallSubmit'])[1]")).click();
		String title = driver.getTitle();
		System.out.println(title  + "- is title of the page");
		System.out.println(leadid  + "- updated successfully");
		driver.close();
	}
}
