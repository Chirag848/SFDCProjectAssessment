package SFDCProjectAssessment;

import org.openqa.selenium.By;

public class TC12 extends WebdriverUtility{

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
		
		//Select the <view name> from the view drop down list on the account page to edit
		driver.findElement(By.id("fcf")).click();
		waitforloadthepageElement(driver.findElement(By.xpath("//option[contains(text(),'jjkkk')]")));
		driver.findElement(By.xpath("//option[contains(text(),'jjkkk')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(text(),'Edit')])[1]")).click();
		
		//Edit the view
		Thread.sleep(2000);
		driver.findElement(By.id("fname")).sendKeys(System.getProperty("TC12ViewName"));
		
		driver.findElement(By.id("fcol2")).click();
		waitforloadthepageElement(driver.findElement(By.xpath("//select[@id='fcol1']//option[contains(text(),'Account Name')]")));
		driver.findElement(By.xpath("//select[@id='fcol1']//option[contains(text(),'Account Name')]")).click();
		driver.findElement(By.id("fop2")).click();
		waitforloadthepageElement(driver.findElement(By.xpath("//select[@id='fop2']//option[contains(text(),'contains')]")));
		driver.findElement(By.xpath("//select[@id='fop2']//option[contains(text(),'contains')]")).click();
		driver.findElement(By.id("fval2")).sendKeys(System.getProperty("TC12Value"));
		driver.findElement(By.name("save")).click();
		
		
		

	}

}
