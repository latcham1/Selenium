package marathon2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.sukgu.Shadow;

public class Testcase3Orderingmobile {
	public static void main(String[] args) {			
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://dev70206.service-now.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Shadow shad = new Shadow(driver);
		shad.findElementByXPath("//input[@id='user_name']"));
		shad.findElement(By.xpath("//input[@id='user_password']")).sendKeys("g=Sl+bJvA99D");
		driver.findElement(By.id("sysverb_login")).click();
	

	}
}