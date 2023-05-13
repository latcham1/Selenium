package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLeafWithMandatoryInfo {
	public static void main(String[] args) {
		
	ChromeDriver driver =  new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps");
	driver.findElement(By.id("username")).sendKeys("demoSalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).clear();
	driver.findElement(By.partialLinkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.name("companyName")).sendKeys("latcham");
	driver.findElement(By.name("firstName")).sendKeys("latcham");
	
	
	
	}
	

}
