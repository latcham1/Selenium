package marathon2;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class Testcase3Orderingmobile {
	private static WebElement findElementByXPath;

	public static void main(String[] args) throws IOException, InterruptedException {			
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://dev70206.service-now.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("g=Sl+bJvA99D");
		driver.findElement(By.id("sysverb_login")).click();
		Thread.sleep(3000);
		Shadow sha = new Shadow(driver);
		sha.setImplicitWait(30) ;
		sha.findElementByXPath("//div[@id='all']").click();
		//		driver.executeScript("arguments[0].click();", all);
		Thread.sleep(2000);
		sha.findElementByXPath("//span[text()='Service Catalog']").click();
		Thread.sleep(2000);

		//		driver.switchTo().frame("gsft_main");
		WebElement ifrome = sha.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(ifrome);
		driver.findElement(By.xpath("//h2[contains(text(),'Mobiles')]")).click();
		List<WebElement> arphoneBrandgs = driver.findElements(By.xpath("//a/Strong"));
		for (int i = 0; i < arphoneBrandgs.size(); i++) {
			System.out.println(arphoneBrandgs.get(i).getText());
			if(arphoneBrandgs.get(i).getText().contains("iPhone"))
			{
				System.out.println(arphoneBrandgs.get(i).getText());
				arphoneBrandgs.get(i).click();
				break;
			}
		}
		WebElement color = driver.findElement(By.id("IO:8350086e4f334200086eeed18110c7cd"));
		Select sel = new Select(color);
		sel.selectByVisibleText("Gold");
		WebElement gig = driver.findElement(By.id("IO:32e0886e4f334200086eeed18110c738"));
		Select gi = new Select(gig);
		gi.selectByVisibleText("128");
		driver.findElement(By.id("oi_order_now_button")).click();
		String requestNO = driver.findElement(By.xpath("//a[@class='linked requestItemUrl']")).getText();
		System.out.println(requestNO);
		String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
		File source = driver.getScreenshotAs(OutputType.FILE);	
		File destination = new File("./snaps/"+timestamp+".png");
		FileUtils.copyFile(source, destination);
		driver.quit();
	}
}