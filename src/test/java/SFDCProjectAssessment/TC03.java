package SFDCProjectAssessment;

import org.openqa.selenium.By;

public class TC03 extends WebdriverUtility{

	public static void main(String[] args) {
		WebdriverLaunch("ch");
		Fileloading();
		try{
			waitforloadthepageElement(driver.findElement(By.id("username")));
			driver.findElement(By.id("username")).sendKeys(System.getProperty("Username"));
			driver.findElement(By.id("password")).sendKeys(System.getProperty("TC2password"));
			driver.findElement(By.id("rememberUn")).click();
			driver.findElement(By.id("Login")).click();
			waitforloadthepageElement(driver.findElement(By.id("userNavLabel")));
			driver.findElement(By.id("userNavLabel")).click();
			waitforloadthepageElement(driver.findElement(By.xpath("//a[contains(text(),'Logout')]")));
			driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
			}catch (Exception a){
				System.out.println(a);
			}
		}
		

	}


