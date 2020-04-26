package SFDCProjectAssessment;

import org.openqa.selenium.By;

public class TC04A extends WebdriverUtility {

	public static void main(String[] args) throws Exception {

		WebdriverLaunch("ch");
		Fileloading();
		waitforloadthepageElement(driver.findElement(By.id("username")));
		driver.findElement(By.id("username")).sendKeys(System.getProperty("Username"));
		driver.findElement(By.id("forgot_password_link")).click();
		waitforloadthepageElement(driver.findElement(By.id("un")));
		driver.findElement(By.id("un")).sendKeys(System.getProperty("Username"));
		Thread.sleep(2000);
		driver.findElement(By.id("continue")).click();

	}

}
