package SFDCProjectAssessment;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class TC36 extends WebdriverUtility{

	public static void main(String[] args) throws Exception {
		WebdriverLaunch("ch");
		Fileloading();
		loginFunction();
		waitforloadthepageElement(driver.findElement(By.id("home_Tab")));
		driver.findElement(By.id("home_Tab")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Saturday April 25, 2020')]")).click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//a[contains(text(),'9:00 PM')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()", ele);
		Thread.sleep(5000);
		ele.click();
	//	js.executeAsyncScript("scroll (0,2000)");
		
		//waitforloadthepageElement(driver.findElement(By.xpath("//a[contains(text(),'9:00 PM')]")));
		//driver.findElement(By.xpath("//a[contains(text(),'9:00 PM')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("tryLexDialogX")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@class='comboboxIcon']")).click();
		ArrayList<String> WindowsTabs = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(WindowsTabs.size());
		driver.switchTo().window(WindowsTabs.get(1));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Other')]")).click();
		driver.switchTo().window(WindowsTabs.get(0));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='EndDateTime_time']")).click();
		waitforloadthepageElement(driver.findElement(By.xpath("//div[@id='timePickerItem_42']")));
		driver.findElement(By.xpath("//div[@id='timePickerItem_42']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("save")).click();
		


			

	}

}
