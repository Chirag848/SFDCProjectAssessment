package SFDCProjectAssessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC05 extends WebdriverUtility{

	public static void main(String[] args) {

		
		WebdriverLaunch("ch");
		Fileloading();
		loginFunction();
		waitforloadthepageElement(driver.findElement(By.id("userNavButton")));
		WebElement ele = driver.findElement(By.id("userNavButton"));
		System.out.println(ele.getText());
		ele.click();
		
	}

}
