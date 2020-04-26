package SFDCProjectAssessment;

import org.openqa.selenium.By;

public class TC11 extends WebdriverUtility{

	public static void main(String[] args) throws Exception {

		WebdriverLaunch("ch");
		Fileloading();
		loginFunction();
		waitforloadthepageElement(driver.findElement(By.xpath("//img[@class='allTabsArrow']")));
		driver.findElement(By.xpath("//img[@class='allTabsArrow']")).click();
		
		//Click on Accounts link on the home page
		waitforloadthepageElement(driver.findElement(By.xpath("//a[@class='listRelatedObject accountBlock title']")));
		driver.findElement(By.xpath("//a[@class='listRelatedObject accountBlock title']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("tryLexDialogX")).click();
		Thread.sleep(2000);
		
		//Click on create new view link on accounts page
		driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")).click();
		waitforloadthepageElement(driver.findElement(By.id("fname")));
		driver.findElement(By.id("fname")).sendKeys(System.getProperty("TC11ViewName"));
		driver.findElement(By.id("devname")).sendKeys(System.getProperty("TC11ViewUniqueName"));
		driver.findElement(By.name("save")).click();

	}

}
