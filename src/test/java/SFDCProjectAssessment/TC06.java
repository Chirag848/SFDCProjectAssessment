package SFDCProjectAssessment;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TC06 extends WebdriverUtility{

	public static void main(String[] args) throws Exception {
		
		WebdriverLaunch("ch");
		Fileloading();
		loginFunction();
		waitforloadthepageElement(driver.findElement(By.id("userNavButton")));
		WebElement ele = driver.findElement(By.id("userNavButton"));
		System.out.println(ele.getText());
		ele.click();
		waitforloadthepageElement(driver.findElement(By.xpath("//a[contains(text(),'My Profile')]")));
		driver.findElement(By.xpath("//a[contains(text(),'My Profile')]")).click();
		waitforloadthepageElement(driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img")));
		Thread.sleep(2000);
		
		//Click on edit profile button to edit contact information
		driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img")).click();
		Thread.sleep(3000);
		//Click on About tab
		driver.switchTo().frame(driver.findElement(By.id("contactInfoContentId")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'About')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("lastName")).sendKeys(System.getProperty("lastName"));
		driver.findElement(By.xpath("//input[@class='zen-btn zen-primaryBtn zen-pas']")).click();
		Thread.sleep(2000);
		//Click on post link
		driver.findElement(By.xpath("(//span[contains(text(),'Post')])[1]"));
		driver.switchTo().activeElement();
		driver.findElement(By.xpath("(//span[contains(text(),'Post')])[1]")).click();
		Thread.sleep(2000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']")));
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("body")).sendKeys("Java Programming");
		Thread.sleep(2000);
		
		driver.findElement(By.id("publishersharebutton"));
		driver.switchTo().activeElement();
		driver.findElement(By.id("publishersharebutton")).click();
		Thread.sleep(2000);
		
		//Click on file link
		
		






	}

}
