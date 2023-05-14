package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1FacesBook {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();	
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("laxa");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("appa");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9094020939");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Harihara*1");
		WebElement dayEld = driver.findElement(By.name("birthday_day"));
		Select day = new Select(dayEld);
		day.selectByVisibleText("15");
		WebElement monEld = driver.findElement(By.name("birthday_month"));
		Select mon = new Select(monEld);
		mon.selectByVisibleText("May");
		WebElement yearEld = driver.findElement(By.name("birthday_year"));
		Select year = new Select(yearEld);
		year.selectByVisibleText("1976");
		driver.findElement(By.xpath(" //label[text()='Female'] ")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		String confirmText = driver.findElement(By.xpath("//div[@class= 'mts mbl _1v_-']")).getText();
		System.out.println(confirmText);
	}
}
