package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends Base{
	@When("Click on the Leads Link")
	public void click_on_the_leads_link()
		{
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
	}
	@Given("Enter the complayName as (.*)$")
	public void enter_the_complay_name_as_complary_name(String cname) 
	{
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
	}
	@Given("Enter the firstname as (.*)$")
	public void enter_the_firstname_as_first_name(String fname) 
	{
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
	}
	@Given("Enter the lastname as (.*)$")
	public void enter_the_lastname_as_last_name(String lname) 
	{
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
	}
	@When("Click on Submit button")
	public void click_on_submit_button()
	{
		driver.findElement(By.name("submitButton")).click();
	}
	@Then("ViewLeadsPage should be displayed")
	public void view_leads_page_should_be_displayed() 
	{
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("RaghavHari")) 
		{
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
	}
}
