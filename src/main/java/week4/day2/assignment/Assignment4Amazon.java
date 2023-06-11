package week4.day2.assignment;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment4Amazon {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver =  new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro", Keys.ENTER);
		String price = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println("first product price is : "+price);
		WebElement custREview = driver.findElement(By.xpath("(//a[@class='a-popover-trigger a-declarative']//span)[1]"));
		driver.executeScript("arguments[0].click();", custREview);
		String customerReview = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-beside-button a-text-bold']")).getText();
		System.out.println("customer Rating :" +customerReview);
		driver.findElement(By.xpath("//img[@class='s-image']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(1));
		String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
		File source = driver.getScreenshotAs(OutputType.FILE);	
		File destination = new File("./snaps/"+timestamp+".png");
		FileUtils.copyFile(source, destination);
		driver.executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@id='add-to-cart-button']")));
		String subTotalAmount = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText();
		System.out.println(subTotalAmount);
		if(price.contains(subTotalAmount))			
			System.out.println("Subtotal Verificaiton is successful");
		driver.quit();
	}
}