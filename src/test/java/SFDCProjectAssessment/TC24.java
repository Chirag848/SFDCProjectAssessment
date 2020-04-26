package SFDCProjectAssessment;

import org.openqa.selenium.By;

public class TC24 extends WebdriverUtility{

	public static void main(String[] args) throws Exception {

		WebdriverLaunch("ch");
		Fileloading();
		loginFunction();
		
		waitforloadthepageElement(driver.findElement(By.xpath("(//a[contains(text(),'Leads')])[1]")));
		driver.findElement(By.xpath("(//a[contains(text(),'Leads')])[1]")).click();
		driver.findElement(By.id("tryLexDialogX")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='new']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("name_lastlea2")).sendKeys(System.getProperty("TC24LastName"));
		driver.findElement(By.id("lea3")).sendKeys(System.getProperty("TC24Company"));
		driver.findElement(By.xpath("(//input[@name='save'])[2]")).click();
	}

}
