package SFDCProjectAssessment;

import org.openqa.selenium.By;

public class TC31 extends WebdriverUtility{

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
		Thread.sleep(2000);
		waitforloadthepageElement(driver.findElement(By.id("fname")));
		driver.findElement(By.id("fname")).sendKeys(System.getProperty("TC31ViewName"));
		Thread.sleep(2000);
		driver.findElement(By.id("devname")).sendKeys(System.getProperty("TC29ViewUniqueName"));
		Thread.sleep(2000);
		driver.findElement(By.name("cancel")).click();


	}

}
