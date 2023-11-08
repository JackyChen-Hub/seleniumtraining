package seleniumtraining.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import seleniumtraining.page.HomePage;

public class Test_MainPage extends TestBase {
	
	@Test (priority = 1)
	public void test_PageTitle() {
		
		hp.verifyTitle();
	}
	@Test (priority = 2)
	public void test_PageValidity() {
		
		hp.verifyValidity();
	}
	@Test (priority = 3)
	public void test_Search() {
	
		hp.verifySearch();
	}
}
