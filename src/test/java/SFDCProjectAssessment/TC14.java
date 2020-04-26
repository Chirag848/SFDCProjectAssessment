package SFDCProjectAssessment;

import org.openqa.selenium.By;

public class TC14 extends WebdriverUtility{

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
		
		//Create account report
		driver.findElement(By.xpath("//a[contains(text(),'Accounts with last activity > 30 days')]")).click();
		waitforloadthepageElement(driver.findElement(By.id("ext-gen20")));
		driver.findElement(By.id("ext-gen20")).click();
		waitforloadthepageElement(driver.findElement(By.xpath("//div[contains(text(),'Created Date')]")));
		driver.findElement(By.xpath("//div[contains(text(),'Created Date')]")).click();
		driver.findElement(By.id("ext-gen152")).click();
		waitforloadthepageElement(driver.findElement(By.xpath("//span[contains(text(),'26')]")));
		driver.findElement(By.xpath("//span[contains(text(),'26')]")).click();
		Thread.sleep(2000);
		
		//Save report
		driver.findElement(By.id("ext-gen49")).click();
		waitforloadthepageElement(driver.findElement(By.id("saveReportDlg_reportNameField")));
		driver.findElement(By.id("saveReportDlg_reportNameField")).sendKeys(System.getProperty("TC14ReportName"));
		driver.findElement(By.id("saveReportDlg_DeveloperName")).sendKeys(System.getProperty("TC14ReportUniqueName"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//table[@id='dlgSaveReport']//td[@class='x-btn-mc']")).click();
		
	}

}
