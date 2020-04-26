package SFDCProjectAssessment;

import org.openqa.selenium.By;

public class TC28 extends WebdriverUtility{

	public static void main(String[] args) throws Exception {

		WebdriverLaunch("ch");
		Fileloading();
		loginFunction();
		waitforloadthepageElement(driver.findElement(By.xpath("//li[@id='AllTab_Tab']")));
		driver.findElement(By.xpath("//li[@id='AllTab_Tab']")).click();
		waitforloadthepageElement(driver.findElement(By.xpath("//a[@class='listRelatedObject contactBlock title']")));
		driver.findElement(By.xpath("//a[@class='listRelatedObject contactBlock title']")).click();
		driver.findElement(By.id("tryLexDialogX")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("fcf")).click();
		waitforloadthepageElement(driver.findElement(By.xpath("//option[contains(text(),'My Contacts')]")));
		driver.findElement(By.xpath("//option[contains(text(),'My Contacts')]")).click();

	}

}
