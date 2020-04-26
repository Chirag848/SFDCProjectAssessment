package SFDCProjectAssessment;

import org.openqa.selenium.By;

public class TC4B extends WebdriverUtility{

	public static void main(String[] args) {

		WebdriverLaunch("ch");
		Fileloading();
		waitforloadthepageElement(driver.findElement(By.id("username")));
		driver.findElement(By.id("username")).sendKeys("123");
		driver.findElement(By.id("password")).sendKeys("22131");
		driver.findElement(By.id("Login")).click();

	}

}
