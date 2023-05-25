package wee4.day1.inclasspractice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class LearnPromptAlertDialog {
	public static void main(String[] args) throws InterruptedException {


		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("j_idt88:j_idt104")).click();
		Alert alert = driver.switchTo().alert();
		String alertext = alert.getText();
		System.out.println("alertext  :"+ alertext);
		String inputtext ="text given by latcham";
		System.out.println("inputtext :" + inputtext);
		alert.sendKeys(inputtext);
		alert.accept();
		String confirmtext = driver.findElement(By.xpath("//span[contains(text(),'User entered name as')]")).getText();
		System.out.println("confirmtext :" + confirmtext);
		if (confirmtext.contains(inputtext))
			System.out.println("user input sent to alert successfully");
		Thread.sleep(3000);
		driver.close();
	}
}