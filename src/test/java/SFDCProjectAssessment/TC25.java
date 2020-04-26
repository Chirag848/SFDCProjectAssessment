package SFDCProjectAssessment;

import org.openqa.selenium.By;

public class TC25 extends WebdriverUtility{

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
		waitforloadthepageElement(driver.findElement(By.xpath("//input[@name='new']")));
		driver.findElement(By.xpath("//input[@name='new']")).click();
		waitforloadthepageElement(driver.findElement(By.id("name_lastcon2")));
		driver.findElement(By.id("name_lastcon2")).sendKeys(System.getProperty("TC25LastName"));
		waitforloadthepageElement(driver.findElement(By.id("con4")));
		driver.findElement(By.id("con4")).sendKeys(System.getProperty("TC25AccountName"));
		driver.findElement(By.xpath("(//input[@name='save'])[2]")).click();
		
		
		
		

	}

}
