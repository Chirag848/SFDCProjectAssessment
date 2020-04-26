package SFDCProjectAssessment;

import org.openqa.selenium.By;

public class TC09 extends WebdriverUtility{

	public static void main(String[] args) {
		WebdriverLaunch("ch");
		Fileloading();
		loginFunction();
		waitforloadthepageElement(driver.findElement(By.id("userNavLabel")));
		driver.findElement(By.id("userNavLabel")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();

		

	}

}
