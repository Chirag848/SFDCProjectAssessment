package SFDCProjectAssessment;

import org.openqa.selenium.By;

import SFDCProjectAssessment.WebdriverUtility;

public class TC34 extends WebdriverUtility {

	public static void main(String[] args) throws Exception {
		
		WebdriverLaunch("ch");
		Fileloading();
		loginFunction();
		waitforloadthepageElement(driver.findElement(By.id("home_Tab")));
		driver.findElement(By.id("home_Tab")).click();
		waitforloadthepageElement(driver.findElement(By.xpath("//a[contains(text(),'chirag p')]")));
		driver.findElement(By.xpath("//a[contains(text(),'chirag p')]")).click();
		Thread.sleep(3000);
		//Click on edit profile button to edit contact information
		driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img")).click();
		Thread.sleep(3000);
		//Click on About tab
		driver.switchTo().frame(driver.findElement(By.id("contactInfoContentId")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'About')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("lastName")).sendKeys(System.getProperty("TC34lastName"));
		driver.findElement(By.xpath("//input[@class='zen-btn zen-primaryBtn zen-pas']")).click();
		Thread.sleep(2000);
		
	}

}
