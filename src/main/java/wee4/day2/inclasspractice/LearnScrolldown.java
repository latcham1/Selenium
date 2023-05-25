package wee4.day2.inclasspractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnScrolldown {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://ajio.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement pament = driver.findElement(By.xpath("//div[text()='Payment Methods']"));
		Actions builder = new Actions(driver);
		builder.scrollToElement(pament).perform();
	}
}
