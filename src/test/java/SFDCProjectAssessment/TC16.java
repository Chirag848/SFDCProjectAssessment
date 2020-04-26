package SFDCProjectAssessment;

import org.openqa.selenium.By;

public class TC16 extends WebdriverUtility {

	public static void main(String[] args) throws Exception {

		WebdriverLaunch("ch");
		Fileloading();
		loginFunction();
		waitforloadthepageElement(driver.findElement(By.xpath("//li[@id='Opportunity_Tab']//a[contains(text(),'Opportunities')]")));
		driver.findElement(By.xpath("//li[@id='Opportunity_Tab']//a[contains(text(),'Opportunities')]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[@class='listRelatedObject opportunityBlock title']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.id("tryLexDialogX")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='new']")).click();
		Thread.sleep(2000);
		waitforloadthepageElement(driver.findElement(By.id("opp3")));
		driver.findElement(By.id("opp3")).sendKeys(System.getProperty("OpportunityName"));
		Thread.sleep(1000);
		
		driver.findElement(By.id("opp4")).sendKeys(System.getProperty("AccountName"));
		Thread.sleep(1000);
		
		driver.findElement(By.id("opp5")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[contains(text(),'Existing Customer - Upgrade')]")).click();
		driver.findElement(By.id("opp6")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[contains(text(),'Web')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("opp9")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//td[contains(text(),'15')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("opp11")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[contains(text(),'Prospecting')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("opp12")).sendKeys(System.getProperty("Probability"));
		Thread.sleep(1000);
		driver.findElement(By.id("opp17")).sendKeys(System.getProperty("PrimaryCampaignSource"));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@name='save']")).click();
		
		
		
		
		
		
	}

}
