package SFDCProjectAssessment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class TC13 extends WebdriverUtility{

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
		
		//Select accounts to merge
		driver.findElement(By.xpath("//a[contains(text(),'Merge Accounts')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("srch")).sendKeys(System.getProperty("TC11srch"));
		waitforloadthepageElement(driver.findElement(By.xpath("//input[@name='srchbutton']")));
		driver.findElement(By.xpath("//input[@name='srchbutton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("cid0")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("cid1")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='goNext']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='save']")).click();
		
		Alert al = driver.switchTo().alert();
		Thread.sleep(2000);
		al.accept();


	}

}
