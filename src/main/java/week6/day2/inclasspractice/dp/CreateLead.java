package week6.day2.inclasspractice.dp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends Base {//	@Test (invocationCount = 2 )
	@Test (dataProvider ="setData")
	public  void runCreateLead(String fName, String lName) {
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("fName");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("lName");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Testleaf")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
	}
	@DataProvider
	public String[][] setData() {
		String [][]data = new String [2][2];
		data [0][0]="Latcham";
		data [0][1]="Appasamy";
		data [1][0]="Latcham1";
		data [1][1]="Appasamy1";
		return data;

	}
}
