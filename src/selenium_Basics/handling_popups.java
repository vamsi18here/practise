package selenium_Basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handling_popups {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/Sel_chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Alert alert =  driver.switchTo().alert();
		
		System.out.println(alert.getText());
		String msg = alert.getText();
		
		if(msg.equals("Please enter a valid user name")) {
			System.out.println("Msg verified");
		}
		else{
			System.out.println("wrong msg");
		}
		
		alert.accept();
		driver.quit();
		
	}

}
