package SFDCProjectAssessment;

import org.openqa.selenium.By;

public class TC10 extends WebdriverUtility{

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
		
		//Click on the New button to create new account
		driver.findElement(By.name("new")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("acc2")).sendKeys(System.getProperty("TC10AccountName"));
		driver.findElement(By.id("acc6")).click();
		waitforloadthepageElement(driver.findElement(By.xpath("//option[contains(text(),'Technology Partner')]")));
		driver.findElement(By.xpath("//option[contains(text(),'Technology Partner')]")).click();
		driver.findElement(By.id("00N5w00000HXjtg")).click();
		waitforloadthepageElement(driver.findElement(By.xpath("//option[contains(text(),'High')]")));
		driver.findElement(By.xpath("//option[contains(text(),'High')]")).click();
		driver.findElement(By.name("save")).click();
	}

}
