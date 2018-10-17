package selenium_Basics;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class actionsClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:/Sel_chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Actions moa = new Actions(driver);
		
		//driver.findElement(By.id("login")).click();
		moa.moveToElement(driver.findElement(By.linkText("ADD-ONS"))).build().perform();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("screenshot"));
		
		driver.findElement(By.linkText("Priority Check-in")).click();
		String curl = driver.getCurrentUrl();
		
		if (curl.contains("https://book.spicejet.com/RetrieveBooking.aspx?AddPriorityCheckIn=true"))
		{
			System.out.println("Priority page  clicked");
		}
		else
		{
			System.out.println("Priority page not clicked");
		}
		driver.close();
	}

}
