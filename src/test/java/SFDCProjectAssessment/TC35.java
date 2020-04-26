package SFDCProjectAssessment;

import org.openqa.selenium.By;

public class TC35 extends WebdriverUtility{

	public static void main(String[] args) throws Exception {

		WebdriverLaunch("ch");
		Fileloading();
		loginFunction();
		waitforloadthepageElement(driver.findElement(By.xpath("//li[@id='AllTab_Tab']")));
		driver.findElement(By.xpath("//li[@id='AllTab_Tab']")).click();
		waitforloadthepageElement(driver.findElement(By.name("customize")));
		driver.findElement(By.name("customize")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[contains(text(),'Libraries')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@class='leftArrowIcon']")).click();
		driver.findElement(By.name("save")).click();
		Thread.sleep(1000);
		LogoutFunction();
		loginFunction();

	}

}
