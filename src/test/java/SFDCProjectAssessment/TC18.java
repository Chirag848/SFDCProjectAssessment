package SFDCProjectAssessment;

import org.openqa.selenium.By;

public class TC18 extends WebdriverUtility{

	public static void main(String[] args) throws Exception {

			WebdriverLaunch("ch");
			Fileloading();
			loginFunction();
			waitforloadthepageElement(driver.findElement(By.xpath("//li[@id='Opportunity_Tab']//a[contains(text(),'Opportunities')]")));
			driver.findElement(By.xpath("//li[@id='Opportunity_Tab']//a[contains(text(),'Opportunities')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("tryLexDialogX")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Stuck Opportunities')]")).click();


	}

}
