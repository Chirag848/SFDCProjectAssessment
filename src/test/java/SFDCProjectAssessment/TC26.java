package SFDCProjectAssessment;

import org.openqa.selenium.By;

public class TC26 extends WebdriverUtility{

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
		waitforloadthepageElement(driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")).click();
		waitforloadthepageElement(driver.findElement(By.id("fname")));
		driver.findElement(By.id("fname")).sendKeys(System.getProperty("TC26ViewName"));
		driver.findElement(By.id("devname")).sendKeys(System.getProperty("TC26ViewUniqueName"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='save'])[2]")).click();

	}

}
