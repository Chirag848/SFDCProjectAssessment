package SFDCProjectAssessment;

import org.openqa.selenium.By;

public class TC29 extends WebdriverUtility{

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
		driver.findElement(By.xpath("//tr[@class='dataRow even first']//a[1]")).click();
	}

}
