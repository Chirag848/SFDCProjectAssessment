package SFDCProjectAssessment;

import org.openqa.selenium.By;

import SFDCProjectAssessment.WebdriverUtility;

public class TC33 extends WebdriverUtility{

	public static void main(String[] args) {
		
		WebdriverLaunch("ch");
		Fileloading();
		loginFunction();
		waitforloadthepageElement(driver.findElement(By.id("home_Tab")));
		driver.findElement(By.id("home_Tab")).click();
		waitforloadthepageElement(driver.findElement(By.xpath("//a[contains(text(),'chirag p')]")));
		driver.findElement(By.xpath("//a[contains(text(),'chirag p')]")).click();
	}

}
