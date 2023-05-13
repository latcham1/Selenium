package week2.day2;

import java.io.ObjectOutputStream.PutField;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class ButtonVerification {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[contains(text(),'Click')]")).click();
		System.out.println("page title" +driver.getTitle());
		driver.navigate().back();
		boolean enabled = driver.findElement(By.id("j_idt88:j_idt92")).isEnabled();
		if (enabled==false)
			System.out.println("button is disabled");
		else
			System.out.println("button is enabled");
		System.out.println("Submit button position is " +driver.findElement(By.xpath("//span[contains(text(),'Submit')]")).getLocation());
		String rgbColor =driver.findElement(By.xpath("//span[contains(text(),'Save')]")).getCssValue("color");
		System.out.println("Save button RGB Color is " + rgbColor);
		System.out.println("Save button  asHex color is " + Color.fromString(rgbColor).asHex());
		Dimension size = driver.findElement(By.xpath("(//span[contains(text(),'Submit')])[2]")).getSize();
		System.out.println("submit button height and width is "+ size);
		driver.findElement(By.xpath("//span[contains(text(),'Image')]")).click();
		WebElement hiddenButton = driver.findElement(By.id("j_id1:javax.faces.ViewState:4"));
		driver.executeScript("arguments[0].click();", hiddenButton);
		System.out.println("hidden button clicked");
		System.out.println("total rounded button is " +  driver.findElements(By.xpath(" //* [contains (@class, 'rounded-button')]")).size());
	}
}
