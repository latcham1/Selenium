package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class LoginSteps extends Base
{
	@And ("Enter the username as Demosalesmanager")
	public void enterUsername()
	{	
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	}
	@Given ("Enter the username as {string}")
	//	@And ("Enter the username as {string}")
	public void enterUsername(String Uname)
	{	
		driver.findElement(By.id("username")).sendKeys(Uname);
	}
	@And ("Enter the possword as {string}")
	public void enterPassword(String pWord)
	{	
		driver.findElement(By.id("password")).sendKeys(pWord);
	}
	@And ("Enter the possword as crmsfa")
	public void enterPassword()
	{	
		driver.findElement(By.id("password")).sendKeys("crmsfa");
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
	@But ("ErrorMessage should be displayed")
	public void ErrorMessage ()
	{
		System.out.println("Not able to login");
	}
	
}