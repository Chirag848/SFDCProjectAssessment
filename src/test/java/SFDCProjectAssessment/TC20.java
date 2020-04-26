package SFDCProjectAssessment;

import org.openqa.selenium.By;

public class TC20 extends WebdriverUtility{

	public static void main(String[] args) throws Exception {
		WebdriverLaunch("ch");
		Fileloading();
		loginFunction();

		
		waitforloadthepageElement(driver.findElement(By.xpath("(//a[contains(text(),'Leads')])[1]")));
		driver.findElement(By.xpath("(//a[contains(text(),'Leads')])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("tryLexDialogX")).click();

		

	}

}
