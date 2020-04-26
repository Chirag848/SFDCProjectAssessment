package SFDCProjectAssessment;

import java.util.ArrayList;

import org.openqa.selenium.By;

public class TC08 extends WebdriverUtility{

	public static void main(String[] args) throws Exception {

		WebdriverLaunch("ch");
		Fileloading();
		loginFunction();
		waitforloadthepageElement(driver.findElement(By.id("userNavLabel")));
		driver.findElement(By.id("userNavLabel")).click();
		//Click on Developer Console link from the drop down
		waitforloadthepageElement(driver.findElement(By.xpath("//a[@class='debugLogLink menuButtonMenuLink']")));
		driver.findElement(By.xpath("//a[@class='debugLogLink menuButtonMenuLink']")).click();
		ArrayList<String> windowtabs = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(windowtabs.size());
		driver.switchTo().window(windowtabs.get(1));
		Thread.sleep(2000);
		//Click on close button the developer console browser
		driver.close();

	}

}
