package selenium_Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingFrames {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:/Sel_chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		
		driver.navigate().to("https://www.freecrm.com");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("vamsi18here");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("1staugust");
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
		
		
		driver.switchTo().frame("mainpanel");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		
		driver.quit();

	}

}
