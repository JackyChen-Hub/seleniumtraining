package seleniumtraining.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import seleniumtraining.base.BaseClass;
import seleniumtraining.page.HomePage;

public class TestBase {
	WebDriver driver;
	BaseClass bc;
	HomePage hp;
	

	@BeforeTest
	public void setup() {
		
		bc = new BaseClass();
		driver = bc.init_driver(bc.init_prop());
		hp = new HomePage(driver);
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
		System.out.println("Driver Quit from AfterTest");
	}
	

}
