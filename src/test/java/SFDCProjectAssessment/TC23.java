package SFDCProjectAssessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TC23 extends WebdriverUtility{

	public static void main(String[] args) throws Exception {

		WebdriverLaunch("ch");
		Fileloading();
		loginFunction();
		
		waitforloadthepageElement(driver.findElement(By.xpath("(//a[contains(text(),'Leads')])[1]")));
		driver.findElement(By.xpath("(//a[contains(text(),'Leads')])[1]")).click();
		driver.findElement(By.id("tryLexDialogX")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("fcf")).click();

		WebElement dropdown = driver.findElement(By.name("fcf"));
		Select select = new Select(dropdown);
		select.selectByValue("00B5w00000D6vAJ");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='fBody']//input[@name='go']")).click();

	}

}
