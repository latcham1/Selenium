package week4.day2.assignment;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment3SnapDeal {
	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver =  new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		WebElement brand = driver.findElement(By.xpath("//span[contains(text(),'Men')]"));
		act.moveToElement(brand).perform();
		driver.findElement(By.xpath("//span[contains(text(),'Sports Shoes')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Training Shoes')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-expand-arrow sort-arrow']")).click();
		driver.findElement(By.xpath("(//li[@data-index=1])[2]")).click();
		List<WebElement> priceSort = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
		boolean sorted = false;
		for (int i = 0; i < priceSort.size(); i++) 
			for (int k = i+1; k < priceSort.size(); k++) {			
				String price1 = priceSort.get(i).getText();
				price1= price1.replaceAll("[^0-9]", "");
				int priceint1 = Integer.parseInt(price1);
				String price2 = priceSort.get(k).getText();
				price2= price2.replaceAll("[^0-9]", "");
				int priceint2 = Integer.parseInt(price2);			
				if (priceint1<priceint2)	 
				{
					sorted = true;
				}
				else
				{
					sorted = false;
				}
			}
		if (sorted == true)
		{
			System.out.println("price sorted from low to high");
		}
		else
		{
			System.out.println("price NOT sorted from low to high");
		}
		driver.findElement(By.xpath("(//input[@class='input-filter'])[2]")).clear();
		driver.findElement(By.xpath("(//input[@class='input-filter'])[2]")).sendKeys("575",Keys.ENTER);
		Thread.sleep(3000);
		driver.executeScript("arguments[0].click();", driver.findElement(By.xpath("//a[text()=' White & Blue']")));
		Thread.sleep(3000);
		List<WebElement> filterList = driver.findElements(By.xpath("//div[@class='navFiltersPill']/a"));
		if(filterList.get(0).getText().equalsIgnoreCase("Rs. 519 - Rs. 575"))
			System.out.println("Rs. 519 - Rs. 575 - is in applied filter list: Verificaiton Done");
		if(filterList.get(1).getText().contains("White & Blue"))
			System.out.println("White & Blue - is in applied filter list: Verificaiton Done");	
		WebElement trainingShoe = driver.findElement(By.xpath("//img[@class='product-image wooble']"));
		act.moveToElement(trainingShoe).perform();
		driver.findElement(By.xpath("//div[@class='clearfix row-disc']/div")).click();
		String cost = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		String discountPercentage = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		System.out.println("discounted price ="+cost   +"and discounted % ="+discountPercentage);
		List<WebElement> shoeSnap = driver.findElements(By.xpath("//img[@alt='ASIAN White Training Shoes']"));
		for (int i = 0; i < 4; i++) {			
			String title = driver.getTitle();
			driver.executeScript("arguments[0].click();", shoeSnap.get(i));
			Thread.sleep(3000);
			String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
			File source = driver.getScreenshotAs(OutputType.FILE);	
			File destination = new File("./snaps/"+title+"_"+timestamp+".png");
			FileUtils.copyFile(source, destination);
		}
		driver.findElement(By.xpath("(//i[@class='sd-icon sd-icon-delete-sign'])[3]")).click();
		driver.quit();

	}
}

