package SFDCProjectAssessment;

import org.openqa.selenium.By;

public class TC19 extends WebdriverUtility {

	public static void main(String[] args) throws Exception {

		WebdriverLaunch("ch");
		Fileloading();
		loginFunction();

		// Current FQ-All Opportunities
		waitforloadthepageElement(driver.findElement(By.xpath("//li[@id='Opportunity_Tab']//a[contains(text(),'Opportunities')]")));
		driver.findElement(By.xpath("//li[@id='Opportunity_Tab']//a[contains(text(),'Opportunities')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("tryLexDialogX")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//table//input[@name='go'])[2]")).click();
		Thread.sleep(2000);
		
		// Current FQ-Open Opportunities
		waitforloadthepageElement(
		driver.findElement(By.xpath("//li[@id='Opportunity_Tab']//a[contains(text(),'Opportunities')]")));
		driver.findElement(By.xpath("//li[@id='Opportunity_Tab']//a[contains(text(),'Opportunities')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("open")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[contains(text(),'Open Opportunities')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//table//input[@name='go'])[2]")).click();
		Thread.sleep(2000);

		// Current FQ-close Opportunities
		waitforloadthepageElement(
		driver.findElement(By.xpath("//li[@id='Opportunity_Tab']//a[contains(text(),'Opportunities')]")));
		driver.findElement(By.xpath("//li[@id='Opportunity_Tab']//a[contains(text(),'Opportunities')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("open")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[contains(text(),'Closed Opportunities')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//table//input[@name='go'])[2]")).click();
		Thread.sleep(2000);

		// New FQ-All Opportunities
		waitforloadthepageElement(
		driver.findElement(By.xpath("//li[@id='Opportunity_Tab']//a[contains(text(),'Opportunities')]")));
		driver.findElement(By.xpath("//li[@id='Opportunity_Tab']//a[contains(text(),'Opportunities')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("quarter_q")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@id='quarter_q']//option[3]")).click();
		driver.findElement(By.xpath("(//table//input[@name='go'])[2]")).click();
		Thread.sleep(2000);

		// New FQ-Open Opportunities
		waitforloadthepageElement(
		driver.findElement(By.xpath("//li[@id='Opportunity_Tab']//a[contains(text(),'Opportunities')]")));
		driver.findElement(By.xpath("//li[@id='Opportunity_Tab']//a[contains(text(),'Opportunities')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("quarter_q")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@id='quarter_q']//option[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("open")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[contains(text(),'Open Opportunities')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//table//input[@name='go'])[2]")).click();
		Thread.sleep(2000);
		
		//// New FQ-close Opportunities
		waitforloadthepageElement(
		driver.findElement(By.xpath("//li[@id='Opportunity_Tab']//a[contains(text(),'Opportunities')]")));
		driver.findElement(By.xpath("//li[@id='Opportunity_Tab']//a[contains(text(),'Opportunities')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("quarter_q")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@id='quarter_q']//option[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("open")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[contains(text(),'Closed Opportunities')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//table//input[@name='go'])[2]")).click();
		Thread.sleep(2000);

	}

}
