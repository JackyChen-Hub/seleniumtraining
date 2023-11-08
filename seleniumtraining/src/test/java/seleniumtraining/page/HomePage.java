package seleniumtraining.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HomePage {
	private WebDriver driver;
	private WebElement ele;
	private By searchBox = By.name("q");
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	public void verifyTitle() {
		String title = driver.getTitle();
		System.out.println("HomePage Title:" + title);
		Assert.assertEquals(title, "Google");
	}
	public void verifyValidity() {
		ele= driver.findElement(searchBox);
		Assert.assertEquals(ele.isDisplayed(), true);
		Assert.assertEquals(ele.isEnabled(), true);
	}
	public void verifySearch() {
		ele= driver.findElement(searchBox);
		String searchString = "Selenium Java";
		ele.sendKeys(searchString, Keys.ENTER);
		Assert.assertEquals(driver.getTitle(), searchString + " - Google Search");
	}

}
