package marathon2;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import io.github.sukgu.Shadow;



public class Testcase2ArchitectCertifications {
	public static void main(String[] args) throws IOException, InterruptedException {


		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(ch);
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@1234");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String>  li = new ArrayList<String>(windowHandles);
		driver.switchTo().window(li.get(1));
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		Shadow shad = new Shadow(driver);
		shad.findElementByXPath("//span[text()='Learning']").click();
		Thread.sleep(2000);	
		Actions act = new Actions(driver);
		WebElement learningOnTrailhead = shad.findElementByXPath("//span[text()='Learning on Trailhead']");
		act.moveToElement(learningOnTrailhead).perform();

		WebElement sales = shad.findElementByXPath("//a[text()='Salesforce Certification']");
		driver.executeScript("arguments[0].click();", sales);
		driver.findElement(By.xpath("//div[text()='Architect']")).click();
		Thread.sleep(2000);	
		WebElement fistcert = driver.findElement(By.xpath("(//div/h1)[2]"));
		act.scrollToElement(fistcert).perform();
		System.out.println(driver.findElement(By.xpath("(//div/h1)[2]")).getText());
		List<WebElement> archCert = driver.findElements(By.xpath("//div[@class='credentials-card_title']/a"));
		for (int i = 0; i < archCert.size(); i++) {
			System.out.println((i+1)+","+archCert.get(i).getText());
		}
			
		String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
		File source = driver.getScreenshotAs(OutputType.FILE);	
		File destination = new File("./snaps/"+timestamp+".png");
		FileUtils.copyFile(source, destination);
		driver.quit();
	}
}