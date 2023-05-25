package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {
	public static void main(String[] args) {
		ChromeDriver driver =  new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("j_idt88:name")).clear();
		driver.findElement(By.id("j_idt88:name")).sendKeys("Latcham Appasamy");
		driver.findElement(By.id("j_idt88:j_idt91")).sendKeys("Latcham Appasamy");
		driver.findElement(By.id("j_idt88:j_idt95")).clear();
		driver.findElement(By.id("j_idt88:j_idt99")).clear();
		driver.findElement(By.id("j_idt88:j_idt99")).sendKeys("Latcham.Appasamy@gmail.com");
		driver.findElement(By.id("j_idt88:j_idt101")).sendKeys("this is latcham, over 17 years of experience");
		
}
}