package javaBasics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class ReadPropFile {

	static WebDriver driver;
	
	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();

		FileInputStream ip = new FileInputStream(
				"D:/Selenium-Practise/src/javaBasics/config.properties");

		prop.load(ip);

		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));

		String url = prop.getProperty("URL");
		System.out.println(url);

		String browser = prop.getProperty("browser");
		System.out.println(browser);
	}

}
