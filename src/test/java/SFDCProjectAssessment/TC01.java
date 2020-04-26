package SFDCProjectAssessment;

import org.openqa.selenium.By;

public class TC01 extends WebdriverUtility{

	public static void main(String[] args) {

		WebdriverLaunch("ch");
		Fileloading();
		
		try{
		waitforloadthepageElement(driver.findElement(By.id("username")));
		driver.findElement(By.id("username")).sendKeys(System.getProperty("Username"));
		driver.findElement(By.id("password")).sendKeys(System.getProperty("password"));
		driver.findElement(By.id("Login")).click();
		}catch (Exception a){
			System.out.println(a);
		}
	}

}
