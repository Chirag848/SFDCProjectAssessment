package SFDCProjectAssessment;

import org.openqa.selenium.By;

public class TC15 extends WebdriverUtility{

	public static void main(String[] args) throws Exception {
		WebdriverLaunch("ch");
		Fileloading();
		loginFunction();
		waitforloadthepageElement(driver.findElement(By.xpath("//img[@class='allTabsArrow']")));
		driver.findElement(By.xpath("//img[@class='allTabsArrow']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='listRelatedObject opportunityBlock title']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("fcf")).click();
		
	}

}
