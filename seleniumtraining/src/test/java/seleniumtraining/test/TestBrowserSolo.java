package seleniumtraining.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBrowserSolo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");

		System.out.println("Web Page Titile: " + driver.getTitle());
//		System.out.println("Web Page source is showed as below:");
//		System.out.println(driver.getPageSource());
		System.out.println("Sleeping...");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		System.out.println("End of Program");
	}

}
