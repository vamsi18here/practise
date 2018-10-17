package selenium_Basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class customXpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:/Sel_chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		driver.findElement(By.xpath("//input[@placeholder='Search for anything']")).sendKeys("white goods");
		driver.findElement(By.xpath("//input[contains(@value,'Search')]")).click();
	
		List <WebElement> linklist = driver.findElements(By.tagName("a"));
		System.out.println("Number of links on the page --" +linklist.size());
		
		for(int i=0;i<linklist.size();i++){
			System.out.println(linklist.get(i).getText());
		}
	}

}
