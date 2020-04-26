package SFDCProjectAssessment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class TC07 extends WebdriverUtility{

	public static void main(String[] args) throws Exception {

		WebdriverLaunch("ch");
		Fileloading();
		loginFunction();
		waitforloadthepageElement(driver.findElement(By.id("userNavLabel")));
		driver.findElement(By.id("userNavLabel")).click();
		waitforloadthepageElement(driver.findElement(By.xpath("//a[contains(text(),'My Settings')]")));
		driver.findElement(By.xpath("//a[contains(text(),'My Settings')]")).click();
		Thread.sleep(2000);
		
		//Click on personal link and select Login History link. 
		//waitforloadthepageElement(driver.findElement(By.id("PersonalInfo_child")));
		/*driver.findElement(By.id("PersonalInfo_font")).click();
		waitforloadthepageElement(driver.findElement(By.id("LoginHistory_font")));
		driver.findElement(By.id("LoginHistory_font")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Download login history for last six months, includ')]")).click();
		Thread.sleep(2000);*/
		
		//Click on Display & Layout link
		/*driver.findElement(By.id("DisplayAndLayout")).click();
		waitforloadthepageElement(driver.findElement(By.id("CustomizeTabs_font")));
		driver.findElement(By.id("CustomizeTabs_font")).click();
		waitforloadthepageElement(driver.findElement(By.id("p4")));
		driver.findElement(By.id("p4")).click();
		waitforloadthepageElement(driver.findElement(By.xpath("//option[contains(text(),'Salesforce Chatter')]")));
		driver.findElement(By.xpath("//option[contains(text(),'Salesforce Chatter')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("duel_select_0")).click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//option[contains(text(),'Reports')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()", ele);
		waitforloadthepageElement(ele);
		ele.click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@class='rightArrowIcon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("save")).click();
		Thread.sleep(2000);*/
		
		//Click on Email link and click on my email settings link 
		/*driver.findElement(By.id("EmailSetup")).click();
		waitforloadthepageElement(driver.findElement(By.id("EmailSettings_font")));
		driver.findElement(By.id("EmailSettings_font")).click();
		waitforloadthepageElement(driver.findElement(By.id("sender_name")));
		driver.findElement(By.id("sender_name")).sendKeys(System.getProperty("SenderName"));
		driver.findElement(By.id("sender_email")).sendKeys(System.getProperty("senderemail"));
		driver.findElement(By.name("save")).click();
		Thread.sleep(2000);*/
		
		//Click on Calendar & Remainders
		driver.findElement(By.id("CalendarAndReminders")).click();
		waitforloadthepageElement(driver.findElement(By.id("Reminders_font")));
		driver.findElement(By.id("Reminders_font")).click();
		waitforloadthepageElement(driver.findElement(By.id("testbtn")));
		driver.findElement(By.id("testbtn")).click();
		Thread.sleep(2000);
		
	}

}
