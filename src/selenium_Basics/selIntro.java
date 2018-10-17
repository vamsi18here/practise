package selenium_Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class selIntro {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:/Sel_chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.nab.com.au/");
		WebElement login_dd = driver.findElement(By.id("login"));
		login_dd.click();
		//driver.wait(1000);
		
//		WebDriverWait webDriverWait = new WebDriverWait(driver, 10);
//		webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"header-container\"]/header/div[4]/div/nav./ul/li[2]/a")));
		
		//WebElement nabcon = driver.findElement(By.xpath("//a[contains(text(), 'NAB Connect']"));
		//Actions action = new Actions(driver);
		//action.moveToElement(login_dd).build().perform();
		//driver.wait();
		driver.wait(1000);
		
		//WebElement dri= driver.findElement(By.xpath("//a[@href = 'https://www.nab.com.au/cgi-bin/nabconnect/nc_start.pl?browser=correct']"));
		//System.out.println(dri);
//		driver.wait(1000);
//		dri.click();
		WebElement loginNav = driver.findElement(By.cssSelector("nav.login-options.desktop"));
		List<WebElement> options = loginNav.findElements(By.tagName("a"));
		
		
		//driver.findElement(By.xpath("//*[@id=\"header-container\"]/header/div[4]/div/nav./ul/li[2]/a")).click();
		
	}

}
