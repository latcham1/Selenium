package wee4.day2.Assignment;

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
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4Amazon {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver =  new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro", Keys.ENTER);
		String price = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println("first product price is : "+price);
		String customerReview = driver.findElement(By.xpath("//span[@class='a-icon-alt']")).getText();
		System.out.println("first product customerReview is : "+customerReview);
		driver.findElement(By.xpath("//span[@class='a-price-whole']")).click();
		Thread.sleep(3000);
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(1));
		String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
		File source = driver.getScreenshotAs(OutputType.FILE);	
		File destination = new File("./snaps/"+timestamp+".png");
		FileUtils.copyFile(source, destination);
		driver.executeScript("arquments[0], click()", driver.findElement(By.xpath("//span[text()='Add to Cart']")));
		String grandTotal = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText();
		if(price.equalsIgnoreCase(grandTotal))
			System.out.println("Subtotal Verificaiton is successful");
		driver.quit();

	}
}