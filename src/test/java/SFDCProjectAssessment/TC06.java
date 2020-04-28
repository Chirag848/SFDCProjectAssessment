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
		driver.switchTo().defaultContent();
		driver.switchTo().activeElement();
		waitforloadthepageElement(driver.findElement(By.id("publishersharebutton")));
		driver.findElement(By.id("publishersharebutton")).click();
		Thread.sleep(2000);
		
		//Click on file link
		waitforloadthepageElement(driver.findElement(By.xpath("(//span[contains(text(),'File')])[1]")));
		driver.findElement(By.xpath("(//span[contains(text(),'File')])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("chatterUploadFileActionPanel")).click();
		waitforloadthepageElement(driver.findElement(By.id("chatterFile")));
		//Thread.sleep(5000);
		driver.findElement(By.id("chatterFile")).sendKeys("C:\\Users\\chirag\\Desktop\\IMP\\uploadfile.docx");
		Thread.sleep(5000);
		
		//Click on Add photo link
		
		WebElement ele2 = driver.findElement(By.xpath("//span[@id='displayBadge']"));
		Actions act = new Actions(driver);
		act.moveToElement(ele2).build().perform();
		driver.findElement(By.id("uploadLink")).click();
		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.id("uploadPhotoContentId"));
		driver.switchTo().frame(ele1);
		Thread.sleep(2000);
		driver.findElement(By.id("j_id0:uploadFileForm:uploadInputFile")).sendKeys("C:\\Users\\chirag\\Desktop\\IMP\\image.JPG");
		Thread.sleep(5000);
		driver.findElement(By.id("j_id0:uploadFileForm:photoVisibility")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("j_id0:uploadFileForm:uploadBtn")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("j_id0:j_id7:save")).click();
		
	}

	}


