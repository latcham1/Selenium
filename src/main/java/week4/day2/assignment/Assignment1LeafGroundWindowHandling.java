package week4.day2.assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1LeafGroundWindowHandling {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =  new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml;jsessionid=node0ohpw87cjok1dz9p1fgudvj6l12019.node0");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List <String>	list1= new ArrayList<String>(windowHandles);
		driver.switchTo().window(list1.get(1));
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		driver.switchTo().window(list1.get(0));
		//		 -------------------
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		System.out.println(windowHandles2.size()+"windows opened by clicking open multiple button");
		driver.quit();
		ChromeDriver driver2 =  new ChromeDriver();
		driver2.get("https://leafground.com/window.xhtml;jsessionid=node0ohpw87cjok1dz9p1fgudvj6l12019.node0");
		driver2.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver2.manage().window().maximize();
		driver2.findElement(By.xpath("//span[text()='Close Windows']")).click();
		Thread.sleep(3000);
		Set<String> windowHandles3 = driver2.getWindowHandles();
		System.out.println(windowHandles3.size()-1+"windows opened by clicking close except primay");
		List<String>  li = new ArrayList<String>(windowHandles3);
		for (int i = 1; i < li.size(); i++) {	
			System.out.println(driver2.switchTo().window(li.get(i)).getTitle());
			driver2.switchTo().window(li.get(i)).close();			
		}
		System.out.println("all the window closed except parent");
		driver2.switchTo().window(li.get(0));
		driver2.findElement(By.xpath("//span[text()='Open with delay']")).click();
		Thread.sleep(3000);
		Set<String> windowHandles4 = driver2.getWindowHandles();
		System.out.println(windowHandles4.size()+"windows opened by clicking Open with delay button");
		driver2.quit();
	}
}