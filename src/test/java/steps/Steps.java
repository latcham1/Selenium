package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class Steps 
{
	ChromeDriver driver;
	@Given ("Open the chrome browser")
	public void openBrowser()
	{	
		driver= new ChromeDriver();
	}
	@And ("Load the url")
	public void loadUrl()
	{	
		driver.get("http://leaftaps.com/opentaps/control/main");
	}
	@And ("Enter the username as Demosalesmanager")
	public void enterUsername(String uName)
	{	
		driver.findElement(By.id("username")).sendKeys(uName);
	}
	@And ("Enter the possword as crmsfa")
	public void enterPassword(String pWord)
	{	
		driver.findElement(By.id("password")).sendKeys(pWord);
	}
	@When ("Click on Login button")
	public void clickLoginButton()
	{	
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Then ("HomePage should be displayed")
	public void verifyHomePage()
	{	
		System.out.println("logged in successfully");
	}
}