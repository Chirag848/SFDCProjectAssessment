package SFDCProjectAssessment;

import org.openqa.selenium.By;

public class TC27 extends WebdriverUtility{

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
		driver.findElement(By.id("hotlist_mode")).click();
		waitforloadthepageElement(driver.findElement(By.xpath("//option[contains(text(),'Recently Created')]")));
		driver.findElement(By.xpath("//option[contains(text(),'Recently Created')]")).click();

	}

}
