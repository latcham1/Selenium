package wee4.day2.Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment2Nykaa {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =  new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		WebElement brand = driver.findElement(By.xpath("//a[text()='brands']"));
		act.moveToElement(brand).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Oreal Paris')]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String>  li = new ArrayList<String>(windowHandles);
		driver.switchTo().window(li.get(1));
		if (driver.getTitle().contains("L'Oreal Paris"))
		{
			System.out.println(driver.getTitle() +"- title verified as L'Oreal Paris");
		}
		driver.findElement(By.xpath("//span[contains(text(),'Sort By')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'customer top')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Category')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Hair')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Hair Care')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Shampoo')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Concern')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Color Protection')]")).click();
		List<WebElement> filterList = driver.findElements(By.xpath("//span[@class='filter-value']"));
		for (int i = 0; i < filterList.size(); i++) {
			if (filterList.get(i).getText().contains("Shampoo")) {
				System.out.println("Verified that Shampoo applied in filter list");		
			}
		}
		driver.findElement(By.xpath("//div[contains(text(),'Oreal Paris Colour Protect Shampoo')]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(1));
		driver.findElement(By.xpath("//span[contains(text(),'180ml')]")).click();
		String MRP = driver.findElement(By.xpath("//span[@class='css-1jczs19']")).getText();
		System.out.println("MRP: "+MRP);
		driver.findElement(By.xpath("//span[contains(text(),'Add to Bag')]")).click();
		driver.findElement(By.xpath("//span[@class='cart-count']")).click();
		String grandTotal = driver.findElement(By.xpath("//span[@class='css-1um1mkq e171rb9k3']")).getText();
		System.out.println("Grand Total" + grandTotal);
		driver.findElement(By.xpath("//span[contains(text(),'Proceed')]")).click();
		driver.findElement(By.xpath("//button[@class='close-btn']")).click();
		driver.quit();
	}
}