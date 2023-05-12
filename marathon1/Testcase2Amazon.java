package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase2Amazon {
	public static void main(String[] args) {	
		ChromeDriver driver =  new ChromeDriver(); // 01) Launch Chrome  
		driver.get("https://www.amazon.in/"); // 02) Load https://www.amazon.in/
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));  // add  implicitlyWait
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags"); //		03) Type "Bags" in the Search box
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//span[contains(text(),'bags for girls')]")).click(); //
		String resCould = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']/span")).getText();		
		WebElement firstBrandCheck = driver.findElement(By.xpath("(//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left']/label/span)[3]"));
		driver.executeScript("arguments[0].click();", firstBrandCheck);
		WebElement secondBrandCheck = driver.findElement(By.xpath("(//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left']/label/span)[4]"));
		driver.executeScript("arguments[0].click();", secondBrandCheck);
		driver.findElement(By.xpath("//span[@class='a-button a-button-dropdown a-button-small']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Newest Arrivals')]")).click();
		String productInfo = driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']")).getText();
		String productPrice = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		String searchedText1 = driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']")).getText();//		05) Print the total number of results (like 50000)
		System.out.println(resCould+" "+searchedText1); 	
		System.out.println("product Info " + productInfo);
		System.out.println("Price  "+ productPrice);
		System.out.println("Page title is " + driver.getTitle());
		driver.close();
	}
}
