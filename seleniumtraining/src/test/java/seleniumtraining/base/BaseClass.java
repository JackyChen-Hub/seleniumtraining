package seleniumtraining.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	WebDriver driver;

	@SuppressWarnings("deprecation")
	public WebDriver init_driver(Properties prop) {
		String browserName=prop.getProperty("browser");
		if (browserName.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		} 
		else if(browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}
		else {
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
		}
		String url=prop.getProperty("url");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("Title from BaseClass:" + driver.getTitle());
		return driver;
	}
	public Properties init_prop() {
		Properties prop = new Properties();
		FileInputStream ip;
		try {
			ip = new FileInputStream(".\\src\\test\\resources\\config.properties");
			prop.load(ip);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
	}
}
