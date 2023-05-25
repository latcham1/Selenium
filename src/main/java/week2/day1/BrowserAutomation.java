package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;


public class BrowserAutomation {
	public static void main(String[] args) {
		ChromeDriver driverc= new ChromeDriver();
		EdgeDriver drivere =  new EdgeDriver();
		SafariDriver drivers =  new SafariDriver();
		drivers.get("https://www.facebook.com/");
		drivere.get("https://www.facebook.com/");
		driverc.get("https://www.facebook.com/");
		
	}
}
