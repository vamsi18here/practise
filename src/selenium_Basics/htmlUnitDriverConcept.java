package selenium_Basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class htmlUnitDriverConcept {

	public static void main(String[] args) throws IOException {
	Properties prop = new Properties();
		
		FileInputStream fp = new FileInputStream("D:\\Selenium-Practise\\src\\selenium_Basics\\config.properties");
		
		prop.load(fp);
		
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));

		String url = prop.getProperty("url");
		
		System.setProperty("webdriver.chrome.driver", "D:/Sel_chromedriver/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new HtmlUnitDriver();
		driver.manage().window().maximize();		
		driver.manage().deleteAllCookies();
		driver.navigate().to(url);
		System.out.println(driver.getTitle());
	}

}
