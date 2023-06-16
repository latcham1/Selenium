package week7.day2.inclasspractice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnWebDriverWait {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.leafground.com/window.xhtml");
	driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
	Set<String> windowhandles = driver.getWindowHandles();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.numberOfWindowsToBe(3));
	System.out.println(windowhandles.size());
	driver.quit();
}
}
