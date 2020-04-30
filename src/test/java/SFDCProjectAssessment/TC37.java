package SFDCProjectAssessment;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class TC37 extends WebdriverUtility {

	public static void main(String[] args) throws Exception {

		WebdriverLaunch("ch");
		Fileloading();
		loginFunction();
		waitforloadthepageElement(driver.findElement(By.id("home_Tab")));
		driver.findElement(By.id("home_Tab")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("tryLexDialogX")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='pageDescription']//a")).click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//a[contains(text(),'4:00 PM')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()", ele);
		Thread.sleep(5000);
		ele.click();
		Thread.sleep(2000);
		/*driver.findElement(By.id("tryLexDialogX")).click();
		Thread.sleep(2000);*/
		driver.findElement(By.xpath("//img[@class='comboboxIcon']")).click();
		ArrayList<String> WindowsTabs = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(WindowsTabs.size());
		driver.switchTo().window(WindowsTabs.get(1));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Other')]")).click();
		driver.switchTo().window(WindowsTabs.get(0));
		Thread.sleep(2000);
		WebElement date = driver.findElement(By.id("EndDateTime"));
		date.clear();
		Thread.sleep(2000);
		date.sendKeys("5/5/2020");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='EndDateTime_time']")).click();
		waitforloadthepageElement(driver.findElement(By.xpath("//div[@id='timePickerItem_38']")));
		driver.findElement(By.xpath("//div[@id='timePickerItem_38']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("IsRecurrence")).click();
		waitforloadthepageElement(driver.findElement(By.xpath("//label[contains(text(),'Weekly')]")));
		driver.findElement(By.xpath("//label[contains(text(),'Weekly')]")).click();
		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.id("RecurrenceEndDateOnly"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()", ele1);
		Thread.sleep(5000);
		ele1.click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//img[@class='calRight']"));
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//td[@class='weekday'][contains(text(),'30')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("save")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@class='monthViewIcon']")).click();
		

	}

}
