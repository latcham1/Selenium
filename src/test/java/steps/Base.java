package steps;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;

public class Base extends AbstractTestNGCucumberTests 
{
	public static ChromeDriver driver;
	//public static ChromeOptions options;
	@BeforeMethod
	public void precondition()
	{
		//	options = new ChromeOptions();
		//	options.addArguments("--remote-allow-origins=*");
		driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
	}
	@AfterMethod
	public void precodition() throws InterruptedException
	{
		driver.quit();
	}
}

